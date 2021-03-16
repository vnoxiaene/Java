import java.util.Date;



public class Cliente {
    private static int contador = 101;

    private int codigo;
    private String nome;
    private String email;
    private String cpf;
    private Date dataNascimento;
    private Date dataCadastro;

    public Cliente(String nome, String email, String cpf, Date dataNascimento) {
        this.codigo = contador+1;
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.dataCadastro = new Date();
        contador++;
    }

    public static int getContador() {
        return contador;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getCpf() {
        return cpf;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public String toString() {
        return "Código: " + this.getCodigo() +
                "\nNome: " + this.getNome() +
                "\nE-mail: " + this.getEmail() +
                "\nCPF: " + this.getCpf() +
                "\nData de Nascimento: " + Utils.dateParaString(this.getDataNascimento()) +
                "\nData de Cadastro: " + Utils.dateParaString(this.getDataCadastro());
    }
}
