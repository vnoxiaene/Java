package aplication;

import java.util.Scanner;
import entities.conta;

public class programa {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        conta cliente1 = new conta();

        System.out.println("Nome do cliente:");
        cliente1.setNome(teclado.nextLine());
        System.out.println("Numero da conta:");
        cliente1.setNumConta(teclado.nextLine());


        System.out.println("Nome: " +cliente1.getNome()+"\nConta: " +cliente1.getNumConta()+"\nSaldo: " +cliente1.getSaldo());

        teclado.close();




    }

}
