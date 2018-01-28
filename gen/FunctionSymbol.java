import java.util.ArrayList;
import java.util.HashMap;


public class FunctionSymbol extends Symbol implements Scope {

    HashMap<String, Symbol> inputs = new HashMap<>();
    HashMap<String, Symbol> outputs = new HashMap<>();

    ArrayList<Symbol> inputArray = new ArrayList<>();
    ArrayList<Symbol> outputArray = new ArrayList<>();


    HashMap<String, Symbol> initialization = new HashMap<>();//defined feilds in function;

    Scope parent;

    public FunctionSymbol(String name, Scope parent) {
        super(name);
        this.parent = parent;
    }

    @Override
    public String getScopeName() {

        if(parent != null)
            return "function "+ name + " in " + parent.getScopeName();
        return name;
    }

    @Override
    public Scope getEnclosingScope() {
        // TODO Auto-generated method stub
        return parent;
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

        if(sym != null){
            return sym;
        }else {
            sym = inputs.get(name);
            if(sym != null){
                return sym;
            }else{
                sym = outputs.get(name);
                if(sym != null){
                    return sym;
                }

            }
        }
        if(parent != null){
            return parent.resolve(name);
        }
        return null;
    }


    public void addOutput(Symbol sym){
        outputs.put(sym.name, sym);//hash
        outputArray.add(sym);
    }

    public void addInput(Symbol sym){
        inputs.put(sym.name, sym);
        inputArray.add(sym);
    }

    public HashMap<String, Symbol> getOutputs(){
        return outputs;
    }

    public HashMap<String, Symbol> getInputs(){
        return inputs;
    }

    @Override
    public Symbol innerResolve(String name) {
        Symbol sym = initialization.get(name);

        if(sym != null){
            return sym;
        }else {
            sym = inputs.get(name);
            if(sym != null){
                return sym;
            }else{
                sym = outputs.get(name);
                if(sym != null){
                    return sym;
                }

            }
        }
        return sym;
    }

    @Override
    public int getScopeSize() {
        int sum = 0;
        for(String key : initialization.keySet()){
            Symbol field = initialization.get(key);
            if(initialization.get(key) instanceof UserDefinedTypesSymbol) field = (UserDefinedTypesSymbol) initialization.get(key);
            sum += field.type.getSize();
        }
        for(String key : inputs.keySet()){
            Symbol field = inputs.get(key);

            sum += field.type.getSize();
        }
        for(String key : outputs.keySet()){
            Symbol field = outputs.get(key);

            sum += field.type.getSize();
        }
        return sum;
    }

}
