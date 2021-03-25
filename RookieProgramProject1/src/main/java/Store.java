
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Store {
    public static Scanner tc = new Scanner(System.in);
    public static Map<Integer,Product> product = new HashMap<>();

    public static void main(String[] args) {
        Menu.menu();
    }
}
