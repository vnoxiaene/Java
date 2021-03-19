import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer,String> colors = new HashMap<>();

        colors.put(48, "Valor1");
        colors.put(13, "Valor2");
        colors.put(33, "Valor3");
        colors.put(9, "Valor4");

        for(Map.Entry<Integer, String>value:colors.entrySet()){
            System.out.println(value);
        }



    }
}
