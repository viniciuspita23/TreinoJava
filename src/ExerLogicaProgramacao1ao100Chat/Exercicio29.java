package ExerLogicaProgramacao1ao100Chat;

import java.util.Scanner;

public class Exercicio29 {
    public static void main(String[] args) {
        //29- Análise de número: receba um número e verifique se ele é positivo e par, negativo ou zero.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número para saber se ele é positivo, par, negativo ou zero: ");
        int numero = scanner.nextInt();

        if (numero > 0){
            if (numero % 2 == 0)
            System.out.println(numero + " é positivo e par!");
            else {
                System.out.println(numero + " é positivo e ímpar");
            }
        } else if (numero < 0) {
            if (numero % 2 == 0)
            System.out.println(numero + " é negativo e par!");
            else {
                System.out.println(numero + " é negativo e ímpar!");
            }
        } else {
            System.out.println("Zero");
        }
    }
}
