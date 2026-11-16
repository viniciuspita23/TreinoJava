package ExerLogicaProgramacao1ao100Chat;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        //6- Aprovação de aluno: receba uma nota e informe se o aluno foi aprovado (nota maior ou igual a 7) ou reprovado.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua nota para saber se foi aprovado: \n Nota:");
        double nota = scanner.nextDouble();

        if (nota >=7 && nota <= 10){
            System.out.println("Aprovado!");
        } else if (nota >= 5 && nota < 7) {
            System.out.println("Recuperação");
        } else if (nota > 0 && nota < 5){
            System.out.println("Reprovado!");
        } else{
            System.out.println("Digite uma nota válida!");
        }
    }
}
