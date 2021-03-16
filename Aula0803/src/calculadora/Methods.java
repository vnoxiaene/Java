package calculadora;

import java.util.Scanner;

public class Methods {
    public int soma(int n1, int n2){
        return   n1 + n2;
    }
    public int sub(int n1, int n2){
        return n1 - n2;
    }

    public int mult(int n1, int n2){
        return n1 * n2;
    }

    public double div(int n1, int n2){
        return n1 / n2;
    }

    public int recebeNumero(){
        Scanner teclado = new Scanner(System.in);
        return  teclado.nextInt();
    }

    public String recebeOperacao(){
        Scanner teclado = new Scanner(System.in);
        return  teclado.next();
    }
}
