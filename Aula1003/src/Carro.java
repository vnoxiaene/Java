import java.util.Scanner;

public class Carro {
    private final static double MAX_INTENS = 1.0;
    private final static int MAX_VEL = 240;

    public final void aceleradorIntensidade(double intensidade){
        if (intensidade >0 && intensidade<=MAX_INTENS){
            System.out.println("Executado Velocidade Maxima de intensidade 1.0");
        }else{
            System.out.println("Nao Executado intensidade deve ser entre 0.1 e 1.0");
        }
    }

    public void aceleradorAutomatico(int velocidade){
        if (velocidade >0 && velocidade<=MAX_VEL){
            System.out.println("Executado Velocidade Maxima 240km/h");
        }else{
            System.out.println("Nao Executado velocidade deve ser entre 1 e "+MAX_VEL);
        }
    }
}
