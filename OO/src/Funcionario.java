public class Funcionario extends Pessoa {
    private String id;


    public Funcionario(String nome, int ano_nascimento, String email, String id) {
        super(nome, ano_nascimento,email);
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String toString(){
        return "ID do Funcionario: " +this.id+ "\n"+super.toString() +"\n";
    }

    public String getNome(){
        return "Funcionario: " +super.getNome() ;
    }
}
