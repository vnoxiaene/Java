package calculadora;

public class Program {
    public static void main(String[] args) {
        System.out.println("-----CALCULADORA JAVA-----");
        Methods methods = new Methods();

        int n1 = methods.recebeNumero();
        String op = methods.recebeOperacao();
        int n2 = methods.recebeNumero();

        switch (op){
            case "+":
                System.out.println(methods.soma(n1,n2));
                break;
            case "-":
                System.out.println(methods.sub(n1,n2));
                break;
            case "*":
                System.out.println(methods.mult(n1,n2));
                break;
            case "/":
                try{
                    System.out.println(methods.div(n1,n2));
                }catch (ArithmeticException e){
                    System.out.println("Nao é possivel realizar divisao por zero");
                }
                break;
            default:
                System.out.println("Operacao invalida, tente novamente");
        }
    }
}
