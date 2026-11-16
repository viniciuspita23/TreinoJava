package ExerLogicaProgramacao1ao100Chat;

import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        //19- Elegibilidade para desconto: um cliente recebe desconto se for estudante ou idoso (60 anos ou mais). Receba essas informações e determine se tem direito.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Você é estudante? ");
        String estudante = scanner.nextLine();
        boolean estuda = estudante.equals("sim");

        if (estuda){
            System.out.println("Você tem desconto liberado!");
        } else {
            System.out.println("Quantos anos você tem? ");
            int idade = scanner.nextInt();
            if (idade >= 60){
                System.out.println("Você tem desconto liberado!");
            } else {
                System.out.println("Você não tem direito a desconto.");
            }
        }

    }
}
