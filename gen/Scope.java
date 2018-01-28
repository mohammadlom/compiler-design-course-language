public interface Scope {
    public String getScopeName();
    public Scope getEnclosingScope();
    public void define(Symbol symbol);
    public void define(Symbol symbol, String accessLevel);
    public Symbol resolve(String symbolName);
    public Symbol innerResolve(String symbolName);
    public int getScopeSize();
}