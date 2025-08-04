

import java.util.Locale;
import java.util.Scanner;

public class AbaixodaMediaVersao2 {

    /**
     *
     *  Problema "abaixo_da_media"
     *
     *  Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida,
     * mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos
     * os elementos do vetor que estejam abaixo da média, com uma casa decimal cada.
     *
     *
     *
     * Exemplo:
     * Quantos elementos vai ter o vetor? 4
     * Digite um numero: 10.0
     * Digite um numero: 15.5
     * Digite um numero: 13.2
     * Digite um numero: 9.8
     *
     * MEDIA DO VETOR = 12.125
     * ELEMENTOS ABAIXO DA MEDIA:
     * 10.0
     * 9.8
     *
     *
     *
     * @param args
     */

    public static void main(String[] args) {


        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

      System.out.print("Quantos Nomes serão digitados? ");
      int n = sc.nextInt();

      System.out.print("Quantas notas serão digitadas? ");
      int N = sc.nextInt();

        String[] nome = new String[n];
        double[] Nota = new double[N];


        double mediaAluno,somaTotal;

        for (int i = 0; i < nome.length; i++) {

            System.out.print("Nome: ");
            sc.nextLine();
            nome[i] = sc.nextLine();
        }

        for (int i = 0; i < Nota.length; i++) {
            
             System.out.print("Digite a "+(i + 1)+"º Nota: ");
            Nota[i] = sc.nextDouble();

        }

        mediaAluno = 0;
        somaTotal = 0;
        for (int i = 0; i < Nota.length; i++) {

            somaTotal+=Nota[i];
        }

        mediaAluno = somaTotal / 2;
        System.out.printf("NOTA MEDIA DO ALUNO = %.2f\n",mediaAluno);

        System.out.print("Situação: ");
        if (mediaAluno < 6.0) {
            
            System.out.print("ALUNO REPROVADO");
        }else{
            System.out.print("ALUNO APROVADO");
        }


        sc.close();
    }
}
