package ExerLogicaProgramacao1ao100Chat;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        //3- Maior entre dois números: receba dois números e retorne o maior deles.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 2 números para saber o maior entre eles: \n Primeiro número: ");
        int numero1 = scanner.nextInt();
        System.out.println("Número 2: ");
        int numero2 = scanner.nextInt();

        if (numero1 > numero2){
            System.out.println("O primeiro é o maior!");
        } else {
            System.out.println("O segundo é o maior!");
        }
    }
}
