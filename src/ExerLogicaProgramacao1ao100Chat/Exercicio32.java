package ExerLogicaProgramacao1ao100Chat;

import java.util.Scanner;

public class Exercicio32 {
    public static void main(String[] args) {
        //32- Contagem regressiva: receba um número e exiba uma contagem regressiva até zero.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número para sofrer contagem regressiva até 0: ");
        int numero = scanner.nextInt();

        for (int i = numero; i >= 0 ; i--) {
            System.out.println(i);
        }
    }
}
