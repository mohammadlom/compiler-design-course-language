import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import java.util.ArrayList;

public class ResolvePhase extends lulu2BaseListener {
    UniversalScope defPhase;
    Scope currentScope;
    ParseTreeProperty<Scope> scopes;

    public StringBuffer errors = new StringBuffer();

    public StringBuffer tables = new StringBuffer();

    public ArrayList<String> declaredTypes = new ArrayList<>();
    public ArrayList<String> declaredfuncs = new ArrayList<>();
    public ArrayList<String> udTypes = new ArrayList<>();
    public ArrayList<String> funcs = new ArrayList<>();
    int numOfStart = 0;

    public ResolvePhase(UniversalScope defPhase, ParseTreeProperty<Scope> scopes) {
        this.defPhase = defPhase;
        currentScope = defPhase;
        this.scopes = scopes;
    }

    @Override
    public void enterFun_def(lulu2Parser.Fun_defContext ctx) {
        if(declaredfuncs.contains(ctx.ID().getText()))
            declaredfuncs.remove(ctx.ID().getText());
        currentScope = scopes.get(ctx);
        if(ctx.ID().getText().equals("start")) numOfStart++;
    }

    @Override
    public void exitFun_def(lulu2Parser.Fun_defContext ctx) {
        FunctionSymbol scope = (FunctionSymbol) currentScope;
        StringBuffer tbl = new StringBuffer();
        tbl.append("\n\n\n" + "Scope : " + scope.getScopeName() + ":"
                + scope.getScopeSize());
        tbl.append("\nID\tType\tSize");
        for (String key : scope.initialization.keySet()) {
            Symbol sym = scope.initialization.get(key);
            tbl.append("\n" + sym.name + "\t" + sym.type.getName() + "\t"
                    + sym.type.getSize());

        }
        tbl.append("\nInputs:");
        for (String key : scope.inputs.keySet()) {
            Symbol sym = scope.inputs.get(key);
            tbl.append("\n" + sym.name + "\t" + sym.type.getName() + "\t"
                    + sym.type.getSize());

        }
        tbl.append("\nOutputs:");
        for (String key : scope.outputs.keySet()) {
            Symbol sym = scope.outputs.get(key);
            tbl.append("\n" + sym.name + "\t" + sym.type.getName() + "\t"
                    + sym.type.getSize());

        }
        tables.append(tbl.toString());

        currentScope = currentScope.getEnclosingScope();
    }

    @Override
    public void enterType_dcl(lulu2Parser.Type_dclContext ctx) {
        declaredTypes.add(ctx.ID().getText());
        udTypes.add(ctx.ID().getText());
    }

    @Override
    public void enterFunc_dcl(lulu2Parser.Func_dclContext ctx) {
        declaredfuncs.add(ctx.ID().getText());
        funcs.add(ctx.ID().getText());

    }

    @Override
    public void enterType_def(lulu2Parser.Type_defContext ctx) {
        currentScope = scopes.get(ctx);
        if(!udTypes.contains(ctx.ID(0).getText()))
            udTypes.add(ctx.ID(0).getText());
    }

    @Override
    public void exitType_def(lulu2Parser.Type_defContext ctx) {
        if (declaredTypes.contains(ctx.ID(0).getText())) {
            declaredTypes.remove(ctx.ID(0).getText());
        }

        UserDefinedTypesSymbol scope = (UserDefinedTypesSymbol) currentScope;
        StringBuffer tbl = new StringBuffer();
        tbl.append("\n\n\n" + "Scope : " + scope.getScopeName() + ":"
                + scope.getScopeSize());
        tbl.append("\nID\tType\tSize");
        for (String key : scope.publicTypeinitialization.keySet()) {
            Symbol sym = scope.publicTypeinitialization.get(key);
            if (!(sym instanceof FunctionSymbol))
                tbl.append("\n" + sym.name + "\t" + sym.type.getName() + "\t"
                        + sym.type.getSize());
            else
                tbl.append("\n" + sym.name + "\t" + "func" + "\t" + "4");

        }
        for (String key : scope.privateTypeinitialization.keySet()) {
            Symbol sym = scope.privateTypeinitialization.get(key);
            if (!(sym instanceof FunctionSymbol))
                tbl.append("\n" + sym.name + "\t" + sym.type.getName() + "\t"
                        + sym.type.getSize());
            else
                tbl.append("\n" + sym.name + "\t" + "func" + "\t" + "4");

        }
        for (String key : scope.protectedTypeinitialization.keySet()) {
            Symbol sym = scope.protectedTypeinitialization.get(key);
            if (!(sym instanceof FunctionSymbol))
                tbl.append("\n" + sym.name + "\t" + sym.type.getName() + "\t"
                        + sym.type.getSize());
            else
                tbl.append("\n" + sym.name + "\t" + "func" + "\t" + "4");

        }for (String key : scope.otherMembers.keySet()) {
            Symbol sym = scope.otherMembers.get(key);
            if (!(sym instanceof FunctionSymbol))
                tbl.append("\n" + sym.name + "\t" + sym.type.getName() + "\t"
                        + sym.type.getSize());
            else
                tbl.append("\n" + sym.name + "\t" + "func" + "\t" + ((FunctionSymbol) sym).getScopeSize());

        }

        tables.append(tbl.toString());
        currentScope = currentScope.getEnclosingScope();
    }

