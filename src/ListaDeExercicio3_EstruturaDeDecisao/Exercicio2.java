package ListaDeExercicio3_EstruturaDeDecisao;
//Faça um programa que receba o preço de três produtos e informe qual produto você deve comprar, sabendo que a decisão é sempre pelo mais barato.
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Qual o preço do shampoo Wella?");
        double precoWella = input.nextDouble();

        System.out.print("Qual o preço do shampoo Lòreal?");
        double precoLoreal = input.nextDouble();

        System.out.print("Qual o preço do shampoo Kerastase?");
        double precoKerastase = input.nextDouble();



        if (precoWella < precoLoreal && precoWella < precoKerastase) {
            System.out.println("Você deve comprar o shampoo Wella.");
        }
        else if (precoLoreal < precoWella && precoWella < precoKerastase) {
            System.out.println("Você deve comprar o shampoo Loreal.");
        }
        else if (precoKerastase < precoLoreal && precoKerastase < precoWella) {
            System.out.println("Você deve comprar o shampoo Kerastase");
        }
        else {System.out.println("Tanto faz, estão todos com o mesmo valor promocional. Aproveite!");}

    }
}
