package ListaDeExercicio1;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        for (int controlador = 1; controlador <= 100; controlador++) {
            System.out.println("Número: " + controlador);
        }
    }

    public static class Exercicio3 {

        public static void main(String[] args) {

            Scanner entrada = new Scanner(System.in);

            System.out.println("******************* VAMOS CALCULAR OS NÚMEROS? *********************");

            System.out.println("Escolha 5 números: ");

            int ResultadoSoma = 0;

            for (int i =1; i <= 5; i++) {

                System.out.println("Número" + i + ": ");
                int numero = entrada.nextInt();

                ResultadoSoma += numero;
            }
            System.out.println("A soma desses 5 números é: " + ResultadoSoma);
        }
    }
}
