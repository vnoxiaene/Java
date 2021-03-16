public class Conta {
    private static int codigo = 1001;

    private int numero;
    private Cliente cliente;
    private Double saldo = 0.0;
    private Double limite = 0.0;
    private Double saldoTotal;

    public Conta(Cliente cliente){
        this.numero = Conta.codigo;
        this.cliente = cliente;
        codigo++;
        this.atualizaSaldoTotal();
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public Double getSaldo() {
        return saldo;
    }
    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
    public Double getLimite() {
        return limite;
    }
    public void setLimite(Double limite) {
        this.limite = limite;
        this.atualizaSaldoTotal();
    }
    public int getNumero() {
        return numero;
    }
    public Double getSaldoTotal() {
        return saldoTotal;
    }

    private void atualizaSaldoTotal() {
        this.saldoTotal = this.getSaldo() + this.getLimite();
    }

    public String toString() {
        return "Número da Conta: " + this.getNumero() +
                "\nCliente: " + this.cliente.getNome() +
                "\nSaldo Total: " + Utils.doubleParaString(this.getSaldoTotal());
    }
    public void depositar(double valor){
        if (valor > 0){
            this.setSaldo(this.getSaldo()+valor);
            this.atualizaSaldoTotal();
            System.out.println("Deposito realizado com sucesso!");
        }else{
            System.out.println("Erro ao efetuar o deposito, tente novamente");
        }
    }
    public void sacar(double valor){
        if(valor>0 && this.getSaldoTotal()>=valor){
            if(this.getSaldo()>= valor){
                this.setSaldo(this.getSaldo()-valor);
                this.atualizaSaldoTotal();
                System.out.println("Saque efetuado com sucesso");
            }else{
                Double resto = this.getSaldo()-valor;
                this.setLimite(this.getLimite()-resto);
                this.setSaldo(0.0);
                this.atualizaSaldoTotal();
                System.out.println("Saque efetuado com sucesso, foi necessario utilizar seu limite.");
            }
        }else {
            System.out.println("Saque não efetuado, tente novamente");
        }
    }
    public void transferir(Conta destino, double valor){
        if (valor >=0 && this.getSaldoTotal()>=valor){
            if(this.getSaldo()>=valor){
                this.setSaldo(this.getSaldo()-valor);
                destino.setSaldo(destino.getSaldo()+valor);
                this.atualizaSaldoTotal();
                destino.atualizaSaldoTotal();
                System.out.println("Transferencia realizado com sucesso");
            }else{
                double resto = this.getSaldo()-valor;
                this.setLimite(this.getLimite()-resto);
                this.setSaldo(0.0);
                destino.setSaldo(destino.getSaldo()+valor);
                this.atualizaSaldoTotal();
                destino.atualizaSaldoTotal();
                System.out.println("Transferencia realizado com sucesso");
            }
        }else{
            System.out.println("Tranferencia nao realizada");
        }
    }




}
