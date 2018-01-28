
public class Symbol {
    String name;
    Type type;
    boolean constAttr;

    public Symbol(String name){
        this.name = name;
    }

    public Symbol(String name, Type type, boolean constAttr){
        this.name = name;
        this.type = type;
        this.constAttr = constAttr;
    }

    public Symbol(){
        this.name = name;
        this.type = type;
    }

    public String toString(){
        if (type != null) {
            return name + ':' + type;
        }
        return name;
    }

}
