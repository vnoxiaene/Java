public class Ferrari extends Carro{
    private final static int MAX_VEL = 320;
    @Override
    public final void aceleradorAutomatico(int velocidade){
        if (velocidade >0 && velocidade<=MAX_VEL){
            System.out.println("Executado Velocidade Maxima 240km/h");
        }else{
            System.out.println("Nao Executado velocidade deve ser entre 1 e "+MAX_VEL);
        }
    }
}
