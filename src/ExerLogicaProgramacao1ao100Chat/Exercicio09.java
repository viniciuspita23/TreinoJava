package ExerLogicaProgramacao1ao100Chat;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        //9- Desconto em compra: receba o valor de uma compra. Se for superior a R$ 200, aplique 10% de desconto.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor da compra para ver se é possível receber um desconto. \n Compra: ");
        double compra = scanner.nextDouble();

        if (compra > 0) {
            if (compra > 200) {
                double valorDesconto = (compra * 10) / 100;
                double valorTotal = compra - valorDesconto;
                System.out.println("Você recebeu um desconto de 10% -" + valorDesconto);
                System.out.println("Novo valor: " + valorTotal);
            } else {
                System.out.println("Nenhum desconto será aplicado :(");
            }
        } else {
            System.out.println("Digite um valor válido!");
        }
    }
}
