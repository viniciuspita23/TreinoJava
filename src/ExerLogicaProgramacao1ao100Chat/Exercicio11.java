package ExerLogicaProgramacao1ao100Chat;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        //11- Conversão de temperatura: receba uma temperatura em Celsius e converta para Fahrenheit.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma temperatura em Celsius para converter para Fahrenheit. \n Temperatura: ");
        double temperatura = scanner.nextDouble();
        double fahrenheit = temperatura * 1.8 + 32;
        System.out.println("A tempertura em Fahrenheit é de: " + fahrenheit);
    }
}
