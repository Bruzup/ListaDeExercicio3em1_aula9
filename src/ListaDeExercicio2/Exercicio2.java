package ListaDeExercicio2;

import java.util.Scanner;

public class Exercicio2 {
//Faça um programa que leia n números inteiros e imprima sua média.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("******************* VAMOS CALCULAR UMA MÉDIA *********************");

        System.out.println("Digite a quantidade de números: ");

        int n = input.nextInt();
        int ResultadoSoma = 0;

        for (int i =1; i <= n; i++ )  {
            System.out.println("Digite o número " + i + ": ");
            int Numero = input.nextInt();

            ResultadoSoma += Numero;
        }
        double media = (double) ResultadoSoma / n;

        System.out.println("Processando... ");
        System.out.println("A soma desses números é: " + ResultadoSoma);
        System.out.println("A média desses " + n + " números é: " + media);
    }

}

