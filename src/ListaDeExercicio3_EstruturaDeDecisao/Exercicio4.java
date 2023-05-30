package ListaDeExercicio3_EstruturaDeDecisao;

//Os gestores da Zup resolveram dar um aumento de salário aos seus colaboradores e lhe contrataram para desenvolver o programa que calcula os reajustes. Portanto, faça um programa que recebe o salário de um colaborador e o reajuste segundo o seguinte critério, baseado no salário atual:
//        Salários até R$ 280,00 (incluindo), receberão aumento de 20%
//        Salários entre R$ 280,00 e R$ 700,00 (incluindo), receberão aumento de 15%
//        Salários entre R$ 700,00 e R$ 1500,00 (incluindo), receberão aumento de 10%
//        Salários de R$ 1500,00 em diante, receberão aumento de 5%
//        Após o aumento ser realizado, informe na tela:
//        O salário antes do reajuste;
//        O percentual de aumento aplicado;
//        O valor do aumento;
//        O novo salário, após o aumento;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        DecimalFormat formatador = new DecimalFormat("#,##0.00");
        DecimalFormat formatadorPorcent = new DecimalFormat("0");

        System.out.println("Digite qual o salário recebido: ");
        double valorSalario = input.nextDouble();

        double novoSalario;
        double aumento;

        if (valorSalario <= 280) {
            aumento = valorSalario * 0.20;
            double porcentagem = 20;
            novoSalario = valorSalario + aumento;
            System.out.println("Seu salário atual é de: R$ " + formatador.format(valorSalario));
            System.out.println("Percentual de aumento é (" + formatadorPorcent.format(porcentagem) + "%)");
            System.out.println("Seu aumento será de: R$ " + formatador.format(aumento));
            System.out.println("Seu novo salário será de: R$ " + formatador.format(novoSalario));

        } else if (valorSalario > 280 && valorSalario <= 700) {
            aumento = valorSalario * 0.15;
            double porcentagem = 15;
            novoSalario = valorSalario + aumento;
            System.out.println("Seu salário atual é de: R$ " + formatador.format(valorSalario));
            System.out.println("Percentual de aumento é (" + formatadorPorcent.format(porcentagem) + "%)");
            System.out.println("Seu aumento será de: R$ " + formatador.format(aumento));
            System.out.println("Seu novo salário será de: R$ " + formatador.format(novoSalario));
        } else if (valorSalario > 700 && valorSalario <= 1500) {
            aumento = valorSalario * 0.10;
            double porcentagem = 10;
            novoSalario = valorSalario + aumento;
            System.out.println("Seu salário atual é de: R$ " + formatador.format(valorSalario));
            System.out.println("Percentual de aumento é (" + formatadorPorcent.format(porcentagem) + "%)");
            System.out.println("Seu aumento será de: R$ " + formatador.format(aumento));
            System.out.println("Seu novo salário será de: R$ " + formatador.format(novoSalario));
        } else {
            aumento = valorSalario * 0.05;
            double porcentagem = 5;
            novoSalario = valorSalario + aumento;
            System.out.println("Seu salário atual é de: R$ " + formatador.format(valorSalario));
            System.out.println("Percentual de aumento é (" + formatadorPorcent.format(porcentagem) + "%)");
            System.out.println("Seu aumento será de: R$ " + formatador.format(aumento));
            System.out.println("Seu novo salário será de: R$ " + formatador.format(novoSalario));
        }


    }
}
