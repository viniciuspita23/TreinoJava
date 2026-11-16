package ExerLogicaProgramacao1ao100Chat;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        //13- Ano bissexto: receba um ano e determine se ele é bissexto, considerando as regras do calendário.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um ano para saber se ele é bissexto. \n Ano: ");
        int ano = scanner.nextInt();

        if (ano % 100 == 0 && ano % 400 == 0){
            System.out.println(ano + " é um ano bissexto");
        } else if (ano % 100 == 0){
            System.out.println(ano + " não é um ano bissexto!");
        } else if (ano % 4 == 0){
            System.out.println( ano + " é um ano bissexto!");
        } else {
            System.out.println(ano + " não é um ano bissexto!");
        }
    }
}
