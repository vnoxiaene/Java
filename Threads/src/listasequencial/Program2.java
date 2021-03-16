package listasequencial;

public class Program2 {
    public static void main(String[] args) {
        Vetor lista = new Vetor();

        for (int i=0; i<125; i++){
            Aluno a = new Aluno("Aluno " +i);
            lista.adiciona(a);
        }
        System.out.println(lista.pega(0));
        
    }
}
