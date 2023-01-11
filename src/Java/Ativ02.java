package Java;

import java.util.*;

public class Ativ02 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero;

        System.out.println("Digite um número:");
        numero = entrada.nextInt();

        if (numero > 0 && numero % 2 == 0) {
            System.out.println("O número " + numero + " é inteiro positivo e par.");

        } else if (numero > 0 && numero % 2 != 0) {
            System.out.println("O número " + numero + " é inteiro positivo e ímpar.");

        } else if (numero < 0 && numero % 2 == 0) {
            System.out.println("O número " + numero + " é inteiro negativo e par.");

        } else if (numero < 0 && numero % 2 != 0) {
            System.out.println("O número " + numero + " é inteiro negativo e ímpar.");

        }
    }
}
