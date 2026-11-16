package ExerLogicaProgramacao1ao100Chat;

import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {
        //24- Validação de intervalo: receba uma idade e determine se está na faixa de 18 a 30 anos ou de 50 a 65 anos.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua idade para saber em que faixa está.\nIdade: ");
        int idade = scanner.nextInt();

        if (idade >=18 && idade <=30){
            System.out.println("Faixa jovem!");
        } else if (idade >= 50 && idade <=65) {
            System.out.println("Faixa idosa!");
        } else {
            System.out.println("Não é idoso nem jovem!");
        }
    }
}
