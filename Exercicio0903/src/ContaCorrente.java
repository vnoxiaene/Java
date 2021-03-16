public class ContaCorrente extends Conta{
    public ContaCorrente(String titular, double saldo, String agencia, String numero) {
        super(titular, saldo, agencia, numero);
    }

    @Override
    public void render() {
        this.saldo *= 1.02;
    }

    @Override
    public void depositar(double valor) {
        this.saldo = this.saldo + valor*0.9;
    }
}
