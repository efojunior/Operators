package Java;

import java.util.Scanner;

public class LacoCondicional {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int idade;

        System.out.println("Digite a sua idade:");
        idade = entrada.nextInt();

        boolean cnh;

        System.out.println("Você possui CNH? True ou False");
        cnh = entrada.nextBoolean();

        if (idade >= 18 && cnh) {
            System.out.println("Você pode dirigir!");

        } else if (idade >= 18 && !cnh) {
            System.out.println("Você não pode dirigir...");

        } else {
            System.out.println("Infelizmente você não tem idade para dirigir...");
        }

    }
}
