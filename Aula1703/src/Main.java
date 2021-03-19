import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set hs = new HashSet();

        for (int i=1;i<10;i++){
            hs.add(i);
        }
        Iterator iths = hs.iterator();

        while (iths.hasNext()){
            System.out.println(iths.next());
        }




    }
}
