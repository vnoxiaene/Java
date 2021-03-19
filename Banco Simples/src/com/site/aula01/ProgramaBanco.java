package com.site.aula01;

import java.util.Scanner;

public class ProgramaBanco {
    public static void consultar_saldo(float saldo){
        System.out.println("Seu saldo atual é de: " +saldo);
    }
    public static void consultar_limite(float limite){
        System.out.println("Seu limite atual é de: " +limite);
    }
    public static int sacar(){
        System.out.println("Qual o valor do saque?");
        Scanner teclado = new Scanner(System.in);
        int valor = teclado.nextInt();

        return valor;
    }
    public static int depositar(){
        System.out.println("Qual o valor do deposito?");
        Scanner teclado = new Scanner(System.in);
        int valor = teclado.nextInt();

        return valor;
    }

    public static void sair(){
        System.out.println("Obrigado por utilizar o Banco");
    }

    public static void main(String[] args) {
        Cliente lucas = new Cliente("Lucas Palma", "Rua 20");
        Cliente maria = new Cliente("Maria Silva", "Rua 890");

        Conta conta1 = new Conta(01, 128.99f, 200f, lucas);
        Conta conta2 = new Conta(02, 1210.80f, 0f, maria);
        Map <Integer, Conta> contas = new Hash

        int opcao = -1;

        do {
            System.out.println("Bem vindo ao Banco, oq deseja realizar hoje:");
            System.out.println("1-Consultar Saldo");
            System.out.println("2-Consultar Limite");
            System.out.println("3-Sacar");
            System.out.println("4-Depositar");
            System.out.println("0-Sair");
            System.out.println();

            Scanner teclado = new Scanner(System.in);
            opcao = teclado.nextInt();

            switch (opcao){
                case 0:
                    sair();
                    break;
                case 1:
                    consultar_saldo(conta1.getSaldo());
                    break;
                case 2:
                    consultar_limite(conta1.getLimite());
                    break;
                case 3:
                    conta1.sacar(sacar());
                    break;
                case 4:
                    conta1.depositar(depositar());
                    break;
                default:
                    System.out.println("Opcao Invalida");
            }
        } while (opcao != 0);


    }
}
