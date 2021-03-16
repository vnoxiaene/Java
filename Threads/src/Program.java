public class Program {
    public static void main(String[] args) {

        BarraDeTarefas barraDeTarefas = new BarraDeTarefas();
        Thread t1 =new Thread(barraDeTarefas);
        t1.start();

        Relatorio relatorio=new Relatorio();
        Thread t2 =new Thread(relatorio);
        t2.start();


    }
}
