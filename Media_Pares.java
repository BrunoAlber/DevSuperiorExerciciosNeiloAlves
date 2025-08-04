

import java.util.Scanner;

public class Media_Pares {

    public static void main(String[] args) {

        /**
         *
         * Problema "media_pares"
         *
         *  Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média
         * aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for
         * digitado, mostrar a mensagem "NENHUM NUMERO PAR"
         *
         *
         * Exemplo 1:
         * Quantos elementos vai ter o vetor? 6
         * Digite um numero: 8
         * Digite um numero: 2
         * Digite um numero: 11
         * Digite um numero: 14
         * Digite um numero: 13
         * Digite um numero: 20
         * MEDIA DOS PARES = 11.0
         *
         * Exemplo 2:
         * Quantos elementos vai ter o vetor? 3
         * Digite um numero: 7
         * Digite um numero: 9
         * Digite um numero: 11
         * NENHUM NUMERO PAR
         *
         *
         */
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();

        double mediaAritmetrica, somaTotal;
        boolean encontra = false;
        int[] vetor = new int[n];

        for (int i = 0; i < vetor.length; i++) {

            System.out.print("Digite um numeros: ");
            vetor[i] = sc.nextInt();
        }


        somaTotal = 0;
        mediaAritmetrica = 0;
        double contaPares = 0;
        for (int i = 0; i < vetor.length; i++) {

            if (vetor[i] % 2 == 0) {

                contaPares++;
                somaTotal += vetor[i];
            }

        }


        if (contaPares == 0) {

            System.out.println("NENHUM NUMERO PAR");

        }else {

            mediaAritmetrica = somaTotal / contaPares;
            System.out.printf("MEDIA DOS PARES = %.1f\n", mediaAritmetrica);

        }

        sc.close();
    }
}

