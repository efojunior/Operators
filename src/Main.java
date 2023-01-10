
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int x, y, w, z;
        double e = 4.5424265;
        int dez = 10, cin = 5;
        boolean resposta;
        boolean proposicao_01;
        boolean proposicao_02;

        System.out.println("Digite um valor para X: ");
        x = ler.nextInt();
        System.out.println("Digite um valor para Y: ");
        y = ler.nextInt();
        System.out.println("Digite um valor para W: ");
        w = ler.nextInt();
        System.out.println("Digite um valor para Z: ");
        z = ler.nextInt();

        System.out.println("A soma de " + x + " + " + y + " = " + (x + y));

        System.out.println("A subtração de " + w + " - " + y + " = " + (w - y));

        System.out.println("A multiplicação de " + y + " * " + z + " = " + (y + z));

        System.out.println("A divisão de " + x + " / " + z + " = " + (x / z));

        System.out.println("O resto da divisão de  " + x + " / " + y + " = " + (x % y));

        System.out.printf("O Valor da variavel double com duas casas decimais é %.2f", Math.sqrt(e));

        resposta = dez > cin;
        System.out.println("O valor de 10 é maior que 5? " + resposta);

        resposta = dez == cin;
        System.out.println("O Valor de 10 é igual ao de 5? " + resposta);


        proposicao_01 = dez > cin;
        proposicao_02 = dez == cin;

        System.out.println("\n\n Conjunção \n\n");
        resposta = proposicao_01 && proposicao_02;

        System.out.println("\n\n Disjunção \n\n");
        resposta = proposicao_01 || proposicao_02;

        System.out.println("\n\n Negação \n\n");
        resposta = !proposicao_01 || !proposicao_02;


    }
}