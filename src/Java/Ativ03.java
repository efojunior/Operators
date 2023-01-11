package Java;

import java.util.*;

public class Ativ03 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        float produto, quantidade, valorFinal;

        System.out.println("SEJA BEM VINDO AO JAVA LANCHES E CAFÉ \n FAÇA SEU PEDIDO NO MENU ABAIXO \n 1 - Cachorro Quente \n 2 - X-Salada \n 3 - X-Bacon \n 4 - Bauru \n 5 - Refrigerante \n 6 - Suco de Laranja \n 7 - Café \n\n Digite O número correspondente ao Item: ");

        produto = entrada.nextFloat();

        if (produto == 1) {
            System.out.println("Você escolheu Cachorro Quente, que custa R$ 10,00. Quantas unidades serão? ");
            quantidade = entrada.nextFloat();

            valorFinal = (float) (quantidade * 10.00);

            System.out.println(" Você comprou " + quantidade + " Cachorros Quentes, com o valor total de R$" + valorFinal);

        } else if (produto == 2) {
            System.out.println("Você escolheu X-Salada, que custa R$ 15,00. Quantas unidades serão? ");
            quantidade = entrada.nextFloat();

            valorFinal = (float) (quantidade * 15.00);
            System.out.println(" Você comprou " + quantidade + " X-Saladas, com o valor total de R$" + valorFinal);

        } else if (produto == 3) {
            System.out.println("Você escolheu X-Bacon, que custa R$ 18,00. Quantas unidades serão? ");
            quantidade = entrada.nextFloat();

            valorFinal = (float) (quantidade * 18.00);
            System.out.println(" Você comprou " + quantidade + " X-Bacons, com o valor total de R$" + valorFinal);

        } else if (produto == 4) {
            System.out.println("Você escolheu Bauru, que custa R$ 12,00. Quantas unidades serão? ");
            quantidade = entrada.nextFloat();

            valorFinal = (float) (quantidade * 12.00);
            System.out.println(" Você comprou " + quantidade + " Baurus, com o valor total de R$" + valorFinal);

        } else if (produto == 5) {
            System.out.println("Você escolheu Refrigerante, que custa R$ 8,00. Quantas unidades serão? ");
            quantidade = entrada.nextFloat();

            valorFinal = (float) (quantidade * 8.00);
            System.out.println(" Você comprou " + quantidade + " Refrigerantes, com o valor total de R$" + valorFinal);

        } else if (produto == 6) {
            System.out.println("Você escolheu Suco de Laranja, que custa R$ 13,00. Quantas unidades serão? ");
            quantidade = entrada.nextFloat();

            valorFinal = (float) (quantidade * 13.00);
            System.out.println(" Você comprou " + quantidade + " Sucos de Laranja, com o valor total de R$" + valorFinal);

        } else if (produto == 7) {
            System.out.println("Você escolheu CAFÉ, que custa R$ 2,00. Quantas unidades serão? ");
            quantidade = entrada.nextFloat();

            valorFinal = (float) (quantidade * 2.00);
            System.out.println(" Você comprou " + quantidade + " CAFÉS, com o valor total de R$" + valorFinal);

        } else {

            System.out.println(" O produto escolhido não possui no cardápio!!");
        }
    }
}
