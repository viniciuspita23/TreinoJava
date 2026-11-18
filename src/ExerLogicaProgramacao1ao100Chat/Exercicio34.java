package ExerLogicaProgramacao1ao100Chat;

import java.util.Scanner;

public class Exercicio34 {
    public static void main(String[] args) {
        //34- Tabuada: receba um número e exiba sua tabuada de 1 a 10.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número para fazer a tabuada dele: ");
        int numero = scanner.nextInt();

        for (int i = 0; i <= 10; i++){
            int total = numero * i;
            System.out.println(numero + "x" + i + " = " + total);
        }

    }
}
