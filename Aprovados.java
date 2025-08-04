

import java.util.Locale;
import java.util.Scanner;

public class Aprovados {

    /**
     * Problema "aprovados"
     *
     *   Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram
     * no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir
     * os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou
     * igual a 6.0 (seis).
     *
     *
     * Exemplo:
     * Quantos alunos serao digitados? 4
     * Digite nome, primeira e segunda nota do 1o aluno:
     * Joao Silva
     * 7.0
     * 8.5
     * Digite nome, primeira e segunda nota do 2o aluno:
     * Maria Teixeira
     * 9.2
     * 6.5
     * Digite nome, primeira e segunda nota do 3o aluno:
     * Carlos Carvalho
     * 5.0
     * 6.0
     * Digite nome, primeira e segunda nota do 4o aluno:
     * Teresa Pires
     * 5.5
     * 6.5
     * Alunos aprovados:
     * Joao Silva
     * Maria Teixeira
     * Teresa Pires
     *
     * @param args
     */
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos serão digitados? ");
        int n = sc.nextInt();

        double media, somaNotas;

        String[] nomes = new String[n];
        double[] nota1 = new double[n];
        double[] nota2 = new double[n];

        for (int i = 0; i < n; i++) {

            sc.nextLine();
            System.out.println("Digite o nome, primeira e segunda nota do "+ ( i + 1 )+"o aluno: ");
            nomes[i] = sc.nextLine();
            nota1[i] = sc.nextDouble();
            nota2[i] = sc.nextDouble();
        }

        somaNotas = 0;
        media = 0;
        System.out.println("\nALUNOS APROVADOS: ");
        for (int i = 0; i < n; i++) {

            media = (nota1[i] + nota2[i]) / 2;

            if (media >= 6.0){

                System.out.printf("%s\n",nomes[i]);
            }
        }


        sc.close();
    }
}
