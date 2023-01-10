package ExerciciosOperadores;

import java.util.*;

public class Ativ04 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        float numero1, numero2, numero3, numero4;
        float diferenca, contaNumero = 1;

        System.out.println("digite o número " + contaNumero);
        numero1 = entrada.nextInt();

        System.out.println("Digite o número " + (contaNumero + 1));
        numero2 = entrada.nextInt();

        System.out.println("Digite o número " + (contaNumero + 2));
        numero3 = entrada.nextInt();

        System.out.println("Digite o número " + (contaNumero + 3));
        numero4 = entrada.nextInt();

        diferenca = (numero1 * numero2) - (numero3 * numero4);

        System.out.println("A diferença do produto entre " + numero1 + " e " + numero2 + " pelo produto entre " + numero3 + " e " + numero4 + " é de: " + diferenca);

    }
}
