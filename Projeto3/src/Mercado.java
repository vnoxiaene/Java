import java.util.ArrayList;
import java.util.Scanner;

public class Mercado {

    static String nome = "Nome do Mercado";
    static Scanner teclado = new Scanner(System.in);
    static ArrayList<Produtos>produtos;
    static ArrayList<Produtos>carrinho= new ArrayList<>();


    public static void main(String[] args) {
        Mercado.produtos = new ArrayList<>();
        Mercado.menu();
    }

    static void menu() {
        int opcao = 0;
        System.out.println("--------"+Mercado.nome+"-----------");
        System.out.println("--------Menu de opcoes-------------");
        System.out.println("1- Cadastrar Produto");
        System.out.println("2- Listar Produtos");
        System.out.println("3- Comprar Produto");
        System.out.println("4- Vizualizar Carrinho");
        System.out.println("5- Sair");

        try{
            opcao = Integer.parseInt(Mercado.teclado.nextLine());
        }catch (NumberFormatException e){
            System.out.println("Por favor, informe uma opção válida.");
            Mercado.menu();
        }

        switch (opcao){
            case 1:
                Metodos.cadastrarProduto();
                break;
            case 2:
                Metodos.listarProdutos();
                break;
            case 3:
                Metodos.comprarProduto();
                break;
            case 4:
                Metodos.vizualizarCarrinho();
                break;
            case 5:
                System.out.println("Obrigado!!!");
                System.exit(0);
                break;
            default:
                System.out.println("Opcao invalida");
                Mercado.menu();
                break;
        }

    }
}
