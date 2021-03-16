public class Professor extends Funcionario{
    private String matricula;

    public Professor(String nome, int ano_nascimento, String email, String id, String matricula) {
        super(nome, ano_nascimento, email, id);
        this.matricula = matricula;
    }
    public String toString(){
        return "Matricula: " +this.matricula+"\n"+super.toString() + "\n";
    }
    public String getNome(){
        return "Professor: " +super.getNome() ;
    }
}
