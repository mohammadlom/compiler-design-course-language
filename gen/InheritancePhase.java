import org.antlr.v4.runtime.Token;


public class InheritancePhase extends lulu2BaseListener {

    UniversalScope global;

    public StringBuffer errors = new StringBuffer();

    public InheritancePhase(UniversalScope globalScope){
        global = globalScope;
    }

    @Override
    public void enterType_def(lulu2Parser.Type_defContext ctx) {
        String name = ctx.ID(0).getText();
        UserDefinedTypesSymbol symbol = (UserDefinedTypesSymbol) global.typeDefinition.get(name);
        if(symbol.superUserType != null){
            UserDefinedTypesSymbol superClass = (UserDefinedTypesSymbol) global.typeDefinition.get(symbol.superUserType);
            if(superClass != null){
                symbol.setExtend(superClass);
            }else{
                addError(ctx.start, "Type "+ symbol.superUserType + " not Found");
            }
        }
    }






    public void addError(Token token,String id){
        errors.append("\nLine " + token.getLine() +" : " + id);
    }


    public String getErrors(){
        return errors.toString();
    }

}
