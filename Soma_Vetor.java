

import java.util.Locale;
import java.util.Scanner;

public class Soma_Vetor {

    /**
     *  Problema "soma_vetor"
     *
     *  Faça um programa que leia N números reais e armazene-os em um vetor.
     *  Em seguida: - Imprimir todos os elementos do vetor - Mostrar na tela a soma e a média dos elementos do vetor
     *
     *  Exemplo:
     * Quantos numeros voce vai digitar? 4
     * Digite um numero: 8.0
     * Digite um numero: 4.0
     * Digite um numero: 10.0
     * Digite um numero: 14.0
     * VALORES = 8.0  4.0  10.0  14.0
     * SOMA = 36.00
     * MEDIA = 9.00
     *
     * @param args
     */
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros você vai digitar? ");
        int n = sc.nextInt();

        double[] numeros = new double[n];

        double valores, soma,somatotal,media;

        for (int i = 0; i < n; i++) {

            System.out.print("Digite um numero: ");
            numeros[i] = sc.nextDouble();
        }


        System.out.print("VALORES = ");
        for (int i = 0; i < n; i++) {

            System.out.print(numeros[i]+"  ");

        }


        soma = 0;
        for (int i = 0; i < n; i++) {

            soma+=numeros[i];
        }

        System.out.printf("\nsoma = %.2f\n",soma);

        media = soma / n;
        System.out.printf("MEDIA = %.2f\n",media);









        sc.close();
    }

}
