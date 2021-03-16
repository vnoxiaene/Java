public class Aluno extends Pessoa{

    private String ra;

    public Aluno(String nome, int ano_nascimento, String email, String ra) {
        super(nome, ano_nascimento,email);
        this.ra = ra;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }
    public String toString(){
        return "RA:. " +this.ra+ "\n" +super.toString()+  "\n";
    }

    public String getNome(){
        return "Aluno: " +super.getNome() ;
    }
}
