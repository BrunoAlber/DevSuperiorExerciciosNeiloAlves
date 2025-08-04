

import java.util.Locale;
import java.util.Scanner;

public class dados_Pessoas {

    /**
     * Problema "dados_pessoas"
     *
     *  Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa
     * que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número
     * de homens.
     *
     *
     *  Exemplo:
     * Quantas pessoas serao digitadas? 5
     * Altura da 1a pessoa: 1.70
     * Genero da 1a pessoa: F
     * Altura da 2a pessoa: 1.83
     * Genero da 2a pessoa: M
     * Altura da 3a pessoa: 1.54
     * Genero da 3a pessoa: M
     * Altura da 4a pessoa: 1.61
     * Genero da 4a pessoa: F
     * Altura da 5a pessoa: 1.75
     * Genero da 5a pessoa: F
     * Menor altura = 1.54
     * Maior altura = 1.83
     * Media das alturas das mulheres = 1.69
     * Numero de homens = 2
     *

     * @param args
     */
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();

        double[] altura = new double[n];
        char[] genero = new char[n];

        double maiorAltura,menorAltura;
        double  mediaAlturaMulheres,somaTotalMuçheres;
        int contaHomens;

        for (int i = 0; i < n; i++) {

            System.out.print("Altura da "+(i + 1)+"a pessoa: ");
            altura[i] = sc.nextDouble();
            System.out.print("Genero da "+(i + 1)+"a pessoa: ");
            genero[i] = sc.next().charAt(0);
        }

        maiorAltura = altura[0];
        menorAltura = altura[0];
        for (int i = 0; i < n; i++) {


            if (altura[i] > maiorAltura){

                maiorAltura = altura[i];

            }

            if (altura[i] < menorAltura){

                menorAltura = altura[i];
            }
        }

        System.out.printf("\nMenor Altura = %.2f\n",menorAltura);
        System.out.printf("Maior Altura = %.2f\n",maiorAltura);

        contaHomens = 0;
        int contaMulheres = 0;
        somaTotalMuçheres = 0;
        mediaAlturaMulheres = 0;
        for (int i = 0; i < n; i++) {

            if (genero[i] == 'F'){

                contaMulheres++;
                somaTotalMuçheres+=altura[i];
                mediaAlturaMulheres = somaTotalMuçheres / contaMulheres;

            }

            if (genero[i] == 'M'){

                contaHomens++;
            }
        }

        System.out.printf("\nMedia das alturas das mulheres = %.2f\n",mediaAlturaMulheres);
        System.out.print("Numero de homens = "+contaHomens);


        int qtMulheress = 0;
        double percentualMulheres =0;
        double percentualHomens = 0;
        for (int i = 0; i < n; i++) {

            if (genero[i] == 'F'){

                qtMulheress++;
                percentualMulheres = ((double) qtMulheress/n) * 100.0;

            }

            if (genero[i] == 'M'){

                percentualHomens = ((double) contaHomens/n ) * 100.0;
            }
        }

        System.out.printf("\nPorcentagem de Mulheres = %.1f%%\n",percentualMulheres);
        System.out.printf("Porcentagem de Homens = %.1f%%\n",percentualHomens);


        sc.close();

    }
}
