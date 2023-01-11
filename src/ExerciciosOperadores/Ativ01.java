package ExerciciosOperadores;
import java.util.*;

public class Ativ01 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int salario, abono;

        System.out.println(" Digite o seu salário:");
        salario = ler.nextInt();

        System.out.println(" Digite o seu Abono:");
        abono = ler.nextInt();

        System.out.println("O novo salário é de: R$" + (salario + abono));

    }
}
