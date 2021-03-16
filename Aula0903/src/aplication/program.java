package aplication;

import entities.Produto;

public class program {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Produto1","Lsakhlghklas jiaflÇJ", 50);
        System.out.println(produto1);

        Produto produto2 = new Produto("Produto2","Lsakhlghklas jiaflÇJ", 150);
        produto2.desconto(10);
        System.out.println(produto2);

        Produto produto3 = new Produto("Produto3","Lsakhlghklas jiaflÇJ", 10);
        System.out.println(produto3);

        Produto produto4 = new Produto("Produto4","Lsakhlghklas jiaflÇJ", 1000);
        System.out.println(produto4);



    }
}
