package ExerLogicaProgramacao1ao100Chat;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        //2- Par ou ímpar: receba um número inteiro e determine se ele é par ou ímpar.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número para saber se ele é par ou ímpar");
        int numero = scanner.nextInt();
        if (numero % 2 == 0){
            System.out.println("Número par");
        } else {
            System.out.println("Número ímpar");
        }
    }
}
