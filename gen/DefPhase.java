import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import java.util.ArrayList;

public class DefPhase extends lulu2BaseListener {

    UniversalScope globalScope = new UniversalScope();
    Scope currentScope = globalScope;
    ParseTreeProperty<Scope> scopes = new ParseTreeProperty<>();
    public StringBuffer errors = new StringBuffer();

    @Override
    public void enterProgram(lulu2Parser.ProgramContext ctx) {
        scopes.put(ctx, globalScope);
    }

    @Override
    public void enterFun_def(lulu2Parser.Fun_defContext ctx) {
        String funcName = ctx.ID().getText();

        FunctionSymbol functionSymbol = new FunctionSymbol(funcName, currentScope);

        if (ctx.args_var(0) != null) {
            int num = ctx.args_var(0).args_var_def().size();//?
            for (int i = 0; i < num; i++) {
                String typeName = ctx.args_var(0).args_var_def(i).type().getText();
                String symbolName = ctx.args_var(0).args_var_def(i).ID().getText();
                int size = ctx.args_var(0).args_var_def(i).array_dcl().size();
                Symbol symbol = createSymbol(symbolName, typeName, new ArrayList<>(),size, false);
                functionSymbol.addOutput(symbol);
            }
        }

        if (ctx.args_var(1) != null) {
            int num = ctx.args_var(1).args_var_def().size();
            for (int i = 0; i < num; i++) {
                String typeName = ctx.args_var(1).args_var_def(i).type().getText();
                String symbolName = ctx.args_var(1).args_var_def(i).ID().getText();
                int size = ctx.args_var(1).args_var_def(i).array_dcl().size();
                Symbol symbol = createSymbol(symbolName, typeName, new ArrayList<>(),size, false);
                functionSymbol.addInput(symbol);
            }
        }
        currentScope.define(functionSymbol);
        currentScope = functionSymbol;
        scopes.put(ctx, currentScope);
    }

    private Symbol createSymbol(String symbolName, String typeName, ArrayList<Integer> dimensionSize, int numOfDimension, boolean constAttr) {
        Symbol symbol;
        if (CheckVariables.isReserved(typeName)) {

            Type type;
            if (numOfDimension != 0)
                type = new ArrayType(new BuiltInType(typeName), numOfDimension ,dimensionSize);
            else
                type = new BuiltInType(typeName);

            symbol = new Symbol(symbolName, type, constAttr);
        } else {
            Type type;
            if (numOfDimension != 0)
                type = new ArrayType(new UserDefinedTypesSymbol(typeName), numOfDimension, dimensionSize
                );
            else
                type = new UserDefinedTypesSymbol(typeName);

            symbol = new Symbol(symbolName, type, constAttr);
        }

        return symbol;
    }

    @Override
    public void exitFun_def(lulu2Parser.Fun_defContext ctx) {
        currentScope = currentScope.getEnclosingScope();
    }

    @Override
    public void enterType_def(lulu2Parser.Type_defContext ctx) {
        String name = ctx.ID(0).getText();
        String superType = null;
        if (ctx.ID(1) != null)
            superType = ctx.ID(1).getText();
        UserDefinedTypesSymbol symbol = new UserDefinedTypesSymbol(name, currentScope, superType);
        currentScope.define(symbol);
        currentScope = symbol;
        scopes.put(ctx, symbol);
    }

    @Override
    public void exitType_def(lulu2Parser.Type_defContext ctx) {
        currentScope = currentScope.getEnclosingScope();
    }

    @Override
    public void enterVar_def(lulu2Parser.Var_defContext ctx) {
        if (currentScope instanceof UserDefinedTypesSymbol) return;
        String typeName = ctx.type().getText();
        int num = ctx.var_val().size();

        for (int i = 0; i < num; i++) {
            String symName = ctx.var_val(i).ID(0).getText();
            if (currentScope.innerResolve(symName) == null) {
                int size = ctx.var_val(i).Int_const().size();
                ArrayList<Integer> a = new ArrayList<>();
                for (int j = 0; j <size; j++) {
                    a.add(new Integer(ctx.var_val(i).Int_const(j).getText()));
                }
                Symbol sym;
                if(ctx.CONST() != null) {
                    sym = createSymbol(symName, typeName, a, a.size(), true);
                } else {
                    sym = createSymbol(symName, typeName, a, a.size(), false);
                }
                currentScope.define(sym);
            }
        }
    }