    @Override
    public void exitFor_loop(lulu2Parser.For_loopContext ctx) {
        LoopScope scope = (LoopScope) currentScope;
        StringBuffer tbl = new StringBuffer();
        tbl.append("\n\n\n" + "Scope : " + scope.getScopeName() + ":"
                + scope.getScopeSize());
        tbl.append("\nID\tType\tSize");
        for (String key : scope.initialization.keySet()) {
            Symbol sym = scope.initialization.get(key);
            tbl.append("\n" + sym.name + "\t" + sym.type.getName() + "\t"
                    + sym.type.getSize());

        }
        tables.append(tbl.toString());
    }

    @Override
    public void exitWhile_loop(lulu2Parser.While_loopContext ctx) {
        LoopScope scope = (LoopScope) currentScope;
        StringBuffer tbl = new StringBuffer();
        tbl.append("\n\n\n" + "Scope : " + scope.getScopeName() + ":"
                + scope.getScopeSize());
        tbl.append("\nID\tType\tSize");
        for (String key : scope.initialization.keySet()) {
            Symbol sym = scope.initialization.get(key);
            tbl.append("\n" + sym.name + "\t" + sym.type.getName() + "\t"
                    + sym.type.getSize());

        }
        tables.append(tbl.toString());
    }



    @Override
    public void enterAssign(lulu2Parser.AssignContext ctx) {
        int num = ctx.var().size();
        if (num == 1 && ctx.expr() != null) {
            Symbol sym = evalVar(ctx.var(0));
            if (sym != null) {
                Type t = evaluateExpr(ctx.expr());
                if (t == null || !t.getName().equals(sym.type.getName()))
                    addError(ctx.start,
                            sym.name + " not same type of " + t.getName());
            }
        } else {
            Scope scope = null;
            if (ctx.func_call().var() != null) {
                Symbol sym = evalVar(ctx.func_call().var());
                if (sym instanceof UserDefinedTypesSymbol)
                    scope = (Scope) sym;
                else {
                    if (sym.type instanceof UserDefinedTypesSymbol) {
                        scope = (Scope) defPhase.typeDefinition.get(sym.type.getName());
                    } else {
                        addError(ctx.start, " cant call refrence on this type");
                        return;
                    }
                }
            } else {
                scope = currentScope;
            }
            Symbol func = scope.resolve(ctx.func_call().ID().getText());
            if (func instanceof FunctionSymbol) {
                FunctionSymbol f = (FunctionSymbol) func;
                if (f.outputs.size() != num) {
                    addError(ctx.start,
                            " types dosn't match with function outputs");
                    return;
                }

                for (int i = 0; i < num; i++) {
                    Symbol sym = evalVar(ctx.var(i));
                    Symbol out = f.outputArray.get(i);
                    if (!sym.type.getName().equals(out.type.getName())) {
                        addError(ctx.start,
                                " types dosn't match with function outputs");
                        return;
                    }
                }
            } else {
                addError(ctx.start, func.name + " is not function");
            }
        }
    }
    public void addError(Token token, String id) {
        errors.append("\nLine " + token.getLine() + " : " + id);
    }

    public String getErrors() {
        return errors.toString();
    }

