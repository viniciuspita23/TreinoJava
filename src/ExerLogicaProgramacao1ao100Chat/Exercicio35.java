package ExerLogicaProgramacao1ao100Chat;

import java.util.Scanner;

public class Exercicio35 {
    public static void main(String[] args) {
        //35- Soma de números: receba um número N e calcule a soma de todos os números de 1 até N.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número para calcular de 1 até seu número: ");
        int numero = scanner.nextInt();

        int soma = 0;
        for (int i = 1; i <= numero; i= i+1){
            soma = soma + i;
            System.out.println(soma);
        }
    }
}
