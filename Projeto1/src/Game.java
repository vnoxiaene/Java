import java.util.Scanner;

public class Game {
    static int pontos = 0;
    static Calcula calcula;
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) { Game.jogar();}

    public static void jogar(){

        System.out.println("Qual a dificuldade do Jogo? 1- Easy / 2- Medium / 3- Hard / 4- Expert");
        Game.calcula = new Calcula(Game.teclado.nextInt());

        System.out.println("Qual o resultado a seguinte operacao:");
        Game.teclado.nextLine();

        if (calcula.getOperacao() == 0){
            System.out.println(calcula.getN1()+" + "+calcula.getN2());
            int resposta = Game.teclado.nextInt();

            if(calcula.somar(resposta)){
                pontos++;
                System.out.println("Voce tem "+Game.pontos);
            }
        }
        if (calcula.getOperacao() == 1){
            System.out.println(calcula.getN1()+" - "+calcula.getN2());
            int resposta = Game.teclado.nextInt();

            if(calcula.subtracao(resposta)){
                pontos++;
                System.out.println("Voce tem "+Game.pontos);
            }
        }
        if (calcula.getOperacao() == 2){
            System.out.println(calcula.getN1()+" * "+calcula.getN2());
            int resposta = Game.teclado.nextInt();

            if(calcula.multiplicacao(resposta)){
                pontos++;
                System.out.println("Voce tem "+Game.pontos);
            }
        }

        System.out.println("Deseja continuar jogando? 0- Sim | 1- Nao");
        int sair = Game.teclado.nextInt();
        if(sair == 0){
            Game.jogar();
        } else if(sair == 1){
            System.out.println("Obrigado por jogar. \nVoce fez "+Game.pontos+" pontos.");
            System.exit(0);
        }else{
            System.out.println("Opcao Invalida");
            System.exit(0);
        }


    }



}
