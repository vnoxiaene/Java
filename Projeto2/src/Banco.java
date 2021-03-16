import java.util.ArrayList;
import java.util.Scanner;

public class Banco {

    static String nome = "Nome do Banco";
    static Scanner teclado = new Scanner(System.in);
    static ArrayList<Conta> contas;

    public static void main(String[] args) {
        Banco.contas = new ArrayList<>();
        Banco.menu();
    }

    static void menu() {
        int opcao = 0;
        System.out.println("=========================================");
        System.out.println("=================== ATM =================");
        System.out.println("================ " + Banco.nome + " ==============");
        System.out.println("=========================================");
        System.out.println("Selecione uma opção no menu: ");
        System.out.println("1 - Criar conta");
        System.out.println("2 - Efetuar saque");
        System.out.println("3 - Efetuar depósito");
        System.out.println("4 - Efetuar transferência");
        System.out.println("5 - Listar contas");
        System.out.println("6 - Sair do sistema");

        try {
            opcao = Integer.parseInt(Banco.teclado.nextLine());
        }catch(NumberFormatException e) {
            System.out.println("Por favor, informe uma opção válida.");
            Utils.pausar(1);
            Banco.menu();
        }
        switch (opcao) {
            case 1:
                Metodos.criarConta();
                break;
            case 2:
                Metodos.efetuarSaque();
                break;
            case 3:
                Metodos.efetuarDeposito();
                break;
            case 4:
                Metodos.efetuarTransferencia();
                break;
            case 5:
                Metodos.listarContas();
                break;
            case 6:
                System.out.println("Até a próxima!");
                Utils.pausar(2);
                System.exit(0);
            default:
                System.out.println("Opção inválida.");
                Utils.pausar(2);
                Banco.menu();
                break;
        }
    }

}


