package ExerLogicaProgramacao1ao100Chat;

import java.util.Scanner;

public class Exercicio36 {
    public static void main(String[] args) {
        //36- Contagem de pares: receba 10 números e informe quantos são pares.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 10 números para saber quantos são pares.\nNúmeros: ");
        int qtdPares = 0;
        for (int i = 0; i < 10; i++) {
            int numero = scanner.nextInt();
            if (numero % 2 == 0) {
                qtdPares += 1;
            }
        }
        System.out.println(qtdPares + " números são pares!");
    }
}
