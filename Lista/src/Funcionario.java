import java.util.List;

public class Funcionario {
    String nome;
    int id;
    private double salario;
    private double bonificacao;
    private String cargo;

    public Funcionario(String nome, int id, double salario, double bonificacao, String cargo) {
        this.nome = nome;
        this.id = id;
        this.salario = salario;
        this.bonificacao = bonificacao;
        this.cargo = cargo;
    }
    public Funcionario(String nome, int id, double salario, double bonificacao) {
        this.nome = nome;
        this.id = id;
        this.salario = salario;
        this.bonificacao = bonificacao;
    }
    public Funcionario(String nome, int id, double salario) {
        this.nome = nome;
        this.id = id;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private void setSalario(Double salario){
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public double getBonificacao() {
        return bonificacao;
    }


    public String getCargo() {
        return cargo;
    }

    @Override
    public String toString() {
        return "ID='" + id +"\nNome='" + nome +  "\nCargo='" + cargo +
                "\nSalario=" + salario + "\nBonificacao=" + bonificacao +"\n";

    }

    public void bonus(int bonificacao){
        setSalario(salario + salario*bonificacao/100f);
    }

    public void aumentaSalario(int id, int porcentagem){
        setSalario(salario+salario*porcentagem/100);

    }



}




