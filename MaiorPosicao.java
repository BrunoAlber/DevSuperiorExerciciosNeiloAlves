

import java.util.Locale;
import java.util.Scanner;

public class MaiorPosicao {

    /**
     *  Problema "maior_posicao"
     *
     *   Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
     * o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
     * considerando a primeira posição como 0 (zero).
     *
     *
     *
     * @param args
     */
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros você vai digitar? ");
        int n = sc.nextInt();

        double[] numeros = new double[n];

        for (int i = 0; i < n; i++) {

            System.out.print("Digite um numero: ");
            numeros[i] = sc.nextDouble();
        }

        double maiorNumero = numeros[0];
        int posiçãoMaior = 0;
        for (int i = 0; i < n; i++) {

            if (numeros[i] > maiorNumero){

                maiorNumero = numeros[i];
                posiçãoMaior = i;
            }
        }

        System.out.print("MAIOR VALOR = "+maiorNumero);
        System.out.println("\nPOSICAO DO MAIOR VALOR =  "+posiçãoMaior);

        sc.close();

    }
}
