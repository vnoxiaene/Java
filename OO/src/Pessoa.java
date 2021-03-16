public abstract class Pessoa {
    private String nome, email;
    private int ano_nascimento;


    public Pessoa(String nome, int ano_nascimento, String email) {
        this.nome = nome;
        this.ano_nascimento = ano_nascimento;
        this.email = email;

    }

    public Pessoa(String nome, int ano_nascimento) {
        this.nome = nome;
        this.ano_nascimento = ano_nascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAno_nascimento() {
        return ano_nascimento;
    }

    public void setAno_nascimento(int ano_nascimento) {
        this.ano_nascimento = ano_nascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString(){
        return "Nome: " +this.nome+ "\nAno de Nascimento: " +this.ano_nascimento+ "\n";
    }

}
