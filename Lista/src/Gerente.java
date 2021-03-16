public class Gerente extends Funcionario{
    int numeroSubor;
    String cargo = "Gerente";
    double bonificacao = 20;

    public Gerente(String nome, String id, double salario, int numeroSubor) {
        super(nome, id, salario);
        this.numeroSubor = numeroSubor;
    }

    @Override
    public String toString() {
        return "ID='" + id +" \n Nome='" + nome +  "\nCargo='" + cargo+
                "\nSalario=" + getSalario() + "\nBonificacao=" +bonificacao+ "\nNumero de Subordinados: " +numeroSubor+ "\n";
    }
}
