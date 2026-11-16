package ExerLogicaProgramacao1ao100Chat;

import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        //20 - Validação de triângulo: receba três medidas e verifique se elas podem formar um triângulo.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 3 medidas para verificar se elas podem formar um triângulo. \n Medida 1: ");
        int m1 = scanner.nextInt();
        System.out.println("Medida 2: ");
        int m2 = scanner.nextInt();
        System.out.println("Medida 3: ");
        int m3 = scanner.nextInt();

        boolean result1 = m1 < m2 + m3;
        boolean result2 = m2 < m1 + m3;
        boolean result3 = m3 < m1 + m2;

        if (result1 && result2 && result3){
            System.out.println("É um triângulo");
        } else {
            System.out.println("Não é um triângulo!");
        }

    }
}
