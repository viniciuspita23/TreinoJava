package ExerLogicaProgramacao1ao100Chat;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        //14- Número dentro de intervalo: receba um número e verifique se está entre 10 e 50, inclusive.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número para saber se está entre 10 e 50");
        double numero = scanner.nextDouble();

        if (numero >= 10 && numero <=50){
            System.out.println("Número está dentro da faixa!");
        } else {
            System.out.println("número não está dentro da faixa!");
        }
    }
}
