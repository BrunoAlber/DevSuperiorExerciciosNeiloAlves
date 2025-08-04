

import java.util.Scanner;

public class Mais_Velho {


    /**
     *
     * Problema "mais_velho"
     *
     *  Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes
     * devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome
     * da pessoa mais velha.
     *
     *   Exemplo:
     * Quantas pessoas voce vai digitar? 5
     * Dados da 1a pessoa:
     * Nome: Joao
     * Idade: 16
     * Dados da 2a pessoa:
     * Nome: Maria
     * Idade: 21
     * Dados da 3a pessoa:
     * Nome: Teresa
     * Idade: 15
     * Dados da 4a pessoa:
     * Nome: Carlos
     * Idade: 23
     * Dados da 5a pessoa:
     * Nome: Paulo
     * Idade: 17
     * PESSOA MAIS VELHA: Carlos
     *
     * @param args
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas você vai digitar? ");
        int n = sc.nextInt();

        String[] nomes = new String[n];
        int[] idades = new int[n];

        for (int i = 0; i < n; i++) {

            System.out.println("Dados da "+(i + 1)+"a pessoa");
            System.out.print("Nome: ");
            sc.nextLine();
            nomes[i] = sc.next();
            System.out.print("Idade: ");
            idades[i] = sc.nextInt();
        }

        int maisVelho = 0;
     //   System.out.print("PESSOA MAIS VELHA: ");
        for (int i = 0; i < n; i++) {

            if (idades[i] > idades[maisVelho]){


                maisVelho = i;
            }
        }

        System.out.print("PESSOA MAIS VELHA: "+nomes[maisVelho]);










        sc.close();
    }

}
