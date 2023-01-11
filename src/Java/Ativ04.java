package Java;

import java.util.*;

public class Ativ04 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int idade;

        System.out.println("Digite sua idade:");
        idade = entrada.nextInt();

        if (idade >= 16 && idade < 18) {
            System.out.println("Você está apta a votar e seu voto é facultativo.");

        } else if (idade >= 18 && idade < 65) {
            System.out.println("Você está apta a votar e seu voto é obrigatório.");

        } else if (idade >= 65) {
            System.out.println("Você está apta a votar e seu voto é facultativo.");

        } else {
            System.out.println(" Você não está apto a votar!");
        }
    }
}
