public class BuiltInType implements Type {

    String name;
    int size;

    public BuiltInType(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        if(name.equals("string") ){
            return 0;
        }
        return CheckVariables.getSize(name);
    }

}
