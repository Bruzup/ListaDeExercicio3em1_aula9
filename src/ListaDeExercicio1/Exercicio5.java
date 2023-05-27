package ListaDeExercicio1;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args){
        //Lendo teclado
        Scanner input = new Scanner(System.in);

        System.out.println("============== Conheça nosso sistema de filas ===============");
        System.out.println("Digite quantas pessoas tem nessa fila:");
        int QtdPessoas = input.nextInt();


        do{
            System.out.println("* Agora tem " + QtdPessoas + " pessoas");
            QtdPessoas--;
            int TempoDeEspera = QtdPessoas * 5;
            System.out.println("O tempo estimado de espera é " + TempoDeEspera + " minutos...");
        }while (QtdPessoas > 0);

        System.out.println("Chegou sua vez!! :D");
    }
}
