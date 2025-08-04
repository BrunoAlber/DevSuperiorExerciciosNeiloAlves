

import java.util.Scanner;
import java.util.concurrent.Callable;

public class Soma_Vetores {

    /**
     *
     * Problema "soma_vetores"
     *
     *
     * Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um
     * terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima
     * o vetor C gerado.
     *
     *
     *   Exemplo:
     * Quantos valores vai ter cada vetor? 6
     * Digite os valores do vetor A:
     * 8
     * 2
     * 11
     * 14
     * 13
     * 20
     * Digite os valores do vetor B:
     * 5
     * 10
     * 3
     * 1
     * 10
     * 7
     * VETOR RESULTANTE:
     * 13
     * 12
     * 14
     * 15
     * 23
     * 27
     *
     * @param args
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos valores vai ter cada vetor? ");
        int n = sc.nextInt();

        int[] A = new int[n];
        int[] B = new int[n];

        // elementos de C é soma dos elementos do vetor A e B
        int[] C = new int[n];

        System.out.println("Digite os valores do vetor A: ");
        for (int i = 0; i < A.length; i++) {

            A[i] = sc.nextInt();
        }

        System.out.println("Digite os valores do vetor B: ");
        for (int i = 0; i < B.length; i++) {

            B[i] = sc.nextInt();
        }

        System.out.println("VETOR RESULTANTE: ");
        for (int i = 0; i < C.length; i++) {

            C[i] = A[i] + B[i];
            System.out.println(C[i]);
        }

        sc.close();
    }
}
