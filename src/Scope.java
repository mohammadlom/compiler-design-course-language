public interface Scope {
    public String getScopeName();
    public Scope getEnclosingScope();
    public void define(Symbol symbol);
    public Symbol resolve(String symbolName);
    public Symbol innerResolve(String symbolName);
    public int getScopeSize();
}