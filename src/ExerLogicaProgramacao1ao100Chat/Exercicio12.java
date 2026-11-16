package ExerLogicaProgramacao1ao100Chat;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        //12- Verificação de múltiplos: receba dois números e informe se o primeiro é múltiplo do segundo. Considere a divisão por zero.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 2 números para saber se o primeiro é múltiplo do segundo. \n Primeiro número: ");
        int n1 = scanner.nextInt();
        System.out.println("Segundo número: ");
        int n2 = scanner.nextInt();

        if (n2 == 0 ){
            System.out.println("Nenhum número é múltiplo de 0!");
        } else if (n1 % n2 == 0){
            System.out.println(n1 + " é múltiplo de " + n2);
        } else {
            System.out.println(n1 + " não é múltiplo de " + n2);
        }

    }
}
