package ListaDeExercicio2;

import java.util.Scanner;

//Faça um programa que peça um número inteiro e determine se ele é ou não um número primo.
// Um número primo é aquele que é divisível somente por ele mesmo e por 1.
public class Exercicio7 {

    public static void main(String[] args)  {

        Scanner input = new Scanner(System.in);

        System.out.println("=================== Vamos verificar se são primos? ===========");

        System.out.println("Digite um número: ");

        int numero = input.nextInt();
        int ehPrimo =0;

        for (int i = 2; i < numero; i++) {
            if(numero % i == 0) {
                ehPrimo +=1;
            }

        }
        if (ehPrimo == 0){
            System.out.println("O número " + numero + " é primo!");
        }
        else {
            System.out.println("O número " + numero + " não é primo!" + "Pois pode ser dividido por ele mesmo e mais " + ehPrimo + " número(s).");
        }
    }

}
