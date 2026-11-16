package ExerLogicaProgramacao1ao100Chat;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        //8- Verificação de idade: receba uma idade e informe se a pessoa é menor de idade ou maior de idade.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua idade para saber se já atingiu a maioridade. \n Idade: ");
        int idade = scanner.nextInt();

        if (idade >=0) {
            if (idade >= 18) {
                System.out.println("Você atingiu a maioridade!");
            } else {
                System.out.println("Você ainda não atingiu a maioridade!");
            }
        } else {
            System.out.println("Idade inválida!");
        }
    }
}
