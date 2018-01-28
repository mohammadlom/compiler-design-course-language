
import java.util.ArrayList;

//import org.stringtemplate.v4.compiler.STParser.ifstat_return;//make error

public class ArrayType implements Type {

    Type type;
    int dimention;//بعد آرایه

    ArrayList<Integer> array;

    public ArrayType(Type type, int dimention, ArrayList<Integer> array){
        this.type = type;
        this.dimention = dimention;
        this.array = array;
    }




    @Override
    public int getSize() {

        if(array.size() == 0 && dimention != 0){
            return 4;
        }else{
            int sum = type.getSize();
            for (int i = 0; i < array.size(); i++) {
                sum *= array.get(i);
            }
            return sum;
        }
    }


    public static Type getType(ArrayType inArray, int num){
        if(inArray.dimention - num < 0)
            return null;
        if(inArray.dimention - num == 0)
            return inArray.type;

        return new ArrayType(inArray.type, inArray.dimention - num,null);
    }


    @Override
    public String getName() {
        String s = type.getName();
        for (int i = 0; i < dimention; i++) {
            s += "[]";
        }
        return s;
    }}
