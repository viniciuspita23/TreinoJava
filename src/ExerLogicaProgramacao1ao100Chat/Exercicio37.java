package ExerLogicaProgramacao1ao100Chat;

import java.util.Scanner;

public class Exercicio37 {
    public static void main(String[] args) {
        //Soma de positivos: receba 10 números e some somente aqueles que forem positivos.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 10 números para somar os que forem positivos");
        int numerosPositivos = 0;
        for (int i = 1; i <= 10; i++){
            int numeros = scanner.nextInt();
            if (numeros > 0 ){
                numerosPositivos += numeros;
            }
        }
        System.out.println("A soma dos números positivos é: " + numerosPositivos);

    }
}
