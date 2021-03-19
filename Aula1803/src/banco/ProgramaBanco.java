package banco;

import java.util.HashMap;
import java.util.Map;
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
        Scanner teclado = new Scanner(System.in);
        int opcao = -1;
        Cliente lucas = new Cliente("Lucas Palma", "Rua 20");
        Cliente maria = new Cliente("Maria Silva", "Rua 890");

        Conta conta1 = new Conta(01, 128.99f, 200f, lucas);
        Conta conta2 = new Conta(02, 1210.80f, 0f, maria);
        Conta conta3 = new Conta(03, 110.80f, 300f, lucas);
        Conta conta4 = new Conta(04, 10.80f, 100f, maria);

        Map<Integer, Conta> contas = new HashMap<>();

        contas.put(conta1.getNumero(),conta1);
        contas.put(conta2.getNumero(),conta2);
        contas.put(conta3.getNumero(),conta3);
        contas.put(conta4.getNumero(),conta4);

        System.out.println("Qual o numero da sua conta?");
        int nConta = teclado.nextInt();
        if(contas.containsKey(nConta)){
            do {
                System.out.println("Bem vindo ao Banco, "+contas.get(nConta).getNome()+ " o que deseja realizar hoje:");
                System.out.println("1-Consultar Saldo");
                System.out.println("2-Consultar Limite");
                System.out.println("3-Sacar");
                System.out.println("4-Depositar");
                System.out.println("0-Sair");
                System.out.println();


                opcao = teclado.nextInt();

                switch (opcao){
                    case 0:
                        sair();
                        break;
                    case 1:
                        consultar_saldo(contas.get(nConta).getSaldo());
                        break;
                    case 2:
                        consultar_limite(contas.get(nConta).getLimite());
                        break;
                    case 3:
                        contas.get(nConta).sacar(sacar());
                        break;
                    case 4:
                        contas.get(nConta).depositar(depositar());
                        break;
                    default:
                        System.out.println("Opcao Invalida");
                }
            } while (opcao != 0);

        }else{
            System.out.println("Conta invalida");
        }
    }
}
