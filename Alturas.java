

import java.util.Locale;
import java.util.Scanner;

public class Alturas {

    /**
     * Problema "alturas"
     *
     * Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
     * tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
     * bem como os nomes dessas pessoas caso houver.
     *
     *
     * Exemplo:
     * Quantas pessoas serao digitadas? 5
     * Dados da 1a pessoa:
     * Nome: Joao
     * Idade: 15
     * Altura: 1.82
     * Dados da 2a pessoa:
     * Nome: Maria
     * Idade: 16
     * Altura: 1.60
     * Dados da 3a pessoa:
     * Nome: Teresa
     * Idade: 14
     * Altura: 1.58
     * Dados da 4a pessoa:
     * Nome: Carlos
     * Idade: 21
     * Altura: 1.65
     * Dados da 5a pessoa:
     * Nome: Paulo
     * Idade: 17
     * Altura: 1.78
     *
     * Altura média: 1.69
     * Pessoas com menos de 16 anos: 40.0%
     * Joao
     * Teresa
     *
     * @param args
     */
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double somaTotal,alturaMedia,percentualMenores;

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();

        String[] nomes = new String[n];
        int[] idades = new  int[n];
        double[] alturas = new double[n];

        for (int i = 0; i < n; i++) {

            System.out.println("Dados da "+(i + 1)+"a pessoas");
            System.out.print("Nome: ");
            nomes[i] = sc.next();
            System.out.print("Idade: ");
            idades[i] = sc.nextInt();
            System.out.print("Altura: ");
            alturas[i] = sc.nextDouble();
        }


        somaTotal = 0;
        alturaMedia = 0;
        for (int i = 0; i < n; i++) {

            somaTotal+=alturas[i];
            alturaMedia = somaTotal / n;
        }

        System.out.printf("Altura Média:%.2f\n",alturaMedia);


        int contaIdades = 0;
        percentualMenores = 0;
        for (int i = 0; i < n; i++) {

            if (idades[i] < 16){

                contaIdades++;

            }

            percentualMenores = ((double) contaIdades / n ) * 100.0;

        }

        System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n",percentualMenores);


        for (int i = 0; i < n; i++) {

            if (idades[i] < 16 ) {
                System.out.println(nomes[i]);
            }
        }


     sc.close();

    }
}
