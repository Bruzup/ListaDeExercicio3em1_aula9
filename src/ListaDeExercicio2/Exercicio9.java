package ListaDeExercicio2;
import java.util.Scanner;
//Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário
public class Exercicio9 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        long fatorial = 1;
        int numero;

        System.out.println("+++++++++++++++++++++++++++++++++++++++ VAMOS TESTAR FATORIAIS! ++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Digite um número para descobrirmos o fatorial dele: ");
        numero = input.nextInt();
        if (numero < 0) {
            System.out.print("O fatorial não pode ser inicializado com valor negativo. Por favor, digite outro número: ");
        }
        else {
            for (int i = numero; i > 0; i--){
            fatorial *= i;
        }

        }
        System.out.println("O fatorial do número " + numero + " é: " + fatorial);
    }

}
