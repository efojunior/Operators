package ExerciciosOperadores;
import java.util.*;
public class Ativ02 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int nota1, nota2, nota3, nota4;
        int media, i, contAluno = 0;

        for(i = 0; i < 4; i++){

            contAluno++;
            // recebe a 1º nota
            System.out.println("Aluno " + contAluno + ", digite sua 1ª nota");
            nota1 = entrada.nextInt();

            // recebe a 2º nota
            System.out.println("Aluno " + contAluno + ", digite sua 2ª nota");
            nota2 = entrada.nextInt();

            // recebe a 3º nota
            System.out.println("Aluno " + contAluno + ", digite sua 3ª nota");
            nota3 = entrada.nextInt();

            // recebe a 4º nota
            System.out.println("Aluno " + contAluno + ", digite sua 4ª nota");
            nota4 = entrada.nextInt();

            // calcula a média
            media = (nota1 + nota2 + nota3 + nota4 ) / 4;
            System.out.println("A média do aluno " + contAluno + " é " + media);

            // mostra a nota do aluno
            if( (media >= 0) && (media <4) ){
                System.out.println("Nota E");
            } else if(media < 5){
                System.out.println("Nota D");
            } else if(media < 7){
                System.out.println("Nota C");
            } else if(media < 8){
                System.out.println("Nota B");
            } else if(media <= 10){
                System.out.println("Nota A");
            }
        }
    }
}