    public Type evaluateExpr(lulu2Parser.ExprContext expr) {
        if (expr.const_val() != null) {
            if (expr.const_val().Bool_const() != null) {
                return new BuiltInType("bool");
            }
            if (expr.const_val().Int_const() != null) {
                return new BuiltInType("int");
            }
            if (expr.const_val().REAL_CONST() != null) {
                return new BuiltInType("float");
            }
            if (expr.const_val().String_const() != null) {
                return new BuiltInType("string");
            }
            if (expr.const_val().CHAR_CONST() != null) {
                return new BuiltInType("char");
            }
        } else if (expr.bop != null) {
            String bop = expr.bop.getText();

            if (bop.equals("+") || bop.equals("-") || bop.equals("*")
                    || bop.equals("/")|| bop.equals("^")) {

                if (bop.equals("-") && expr.expr(1) == null) {
                    Type t = evaluateExpr(expr.expr(0));
                    if (t == null) {
                        return null;
                    }
                    String s = t.getName();
                    if (s.equals("char") || s.equals("bool")
                            || s.equals("string")) {
                        addError(expr.start, "wrong type for oprand \'+\'");
                        return null;
                    } else {
                        return new BuiltInType("s");
                    }
                }

                Type t1 = evaluateExpr(expr.expr(0));
                Type t2 = evaluateExpr(expr.expr(1));
                if (t1 == null || t2 == null)
                    return null;

                String c1 = t1.getName();
                String c2 = t2.getName();

                if (c1.equals("char") || c1.equals("bool")
                        || c1.equals("string") || c2.equals("char")
                        || c2.equals("bool") || c2.equals("string")) {
                    addError(expr.start, "wrong type for oprand " + bop);
                    return null;
                }

                if ((c1.equals("int") && c2.equals("double"))
                        || (c2.equals("int") && c1.equals("double"))) {
                    return new BuiltInType("double");
                }
                if ((c1.equals("int") && c2.equals("float"))
                        || (c2.equals("int") && c1.equals("float"))) {
                    return new BuiltInType("double");
                }

                if ((c1.equals("float") && c2.equals("double"))
                        || (c2.equals("float") && c1.equals("double"))) {
                    return new BuiltInType("double");
                }

                if ((c1.equals("int") && c2.equals("long"))
                        || (c2.equals("int") && c1.equals("long"))) {
                    return new BuiltInType("long");
                }

                if (c1.equals(c2)) {
                    return new BuiltInType(c1);
                }

            } else if (bop.equals("||") || bop.equals("&&") || bop.equals("|")
                    || bop.equals("&")) {
                Type t1 = evaluateExpr(expr.expr(0));
                Type t2 = evaluateExpr(expr.expr(1));

                if (t1 == null || t2 == null)
                    return null;

                String s1 = t1.getName();
                String s2 = t2.getName();

                if (s1.equals("bool") && s2.equals("bool"))
                    return t1;
                else {
                    addError(expr.start, "Wrong type of oprand " + bop);
                    return null;
                }
            } else if (bop.equals("<") || bop.equals(">") || bop.equals("<=")
                    || bop.equals(">=") || bop.equals("==")) {

                Type t1 = evaluateExpr(expr.expr(0));
                Type t2 = evaluateExpr(expr.expr(1));
                if (t1 == null || t2 == null)
                    return null;

                String c1 = t1.getName();
                String c2 = t2.getName();

                if ((c1.equals("int") && c2.equals("double"))
                        || (c2.equals("int") && c1.equals("double"))) {
                    return new BuiltInType("bool");
                }
                if ((c1.equals("int") && c2.equals("float"))
                        || (c2.equals("int") && c1.equals("float"))) {
                    return new BuiltInType("bool");
                }

                if ((c1.equals("float") && c2.equals("double"))
                        || (c2.equals("float") && c1.equals("double"))) {
                    return new BuiltInType("bool");
                }

                if ((c1.equals("int") && c2.equals("long"))
                        || (c2.equals("int") && c1.equals("long"))) {
                    return new BuiltInType("bool");
                }
                if ((c1.equals("long") && c2.equals("bool"))
                        || (c2.equals("long") && c1.equals("bool"))) {
                    return new BuiltInType("bool");
                }

                if ((c1.equals("int") && c2.equals("char"))
                        || (c2.equals("int") && c1.equals("char"))) {
                    return new BuiltInType("bool");
                }

                if (c1.equals(c2)) {
                    return new BuiltInType("bool");
                }

                return null;

            }else if(bop.equals("%")){

                Type t1 = evaluateExpr(expr.expr(0));
                Type t2 = evaluateExpr(expr.expr(1));

                if(t1.getName().equals("int")&&t2.getName().equals("int")){
                    return new BuiltInType("int");
                }

            }

        } else if (expr.uop != null) {
            String uop = expr.uop.getText();
            if (uop.equals("!") || uop.equals("~")) {
                Type t = evaluateExpr(expr.expr(0));
                if (t == null)
                    return null;

                String s = t.getName();
                if (s.equals("long") || s.equals("bool"))
                    return new BuiltInType("bool");

                addError(expr.start, "Wrong type for oprand " + uop);
                return null;

            } else if (uop.equals("(")) {
                return evaluateExpr(expr.expr(0));
            }
        } else if (expr.var() != null) {
            Symbol sym = evalVar(expr.var());
            if (sym != null) {
                if (sym instanceof UserDefinedTypesSymbol) {
                    return (UserDefinedTypesSymbol) sym;
                }
                return sym.type;
            } else
                return null;
        } else if (expr.func_call() != null) {

            Scope scope = null;
            if (expr.func_call().var() != null) {
                Symbol sym = evalVar(expr.func_call().var());
                if (sym instanceof UserDefinedTypesSymbol)
                    scope = (Scope) sym;
                else {
                    if (sym.type instanceof UserDefinedTypesSymbol) {
                        scope = (Scope) defPhase.typeDefinition.get(sym.type.getName());
                    } else {
                        addError(expr.start, "cant call refrence on this type");
                        return null;
                    }
                }
            } else {
                scope = currentScope;
            }

            Symbol func = scope.resolve(expr.func_call().ID().getText());
            if (func instanceof FunctionSymbol) {
                FunctionSymbol f = (FunctionSymbol) func;
                int size = f.outputArray.size();
                if (size != 1) {
                    addError(expr.start, "Type does not Match");
                    return null;
                } else {
                    return f.inputArray.get(0).type;
                }
            }

            return null;

        }

        return null;
    }

