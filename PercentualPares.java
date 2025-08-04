

import java.util.Scanner;

public class PercentualPares {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros você quer digitar? ");
        int n = sc.nextInt();

        double somaPares, quantidadePares,percentualPares;
        double mediaPares;

        int[] numeros = new int[n];

        for (int i = 0; i < n; i++) {

            System.out.print("Digite o "+(i + 1)+"º numero: ");
            numeros[i] = sc.nextInt();
        }

        somaPares = 0;
        mediaPares = 0;
        for (int i = 0; i < n; i++) {

            if (numeros[i] % 2 == 0){

                somaPares+=numeros[i];
            }

            mediaPares = somaPares / n;
        }

        System.out.printf("Média de Números pares = %.2f\n",mediaPares);

        percentualPares = 0;
        quantidadePares = 0;
        for (int i = 0; i < n; i++) {

            if (numeros[i] % 2 == 0){

                quantidadePares++;

            }

            percentualPares = ((double) quantidadePares / n )* 100; // calcular o percentual: conta a quantidade de pares , divide pelo total de elementos e multiplica por cem.
        }

        System.out.printf("Percentua de Pares: %.1f%%\n",percentualPares);

        sc.close();
    }
}
