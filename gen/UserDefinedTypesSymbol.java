import java.util.HashMap;

public class UserDefinedTypesSymbol extends Symbol implements Type, Scope {

    HashMap<String, Symbol> publicTypeinitialization = new HashMap<>();
    HashMap<String, Symbol> privateTypeinitialization = new HashMap<>();
    HashMap<String, Symbol> protectedTypeinitialization = new HashMap<>();
    HashMap<String, Symbol> otherMembers = new HashMap<>();
    Scope parent;
    UserDefinedTypesSymbol superType;
    String superUserType;

    public UserDefinedTypesSymbol(String name) {
        super(name);
    }

    public UserDefinedTypesSymbol(String name, Scope parent, String superUDType) {
        super(name);
        this.parent = parent;
        this.superUserType = superUDType;
    }

    @Override
    public String getScopeName() {
        return (parent != null) ? "User-defined Type: " + name  + " in " + parent.getScopeName() + " Scope." : this.name;
    }

    @Override
    public Scope getEnclosingScope() {
        return this.parent;
    }

    @Override
    public void define(Symbol symbol) {
        otherMembers.put(symbol.name, symbol);
    }

    public void define(Symbol symbol, String accessLevel) {
        if(accessLevel.equals("public")) {
            publicTypeinitialization.put(symbol.name, symbol);
        } else if(accessLevel.equals("private")) {
            privateTypeinitialization.put(symbol.name, symbol);
        } else {
            protectedTypeinitialization.put(symbol.name, symbol);
        }
    }

    @Override
    public Symbol resolve(String symbolName) {
        Symbol s = publicTypeinitialization.get(symbolName);
        if(s == null)
            s = protectedTypeinitialization.get(symbolName);
        if(s == null)
            s = privateTypeinitialization.get(symbolName);
        if(s == null)
            s = otherMembers.get(symbolName);
        if(s == null && superType != null)
            s = superType.inheritResolve(symbolName);
        return s;
    }

    public Symbol inheritResolve(String symbolName) {
        Symbol s = publicTypeinitialization.get(symbolName);
        if (s == null) {
            s = protectedTypeinitialization.get(symbolName);
        }
        if (s == null && superType != null) {
            s = superType.inheritResolve(symbolName);
        }
        return s;
    }

    public void setExtend(UserDefinedTypesSymbol superType){
        this.superType = superType;
    }

    @Override
    public Symbol innerResolve(String symbolName) {
        return resolve(name);
    }

    @Override
    public int getScopeSize() {
        int sum = 0;
        for(String key : publicTypeinitialization.keySet()){
            Symbol field = publicTypeinitialization.get(key);
            if(field.type instanceof BuiltInType){
                sum += field.type.getSize();
            }
            if(field instanceof UserDefinedTypesSymbol){
                sum += ((UserDefinedTypesSymbol) field).getSize();
            }
        }
        for(String key : privateTypeinitialization.keySet()){
            Symbol field = privateTypeinitialization.get(key);
            if(field.type instanceof BuiltInType){
                sum += field.type.getSize();
            }
            if(field instanceof UserDefinedTypesSymbol){
                sum += ((UserDefinedTypesSymbol) field).getSize();
            }
        }
        for(String key : protectedTypeinitialization.keySet()){
            Symbol field = protectedTypeinitialization.get(key);
            if(field.type instanceof BuiltInType){
                sum += field.type.getSize();
            }
            if(field instanceof UserDefinedTypesSymbol){
                sum += ((UserDefinedTypesSymbol) field).getSize();
            }
        }
        for(String key : otherMembers.keySet()){
            Symbol field = otherMembers.get(key);
            if(field.type instanceof BuiltInType){
                sum += field.type.getSize();
            }
            if(field instanceof UserDefinedTypesSymbol){
                sum += ((UserDefinedTypesSymbol) field).getSize();
            }
        }
        if(superType != null){
            sum += ((UserDefinedTypesSymbol)superType).getSize();
        }
        return sum;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public int getSize() {
        return 0;
    }
}
