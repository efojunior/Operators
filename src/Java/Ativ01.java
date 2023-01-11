package Java;

import java.util.*;

public class Ativ01 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int a, b, c, soma;

        System.out.println("Digite o primeiro número:");
        a = entrada.nextInt();

        System.out.println("Digite o segundo número:");
        b = entrada.nextInt();

        System.out.println("Digite o terceiro número:");
        c = entrada.nextInt();

        soma = a + b;

        if (soma > c) {
            System.out.println(" A soma do primeiro número, " + a + " com o segundo número, " + b + " com resultado: " + soma + ". É maior que o terceiro número:  " + c);

        } else if (soma < c) {
            System.out.println(" A soma do primeiro número, " + a + " com o segundo número, " + b +  " com resultado: " + soma + ". É menor que o terceiro número:  " + c);

        } else if (soma == c) {
            System.out.println(" A soma do primeiro número, " + a + " com o segundo número, " + b +  " com resultado: " + soma + ". É  igual que o terceiro número:  " + c);

        }
    }
}
