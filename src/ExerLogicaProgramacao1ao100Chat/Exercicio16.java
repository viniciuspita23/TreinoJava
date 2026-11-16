package ExerLogicaProgramacao1ao100Chat;

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        //16- Acesso ao sistema: receba uma idade e uma variável booleana indicando se o usuário está bloqueado.
        // O acesso só será permitido se tiver pelo menos 18 anos e não estiver bloqueado
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua idade para saber se é possível acessar o sistema: ");
        int idade = scanner.nextInt();
        boolean acesso = false;
        if (idade >= 18 && !acesso) {
            System.out.println("Acesso permitido!");
        } else {
            System.out.println("Acesso negado!");
        }
    }
}