    @Override
    public void enterComponent(lulu2Parser.ComponentContext ctx) {
        if (ctx.var_def() == null) return;
        String typeName = ctx.var_def().type().getText();
        int num = ctx.var_def().var_val().size();

        for (int i = 0; i < num; i++) {
            String symName = ctx.var_def().var_val(i).ID(0).getText();
            if (currentScope.innerResolve(symName) == null) {
                int size = ctx.var_def().var_val(i).Int_const().size();
                ArrayList<Integer> a = new ArrayList<>();
                for (int j = 0; j < size; j++) {
                    a.add(new Integer(ctx.var_def().var_val(i).Int_const(j).getText()));
                }
                Symbol sym;
                if (ctx.var_def().CONST() != null) {
                    sym = createSymbol(symName, typeName, a, a.size(), true);
                } else {
                    sym = createSymbol(symName, typeName, a, a.size(), false);
                }
                if(ctx.access_modifier() != null)
                    currentScope.define(sym, ctx.access_modifier().getText());
                else
                    currentScope.define(sym);
            }
        }
    }

    @Override
    public void enterIf_stmt(lulu2Parser.If_stmtContext ctx) {
        IfScope ifScope = new IfScope("If", currentScope);
        currentScope = ifScope;
        scopes.put(ctx, ifScope);
    }

    @Override
    public void exitIf_stmt(lulu2Parser.If_stmtContext ctx) {
        currentScope = currentScope.getEnclosingScope();
    }

    @Override
    public void enterElse_stmt(lulu2Parser.Else_stmtContext ctx) {
        IfScope elseScope = new IfScope("Else", currentScope);
        currentScope = elseScope;
        scopes.put(ctx, elseScope);
    }

    @Override
    public void enterCase_stmt(lulu2Parser.Case_stmtContext ctx) {
        IfScope caseScope = new IfScope("Case", currentScope);
        currentScope = caseScope;
        scopes.put(ctx, caseScope);
    }

    @Override
    public void exitCase_stmt(lulu2Parser.Case_stmtContext ctx) {
        currentScope = currentScope.getEnclosingScope();
    }

    @Override
    public void enterDefault_stmt(lulu2Parser.Default_stmtContext ctx) {
        IfScope defaultScope = new IfScope("Default", currentScope);
        currentScope = defaultScope;
        scopes.put(ctx, defaultScope);
    }

    @Override
    public void exitDefault_stmt(lulu2Parser.Default_stmtContext ctx) {
        currentScope = currentScope.getEnclosingScope();
    }

    @Override
    public void enterFor_loop(lulu2Parser.For_loopContext ctx) {
        LoopScope forLoop = new LoopScope("For", currentScope);
        currentScope = forLoop;
        scopes.put(ctx, forLoop);
    }

    @Override
    public void exitFor_loop(lulu2Parser.For_loopContext ctx) {
        currentScope = currentScope.getEnclosingScope();
    }

    @Override
    public void enterWhile_loop(lulu2Parser.While_loopContext ctx) {
        LoopScope whileLoop = new LoopScope("While", currentScope);
        currentScope = whileLoop;
        scopes.put(ctx, whileLoop);
    }

    @Override
    public void exitWhile_loop(lulu2Parser.While_loopContext ctx) {
        currentScope = currentScope.getEnclosingScope();
    }

    @Override
    public void exitElse_stmt(lulu2Parser.Else_stmtContext ctx) {
        currentScope = currentScope.getEnclosingScope();
    }

    @Override
    public void enterFunc_call(lulu2Parser.Func_callContext ctx) {
        if(ctx.SIZEOF() != null) {
            currentScope.define(createSymbol("sizeof", "long", new ArrayList<>(),0, false ));
        } else if(ctx.READ() != null) {
            currentScope.define(createSymbol("read", "int", new ArrayList<>(),0, false ));
        } else if(ctx.WRITE() != null) {
            currentScope.define(createSymbol("write", "int", new ArrayList<>(),0, false ));
        }
    }

    public void addError(Token token, String id) {
        errors.append("\nLine " + token.getLine() + " : " + id);
    }

    public String getErrors() {
        return errors.toString();
    }
}
