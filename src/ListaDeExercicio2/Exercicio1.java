package ListaDeExercicio2;


public class Exercicio1 {

    public static void main(String[] args) {

        for (int controlador = 1; controlador <= 100; controlador++) {
            System.out.println("Número: " + controlador);
        }
        System.out.println("++++++++++++++++++++++++++++++++++++");
        System.out.println("Vamos de while agora...");

        int contador = 1;
        while (contador <= 100) {
            System.out.println("Posição: " + contador);
            contador++;

        }

    }
}