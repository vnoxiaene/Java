public class ContaSalario extends Conta{
    public ContaSalario(String titular, double saldo, String agencia, String numero) {
        super(titular, saldo, agencia, numero);
    }

    @Override
    public void render() {

    }

    @Override
    public void depositar(double valor) {
        this.saldo = this.saldo + valor;
    }



}
