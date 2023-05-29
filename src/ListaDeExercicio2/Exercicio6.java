package ListaDeExercicio2;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("===================Digite o intervalo de números!===========");

        System.out.println("Digite o primeiro número do intevalo: ");
        int primeiroNumero = input.nextInt();

        System.out.println("Digite o segundo número do intevalo: ");
        int ultimoNumero = input.nextInt();

        int soma = 0;
        int qtdImpar = 0;

        for (int i = primeiroNumero; i <= ultimoNumero; i++){
            if (i %2 != 0) {
              soma += i;
           qtdImpar = (ultimoNumero - primeiroNumero) / 2;
            }

        }
        System.out.println("A quantidade de ímpares neste intervalo é: " + qtdImpar);
        System.out.println("A soma deste intervalo é: " + soma);

    }
}
