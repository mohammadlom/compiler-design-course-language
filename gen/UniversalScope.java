import java.util.HashMap;

public class UniversalScope implements Scope {

    HashMap<String, Symbol> typeDefinition = new HashMap<>();
    HashMap<String, Symbol> members = new HashMap<>();

    @Override
    public String getScopeName() {
        return "Universal";
    }

    @Override
    public Scope getEnclosingScope() {
        return null;
    }

    @Override
    public void define(Symbol symbol) {
        if (symbol instanceof UserDefinedTypesSymbol) {
            typeDefinition.put(symbol.name, symbol);
            return;
        }
        members.put(symbol.name, symbol);
    }

    @Override
    public void define(Symbol symbol, String accessLevel) {
        return;
    }

    @Override
    public Symbol resolve(String symbolName) {
        return members.get(symbolName);
    }

    @Override
    public Symbol innerResolve(String symbolName) {
        return  resolve(symbolName);
    }

    @Override
    public int getScopeSize() {
        return 0;
    }
}