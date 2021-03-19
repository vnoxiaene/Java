package banco;

import java.util.Scanner;

public class Conta {
    int numero;
    private float saldo, limite;
    Cliente cliente;

    public Conta(int numero, float saldo, float limite, Cliente cliente) {
        this.numero = numero;
        this.saldo = saldo;
        this.limite = limite;
        this.cliente = cliente;
    }

    void sacar(float valor){
        if ((this.saldo - valor) < 0){
            System.out.println("Saldo Insuficiente. Deseja utilizar seu limite? 1- Sim / 0- Não");

            Scanner teclado = new Scanner(System.in);
            int opcao = teclado.nextInt();

            switch (opcao){
                case 1:
                    if ((this.saldo + this.limite - valor) < 0){
                        System.out.println("Saldo Insuficiente, acima do limite contratado");
                    }else{
                        this.saldo =  this.saldo - valor;
                        this.limite = this.saldo + this.limite -valor;
                        System.out.println("Saldo atual: " +this.saldo);
                        System.out.println("Limite atual : " +this.limite);
                    }
                    break;
                case 0:

                    break;
                default:
                    System.out.println("Opcao invalida, tente novamente");
            }
        } else {
            this.saldo = this.saldo - valor;
            System.out.println("Saldo Atual: " +this.saldo);
        }
    }

    void depositar(float valor){
        this.saldo = this.saldo + valor;
        System.out.println("Saldo Atual: " +this.saldo);
    }

    public  float getSaldo(){
        return this.saldo;
    }
    public  float getLimite(){
        return this.limite;
    }

    public int getNumero() {
        return numero;
    }

    public String getNome() {
        return cliente.nome;
    }
}

