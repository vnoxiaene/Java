package methods;

import java.util.Scanner;

public class methods {

    public void print (){
        for (int i=1; i<=100 ; i++){
            System.out.println(i);
        }

    }

    private void printPares(){
        for (int i=1; i<=100 ; i++){
            if ((i%2)==0){
                System.out.println(i);
            }

        }
    }

    void printImpares(){
        for (int i=1; i<=100 ; i++){
            if ((i%2)!=0){
                System.out.println(i);
            }

        }
    }

    public void printPares2(){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Numero inicial: ");
        int n1 = teclado.nextInt();

        System.out.println("Numero final: ");
        int n2 = teclado.nextInt();

        for (int i=n1; i<=n2 ; i++){
            if ((i%2)==0){
                System.out.println(i);
            }

        }
    }

    public static void main(String[] args) {
        methods teste = new methods();
        teste.printPares();
    }
}
