package ExerLogicaProgramacao1ao100Chat;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        //4- Maior entre três números: receba três números e identifique o maior.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 3 número para identificar o maior. /n Primeiro: ");
        int n1 = scanner.nextInt();
        System.out.println("Segundo: ");
        int n2 = scanner.nextInt();
        System.out.println("Terceiro: ");
        int n3 = scanner.nextInt();

        if (n1 > n2 && n1> n3){
            System.out.println("O primeiro é o maior!");
        } else if (n2 > n1 && n2 > n3) {
            System.out.println("O segundo é o maior!");
        } else if (n3 > n1 && n3 > n2){
            System.out.println("O terceiro é o maior!");
        } else {
            System.out.println("Todos os números são iguais!");
        }
    }
}
