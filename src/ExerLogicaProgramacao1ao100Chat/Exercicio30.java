package ExerLogicaProgramacao1ao100Chat;

import java.util.Scanner;

public class Exercicio30 {
    public static void main(String[] args) {
        //30- Validação de pedido: receba valor do pedido, quantidade de produtos e status de pagamento.
        // O pedido só poderá ser confirmado se o valor for positivo, a quantidade for maior que zero e o pagamento estiver confirmado.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor do pedido, a quantidade e o status para fazer a retirada.");
        System.out.println("Valor: ");
        double valor = scanner.nextDouble();

        if (valor > 0){
            System.out.println("Quantidade: ");
            int qtd = scanner.nextInt();
            if (qtd > 0){
                System.out.println("Status");
                System.out.println("1 - Aprovado para retirada");
                System.out.println("2 - Aguardando para embalar");
                int opcao = scanner.nextInt();
                boolean opcaob = (opcao == 1);
                if (opcaob){
                    System.out.println("Pedido confirmado!");
                } else {
                    System.out.println("Pedido precisa estar aprovado para retirada!");
                }
            } else {
                System.out.println("Quantidade precisa ser maior que zero!");
            }
        } else {
            System.out.println("Valor precisa ser maior que zero!");
        }

    }
}
