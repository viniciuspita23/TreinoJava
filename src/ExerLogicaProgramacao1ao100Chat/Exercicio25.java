package ExerLogicaProgramacao1ao100Chat;

import java.util.Scanner;

public class Exercicio25 {
    public static void main(String[] args) {
        //25- Sistema de estoque: receba a quantidade disponível e a quantidade solicitada. Informe se o pedido pode ser atendido.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quantidade para ver se tem estoque: ");
        int quantidade = scanner.nextInt();
        int estoque = 12;

        if (quantidade <= estoque){
            System.out.println("Pedido pode ser atendido!");
        } else {
            System.out.println("Estoque insuficiente!");
        }
    }
}
