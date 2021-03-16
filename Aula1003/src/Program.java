public class Program {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Ferrari();

        carro1.aceleradorAutomatico(100);
        carro1.aceleradorIntensidade(0.9);
        carro2.aceleradorIntensidade(0.2);
        carro2.aceleradorAutomatico(300);



    }
}
