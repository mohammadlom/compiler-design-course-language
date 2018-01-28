import java.util.HashMap;


public class IfScope implements Scope {


    HashMap<String, Symbol> initialization = new HashMap<>();
    String name;
    Scope parnet;

    public IfScope(String name, Scope parent) {
        this.name = name;
        this.parnet = parent;
    }

    @Override
    public 	String getScopeName() {

        if(parnet != null)
            return name + " in " + parnet.getScopeName();
        return name;
    }

    @Override
    public Scope getEnclosingScope() {

        return parnet;
    }

    @Override
    public void define(Symbol sym) {
        initialization.put(sym.name, sym);

    }

    @Override
    public void define(Symbol symbol, String accessLevel) {

    }

    @Override
    public Symbol resolve(String name) {
        Symbol sym = initialization.get(name);
        if(sym == null)
            sym = parnet.resolve(name);
        return sym;
    }

    @Override
    public Symbol innerResolve(String name) {

        Symbol sym = initialization.get(name);
        if(sym == null && parnet != null)
            sym = parnet.innerResolve(name);
        return sym;
    }

    @Override
    public int getScopeSize() {
        int sum = 0;
        for(String key : initialization.keySet()){
            Symbol field = initialization.get(key);

            sum += field.type.getSize();
        }
        return sum;

    }

}
