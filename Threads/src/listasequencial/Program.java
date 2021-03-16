package listasequencial;

public class Program {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Aluno 1");
        Aluno aluno2 = new Aluno("Aluno 2");
        Aluno aluno3 = new Aluno("Aluno 3");
        Aluno aluno4 = new Aluno("Aluno 4");

        Vetor lista = new Vetor();

        lista.adiciona(aluno1);
        lista.adiciona(aluno2);
        lista.adiciona(aluno3);
        lista.adiciona(aluno4);

        System.out.println("A lista possui "+lista.tamanho()+" alunos.");

//        try {
//            System.out.println(lista.pega(10));
//        }catch (IllegalArgumentException e){
//            System.out.println(e);
//        }
//        try {
//            System.out.println(lista.pega(1));
//        }catch (IllegalArgumentException e){
//            System.out.println("Posicao invalida");
//        }
//        try {
//            lista.adiciona(200, aluno1);
//        }catch (IllegalArgumentException e){
//            System.out.println("Posicao invalida");
//        }
//        try {
//            lista.remover(2);
//        }catch (IllegalArgumentException e){
//            System.out.println("Posicao invalida");
//        }
//
//
//
//        System.out.println(lista.tamanho());

        System.out.println(lista);





    }
}