    private Symbol evalVar(lulu2Parser.VarContext context) {
        Scope scope = currentScope;
        Symbol sym = null;
        for (int i = 0; i < context.ref().size(); i++) {
            String s = context.ref(i).ID().getText();
            sym = scope.resolve(s);
            if (sym == null) {
                addError(context.start,
                        s + " not defined in " + scope.getScopeName());
                return null;
            }
            if (sym instanceof UserDefinedTypesSymbol) {
                scope = (UserDefinedTypesSymbol) defPhase.typeDefinition.get(sym.name);
            } else if (context.ref(i).expr().size() > 0
                    && sym.type instanceof ArrayType) {
                Type c = ArrayType.getType((ArrayType) sym.type, context
                        .ref(i).expr().size());

                if (c instanceof UserDefinedTypesSymbol) {
                    scope = (UserDefinedTypesSymbol) defPhase.typeDefinition.get(c.getName());
                    sym = (UserDefinedTypesSymbol) scope;
                } else if (i < context.ref().size() - 1) {
                    addError(context.start, "Incorrect refrence");
                    return null;
                }
            } else {
                Type c = sym.type;
                if (c instanceof UserDefinedTypesSymbol) {
                    scope = (UserDefinedTypesSymbol) defPhase.members.get(((UserDefinedTypesSymbol) c).name);
                    if (scope == null)
                        scope = (UserDefinedTypesSymbol) defPhase.typeDefinition.get(((UserDefinedTypesSymbol) c).name);
                    sym = (UserDefinedTypesSymbol) scope;
                } else if (c instanceof BuiltInType) {
                    return sym;
                } else if (i < context.ref().size() - 1) {
                    addError(context.start, "Incorrect refrence");
                    return null;
                }
            }
        }
        return sym;
    }

//    @Override
//    public void enterVar_def(lulu2Parser.Var_defContext ctx) {
//        if (!(currentScope instanceof UserDefinedTypesSymbol)) {
//            String typeName = ctx.type().getText();
//            int num = ctx.var_val().size();
//            for (int i = 0; i < num; i++) {
//                String symName = ctx.var_val(i).ID(0).getText();
//                if (currentScope.innerResolve(symName) != null) {
//                    addError(ctx.var_val(i).getStart(),
//                            "Duplicate local variable "
//                                    + ctx.var_val(i).ID(0).getText());
//                }
//            }
//        } else {
//
//            int num = ctx.var_val().size();
//            for (int i = 0; i < num; i++) {
//                String symName = ctx.var_val(i).ID(0).getText();
//
//                Symbol sym = currentScope.resolve(symName);
//                if (sym.type instanceof UserDefinedTypesSymbol) {
//                    if (defPhase.typeDefinition.get(sym.type.getName()) == null) {
//
//                        addError(ctx.start, "type " + sym.type.getName()
//                                + " not found");
//                    }
//                }
//                if (ctx.var_val(i).expr() != null) {
//                    Type c = evaluateExpr(ctx.var_val(i).expr());
//                    if (c != null) {
//                        if (!sym.type.getName().equals(c.getName())) {
//                            addError(ctx.var_val(i).getStart(), symName
//                                    + " is not " + c.getName());
//                        }
//                    }
//                }
//
//            }
//
//        }
//    }

