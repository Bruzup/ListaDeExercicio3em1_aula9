package ListaDeExercicio2;

//Faça um programa que calcule e mostre a soma dos 50 primeiros números ímpares.
public class Exercicio8 {

    public static void main(String[] args){

        int impar = 0;
        int soma = 0;
        int numero = 1;
        int qtdImpar = 0;

        while (impar <= 100) { //range de 100 para obter os 50 primeiros ímpares
            if (numero % 2 != 0) {
                soma += numero;
                impar++;
            }
            numero++;
            qtdImpar = (numero - impar) / 2;
        }

        System.out.println("A quantidade de ímpares neste intervalo é: " + qtdImpar);
        System.out.println("A soma dos 50 primeiros números ímpares é: " + soma);
    }
}


