public abstract class Conta {
    String titular;
    protected double saldo;
    String agencia;
    String numero;

    public Conta(String titular, double saldo, String agencia, String numero) {
        this.titular = titular;
        this.saldo = saldo;
        this.agencia = agencia;
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }


    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void transferir(double valor, Conta conta){
        if ((this.saldo - valor) >=0){
            this.saldo -= valor;
            conta.saldo += valor;

        }else{
            System.out.println("Operacao negada por falta de saldo");
        }
    }

    public void sacar(double valor){
        if ((this.saldo - valor) >=0){
            this.saldo -= valor;
        }else{
            System.out.println("Operacao negada por falta de saldo");
        }
    }

    public abstract void render();

    public abstract void depositar(double valor);

    @Override
    public String toString() {
        return "Conta: Titular = " + titular + "\nSaldo = " + saldo + "\nAgencia = " + agencia + "\nNumero = " +numero+"\n";
    }
}
