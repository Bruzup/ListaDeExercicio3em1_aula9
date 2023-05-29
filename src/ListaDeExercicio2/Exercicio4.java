package ListaDeExercicio2;
import java.util.Scanner;

//Faça um programa que leia n números positivos e calcule a soma desses números.

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a quantidade de números: ");
        int n = input.nextInt();

        int soma = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Digite o número da posição " + i + ": ");
            int numero = input.nextInt();

            if (numero > 0) {
                soma += numero;
            }
             else {
                System.out.println("Número inválido! Digite um número positivo.");
                i--; //não permite armazenar número negativo no contador
            }
            }

            System.out.println("A soma dos números positivos é: " + soma);

        }
    }
