import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Quantos funcionarios deseja cadastrar?");
        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();
        List<Funcionario>lista = new ArrayList<>();

        //gerador de id
        for (int i= 1; i <= n; i++){
            Integer id = i*4+(i+17);

            //gerador salario
            double salary = id+1000;
            //gerando nome e instanciando
            Funcionario funcionario = new Gerente("Gerente"+i,id.toString(),salary,i);
            lista.add(funcionario);
        }
        System.out.println();
        System.out.print("Enter the employee id that will have salary increase : ");
        int idsalary = teclado.nextInt();

        Funcionario funcionario = lista.stream().filter(x -> x.getId() == idsalary).findFirst().orElse(null);

    }
}
