

import java.util.Scanner;

public class NumerosPares {

    /**
     * Problema "numeros_pares"
     *
     * Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
     * tela todos os números pares, e também a quantidade de números pares.
     *
     *  Exemplo:
     * Quantos numeros voce vai digitar? 6
     * Digite um numero: 8
     * Digite um numero: 2
     * Digite um numero: 11
     * Digite um numero: 14
     * Digite um numero: 13
     * Digite um numero: 20
     *
     * NUMEROS PARES:
     * 8  2  14  20
     *
     * QUANTIDADE DE PARES = 4
     *
     * @param args
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros você vai digitar? ");
        int n = sc.nextInt();

        int numerosPares, contaPares;

        int[] numeros = new int[n];

        for (int i = 0; i < numeros.length; i++) {

            System.out.print("Digite um numero: ");
            numeros[i] = sc.nextInt();
        }

        numerosPares = 0;
        contaPares = 0;

        System.out.println("NUMEROS PARES: ");
        for (int i = 0; i < n; i++) {

            if (numeros[i] % 2 == 0){

                contaPares++;
                numerosPares = numeros[i];
                System.out.print(numerosPares+"  ");
            }

        }

        System.out.println();
        System.out.print("\nQUANTIDADE DE PARES = "+contaPares);
        sc.close();

    }
}
