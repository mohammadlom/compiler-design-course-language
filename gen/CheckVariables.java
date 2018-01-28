
import java.util.HashSet;


public class CheckVariables {

    static HashSet<String> reservedTypes = new HashSet<>();

    public static boolean isReserved(String type) {
        switch (type) {
            case "int":
                return true;
            case "float":
                return true;
            case "long":
                return true;
            case "double":
                return true;
            case "bool":
                return true;
            case "string":
                return true;
            case "char":
                return true;
            case "sizeof":
                return true;
            case "read":
                return true;
            case "write":
                return true;
            default:
                return false;
        }
    }

    public static int getSize(String type) {
        switch (type) {
            case "read":
                return 4;
            case "write":
                return 4;
            case "int":
                return 4;
            case "float":
                return 4;
            case "sizeof":
                return 8;
            case "long":
                return 8;
            case "double":
                return 8;
            case "bool":
                return 1;
            case "string":
                return 0;//must be calculated;
            case "char":
                return 2;
            default:
                return 0;
        }

    }

}
