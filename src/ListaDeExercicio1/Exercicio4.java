package ListaDeExercicio1;
import java.util.Scanner;

//Faça um programa para ler 5 números e mostrar o resultado da soma desses números.


public class Exercicio4 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("******************* VAMOS CALCULAR UMA MÉDIA? *********************");

        System.out.println("Quantos números deseja tirar a média? ");


        int contador = 1;

        int TotalNumeros = entrada.nextInt();

        int ResultadoSoma = 0;

        while (contador <= TotalNumeros)  {

            contador++;

            System.out.println("Digite o número: ");
            int Numeros = entrada.nextInt();

            ResultadoSoma += Numeros;
            //double MediaNum = (double)ResultadoSoma / TotalNumeros;

            // double ResultadoMedia = SomaI / TotalNúmeros;
        }
        System.out.println("Processando... ");
        System.out.println("A soma desses números é: " + ResultadoSoma);
        System.out.println("A média desses " + TotalNumeros + " números é: " + (double)ResultadoSoma / TotalNumeros);
    }
}