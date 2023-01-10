package ExerciciosOperadores;
import java.util.*;

public class Ativ03 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int salarioBruto, adicionalNoturno, horaExtra, horaExtraRealizada, desconto, salarioLiquido;
        int salarioFinal, i, contaEmpregado = 0;

        for(i = 0; i < 4; i++){

            contaEmpregado++;

            System.out.println("Empregado " + contaEmpregado + ",  Digite o Salario em R$");
            salarioBruto = entrada.nextInt();
            System.out.println("Empregado " + contaEmpregado + ",  Digite o Adicional em R$");
            adicionalNoturno = entrada.nextInt();
            System.out.println("Empregado " + contaEmpregado + ",  Digite o Valor da Hora Extra em R$");
            horaExtra = entrada.nextInt();
            System.out.println("Empregado " + contaEmpregado + ",  Digite a quantidade de Horas Extras Realizadas");
            horaExtraRealizada = entrada.nextInt();
            System.out.println("Empregado " + contaEmpregado + ",  Digite o Desconto em R$");
            desconto = entrada.nextInt();

            salarioLiquido = salarioBruto + adicionalNoturno + (horaExtra * horaExtraRealizada) - desconto;
            System.out.println("O salário do Empregado " + contaEmpregado + " é R$ " + salarioLiquido);
        }

    }
}
