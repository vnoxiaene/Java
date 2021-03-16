public class Poupanca extends Conta{
    public Poupanca(String titular, double saldo, String agencia, String numero) {
        super(titular, saldo, agencia, numero);
    }

    @Override
    public void render() {
        this.saldo *= 1.05;
    }

    @Override
    public void depositar(double valor) {
        this.saldo = this.saldo + valor;
    }


}
