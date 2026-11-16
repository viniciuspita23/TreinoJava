package ExerLogicaProgramacao1ao100Chat;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[]args) {
        //1- Número positivo ou negativo: receba um número e informe se ele é positivo, negativo ou zero.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número para saber se ele é positivo, negativo ou 0");
        int numero = scanner.nextInt();
        if (numero >0){
            System.out.println("Número positivo");
        } else if (numero <0) {
            System.out.println("Número negativo");
        } else{
            System.out.println("Zero");
        }
    }
}
