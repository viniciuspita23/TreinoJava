package ExerLogicaProgramacao1ao100Chat;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        //7- Média de duas notas: calcule a média de duas notas e classifique o resultado em aprovado (7 ou mais), recuperação (5 a 6,9) ou reprovado (abaixo de 5).
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ditige a nota das suas 2 provas para tirar a média e ver se foi aprovado. \n Primeira nota: ");
        double nota1 = scanner.nextDouble();

        if (nota1 >=0 && nota1 <=10) {
            System.out.println("Segunda nota: ");
            double nota2 = scanner.nextDouble();
            if (nota2 >=0 && nota2 <=10) {
                double media = (nota1 + nota2) / 2;
                if (media >= 7 && media <= 10) {
                    System.out.println("Aprovado! Média: " + media);
                } else if (media >= 5 && media <= 6.9) {
                    System.out.println("Recuperação! Média: " + media);
                } else {
                    System.out.println("Reprovado! Média: " + media);
                }
            } else {
                System.out.println("Digite uma nota válida!");
            }
        } else {
            System.out.println("Digite uma nota válida!");
        }
    }
}
