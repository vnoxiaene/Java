public class Escola {
    public static void main(String[] args) {

        Funcionario f1 = new Funcionario("Pedro Lopes", 1980,"email@funcionario", "ABC123");
        Professor prof1 = new Professor("Joana Lopes", 1970,"email@professor","ABC456","123456");
        Aluno aluno1 = new Aluno("Marcelo Lima", 2010, "email@aluno", "100200300");


        System.out.println(f1);
        System.out.println(prof1);
        System.out.println(aluno1);
        System.out.println(f1.getNome());


    }
}
