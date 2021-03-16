public class App {
    public static void main(String[] args) {
        System.out.println("--------------APP Banco--------------");

        Conta conta1 = new ContaCorrente("cliente1",1000,"0001","1111");
        Conta conta2 = new Poupanca("cliente2",2000, "0611","2222");
        Conta conta3 = new ContaSalario("cliente3",3000,"0511","3333");
        Conta conta4 = new ContaCorrente("cliente4",3000,"1111","4444");

        //conta1.depositar(100);
//        conta1.render();
//        conta2.render();
//        conta3.render();
        //conta2.sacar(5000);
        //conta2.depositar(200);
        conta4.transferir(20000,conta1);


        System.out.println(conta1);
        System.out.println(conta4);
//        System.out.println(conta3);
//        System.out.println(conta4);

    }
}
