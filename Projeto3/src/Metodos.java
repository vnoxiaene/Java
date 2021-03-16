import java.util.ArrayList;

public class Metodos {
    public static void cadastrarProduto(){

            System.out.println("Informe os dados do produto: ");

            System.out.println("Nome do produto: ");
            String nome = Mercado.teclado.nextLine();
            Produtos p=buscarPorNome(nome);

            if ( p != null){
                System.out.println("Produto ja cadastrado!");
                System.out.println("Deseja atualizar informacoes deste protudo?");

                System.out.println("Nome do produto: ");
                p.setNome(Mercado.teclado.nextLine());

                System.out.println("Marca do produto: ");
                p.setMarca(Mercado.teclado.nextLine());

                System.out.println("Quantidade em Estoque do produto: ");
                p.setQntEstoque(Mercado.teclado.nextInt());

                System.out.println("PRODUTO ATUALIZADO COM SUCESSO");
                Mercado.menu();
            }
            System.out.println("Marca do produto: ");
            String marca = Mercado.teclado.nextLine();

            System.out.println("Valor do produto: ");
            Double valor = Mercado.teclado.nextDouble();

            System.out.println("Quantidade em Estoque do produto: ");
            int qntEstoque = Mercado.teclado.nextInt();

            Produtos produto = new Produtos(nome, marca, valor, qntEstoque);
            Mercado.produtos.add(produto);

            System.out.println("Produto cadastrado com sucesso!");
            System.out.println();
            System.out.println("Informacoes do produto cadastrado: ");
            System.out.println(produto);
            System.out.println();

            Mercado.menu();
    }

    public static void listarProdutos(){
        if(Mercado.produtos.size() > 0) {
            System.out.println("Lista de Produtos");
            System.out.println();

            for(Produtos produtos : Mercado.produtos) {
                System.out.println(produtos);
                System.out.println();
            }
            System.out.println();
        }else {
            System.out.println("Não existem contas cadastradas ainda.");
        }
        Mercado.menu();

    }
    public static void comprarProduto(){
        System.out.println("Qual o nome do produto que deseja comprar?");
        String nome_o = Mercado.teclado.nextLine();
        Produtos produto_o = buscarPorNome(nome_o);

        System.out.println("Qual a quantidade?");
        int qnt = Mercado.teclado.nextInt();

        if (qnt>0 && produto_o.getQntEstoque() >= qnt && produto_o != null){

            produto_o.setQntEstoque(produto_o.getQntEstoque()-qnt);
            Mercado.carrinho.add(produto_o);
            System.out.println("Compra realizada com sucesso");


        }else if(produto_o.getQntEstoque() < qnt){
            System.out.println("Não temos produtos em estoque para atender, estoque: " +produto_o.getQntEstoque());
        }else {
            System.out.println("Nao foi possivel concluir a compra");
        }
        Mercado.menu();
    }
    public static void vizualizarCarrinho(){
        if(Mercado.carrinho.size() > 0) {
            System.out.println("Lista de Produtos no Carrinho");
            System.out.println();

            for(Produtos produtos : Mercado.carrinho) {
                System.out.println(produtos);
                System.out.println();
            }
            System.out.println();
        }else {
            System.out.println("Não existem produtos no carrinho ainda.");
        }
        Mercado.menu();

    }
    private static Produtos buscarPorNome(String nome) {
        Produtos p = null;
        if(Mercado.produtos.size() > 0) {
            for(Produtos produtos : Mercado.produtos) {
                if(produtos.getNome().equalsIgnoreCase(nome)) {
                    p = produtos;
                }
            }
        }
        return p;
    }
}
