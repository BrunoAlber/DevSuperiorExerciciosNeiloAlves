

import java.util.Scanner;

public class Negativos {

    /**
     *   Problema "negativos"
     *
     *   Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
     *   e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.
     *
     *   Exemplo:
     * Quantos numeros voce vai digitar? 6
     * Digite um numero: 8
     * Digite um numero: -2
     * Digite um numero: 9
     * Digite um numero: 10
     * Digite um numero: -3
     * Digite um numero: -7
     * NUMEROS NEGATIVOS: -2 -3 -7
     *
     * @param args
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros você que digitar? ");
        int n = sc.nextInt();

        int[] numeros = new int[n];

        int numerosNegativos = 0 ;

        for (int i = 0; i < numeros.length; i++) {

            System.out.print("Digite um numero: ");
            numeros[i] = sc.nextInt();

        }


        System.out.println("NUMEROS NEGATIVOS: ");
        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] < 0){

                System.out.println(numeros[i]);

        }


            }
        }

    }

