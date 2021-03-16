import java.util.Random;

public class Calcula {
    int dificuldade;
    int n1;
    int n2;
    int operacao;
    int resultado;

    public Calcula(int dificuldade){
        Random random = new Random();
        this.operacao = random.nextInt(3);
        this.dificuldade =dificuldade;

        if(dificuldade == 1){
            this.n1 = random.nextInt(10);
            this.n2 = random.nextInt(10);
        }
        if(dificuldade == 2){
            this.n1 = random.nextInt(100);
            this.n2 = random.nextInt(100);
        }
        if(dificuldade == 3){
            this.n1 = random.nextInt(500);
            this.n2 = random.nextInt(500);
        }
        if(dificuldade == 4){
            this.n1 = random.nextInt(1000);
            this.n2 = random.nextInt(1000);
        }
    }
    public int getDificuldade(){ return dificuldade; }
    public int getN1(){ return n1; }
    public int getN2(){ return n2; }
    public int getOperacao(){ return operacao; }
    public int getResultado(){ return resultado; }

    public boolean somar (int resposta){
        this.resultado = this.getN1() + this.getN2();
        boolean certo = false;

        if (resposta == this.getResultado()){
            System.out.println("Resposta Correta");
            certo = true;
        }else{
            System.out.println("Resposta Incorreta");
        }
        System.out.println(getN1() +" + "+getN2()+ " = "+getResultado() );
        return certo;
    }
    public boolean subtracao (int resposta){
        this.resultado = this.getN1() - this.getN2();
        boolean certo = false;

        if (resposta == this.getResultado()){
            System.out.println("Resposta Correta");
            certo = true;
        }else{
            System.out.println("Resposta Incorreta");
        }
        System.out.println(getN1() +" - "+getN2()+ " = "+getResultado() );
        return certo;
    }
    public boolean multiplicacao (int resposta){
        this.resultado = this.getN1() * this.getN2();
        boolean certo = false;

        if (resposta == this.getResultado()){
            System.out.println("Resposta Correta");
            certo = true;
        }else{
            System.out.println("Resposta Incorreta");
        }
        System.out.println(getN1() +" * "+getN2()+ " = "+getResultado() );
        return certo;
    }

}
