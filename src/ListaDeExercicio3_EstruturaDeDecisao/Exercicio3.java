package ListaDeExercicio3_EstruturaDeDecisao;
//Faça um programa que receba duas notas parciais de um aluno. O programa deve calcular a média alcançada por aluno e apresentar:
//        A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
//        A mensagem "Reprovado", se a média for menor do que sete;
//        A mensagem "Aprovado com Distinção", se a média for igual a dez.

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Bem-vindo, será que foi aprovado?");
        System.out.println("---------------");

        System.out.println("Qual é a sua primeira nota parcial?");
        double primeiraNota = input.nextDouble();

        System.out.println("Qual é a sua segunda nota parcial?");
        double segundaNota = input.nextDouble();

        double media = (primeiraNota + segundaNota) / 2;

        if (media >= 7 && media < 10) {
            System.out.println("Aluno aprovado! :D");
        }
        else if (media < 7) {
            System.out.println("Aluno reprovado! :(");
        }
        else if (media == 10) {
            System.out.println("Aluno aprovado com distinção! Uau *_* !!!");
        }
    }
}


