package ListaDeExercicio2;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("******************* VAMOS DESCOBRIR QUAL O MENOR E O MAIOR? *********************");

        System.out.println("Digite 10 números inteiros aleatórios: ");

        int menorNumero = Integer.MAX_VALUE;
        int maiorNumero = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o número " + i + ": ");
            int numero = input.nextInt();

            if (numero < menorNumero) {
                menorNumero = numero;
            }

            if (numero > maiorNumero) {
                maiorNumero = numero;
            }
        }

           System.out.println("O menor valor lido é: " + menorNumero);
           System.out.println("O maior valor lido é: " + maiorNumero);

    }
}
