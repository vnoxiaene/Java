package com.site.aula02;

import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Me de um numero interio:");

        Integer n = teclado.nextInt();

        String novo = n.toString();



        for (int i=(novo.length()-1); i>=0; i--){
            String numero = String.valueOf(novo.charAt(i));
            System.out.print(Integer.parseInt(numero));

        }
    }
}
