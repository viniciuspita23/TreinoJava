package ExerLogicaProgramacao1ao100Chat;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        //10- Calculadora simples: receba dois números e um operador (+, -, * ou /) e execute a operação correspondente. Não permita divisão por zero.
        Scanner scanner = new Scanner(System.in);

        System.out.println("===== Calculadora simples =====");
        System.out.println("Digite o primeiro número: ");
        double n1 = scanner.nextDouble();
        System.out.println("Digite o segundo número: ");
        double n2 = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Escolha uma operação");
        System.out.println("1 - Adição +");
        System.out.println("2 - Subtração -");
        System.out.println("3 - Multiplicação *");
        System.out.println("4 - Divisão /");
        int menu = scanner.nextInt();
        scanner.nextLine();

        switch (menu){
            case 1:
                double total1 = n1 + n2;
                System.out.println("Total da adição: " + total1);
                break;
            case 2:
                double total2 = n1 - n2;
                System.out.println("Total da subtração: " + total2);
                break;
            case 3:
                double total3 = n1 * n2;
                System.out.println("Total da multiplicação: " + total3);
                break;
            case 4:
                double total4 = n1 / n2;
                System.out.println("Total da divisão: " + total4);
                break;
            default:
                System.out.println("Digite um número válido do menu!");

        }

    }
}
