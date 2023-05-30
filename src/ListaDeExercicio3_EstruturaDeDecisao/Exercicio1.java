package ListaDeExercicio3_EstruturaDeDecisao;
//Faça um programa que receba dois números e imprima o maior deles
import java.util.Scanner;


public class Exercicio1 {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = input.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = input.nextDouble();
        double maiorNumero = Math.max(num1, num2);

        if (num1 > num2) {
            System.out.println("O primeiro número é o maior");
        }
        else if (num2 > num1) {
            System.out.println("O segundo número é o maior");
        }
        else {
            System.out.println("Os números são iguais");
        }
    }

}