    @Override
    public void exitProgram(lulu2Parser.ProgramContext ctx) {
        Symbol sym = defPhase.resolve("start");
        if(numOfStart > 1) {
            addError(ctx.start, "start function already defined");
        } else if(numOfStart < 1) {
            addError(ctx.start, "start function not defined");
        }
        if(!(sym instanceof FunctionSymbol)){
//            addError(ctx.start, "Missing start function");
        }else{
            FunctionSymbol func = (FunctionSymbol) sym;
            if(func.outputs.size() != 1){
                addError(ctx.start, "Invalid output for start function");
            }else{
                if(!func.outputArray.get(0).type.getName().equals("int"))
                    addError(ctx.start, "Invalid output for start function");
            }
        }
    }

    @Override
    public void enterLoop_cond_stmt(lulu2Parser.Loop_cond_stmtContext ctx) {
        Scope scope = scopes.get(ctx);
        if(!(currentScope instanceof LoopScope) && ctx.BREAK() == null) {
            addError(ctx.start, ctx.getChild(0).getText() +  " must be used in loop");
        }
    }

    @Override
    public void exitLoop_cond_stmt(lulu2Parser.Loop_cond_stmtContext ctx) {
//        currentScope = currentScope.getEnclosingScope();
    }

    @Override
    public void enterIf_stmt(lulu2Parser.If_stmtContext ctx) {
        Type t = evaluateExpr(ctx.expr());
        if (t == null || !t.getName().equals("bool")) {
            addError(ctx.start, "Condition most be bool type");
        }
    }

    @Override
    public void enterFor_loop(lulu2Parser.For_loopContext ctx) {
        Type t = evaluateExpr(ctx.expr());
        if (t == null || !t.getName().equals("bool")) {
            addError(ctx.start, "Condition most be bool type");
        }
    }

    @Override
    public void enterWhile_loop(lulu2Parser.While_loopContext ctx) {
        Type t = evaluateExpr(ctx.expr());
        if (t == null || !t.getName().equals("bool")) {
            addError(ctx.start, "Condition most be bool type");
        }
    }

    @Override
    public void enterCond_stmt(lulu2Parser.Cond_stmtContext ctx) {
        if(ctx.SWITCH() != null) {
            Symbol sym = evalVar(ctx.var());
            if(!sym.type.getName().equals("int") && !sym.type.getName().equals("bool")) {
                addError(ctx.start, "switch must be int type");
            }
        }
    }

    @Override
    public void enterRef(lulu2Parser.RefContext ctx) {
        if(ctx.expr() != null) {
            int exprSize = ctx.expr().size();
            for (int i = 0;i < exprSize;i++) {
                Type t = evaluateExpr(ctx.expr(i));
                if(!t.getName().equals("int")) {
                    addError(ctx.expr(i).start, "array index must be int type");
                }
            }
        }
    }

    @Override
    public void enterConst_val(lulu2Parser.Const_valContext ctx) {
        if(ctx.String_const() != null) {
            String s = ctx.String_const().getText();
            if(s.length() > 2000)
                addError(ctx.start, "String length must be less than 2001 chars");
        }
    }
}
