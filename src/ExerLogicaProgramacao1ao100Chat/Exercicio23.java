package ExerLogicaProgramacao1ao100Chat;

import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {
        //23- Compra com frete grátis: uma loja oferece frete grátis para compras acima de R$ 300 ou para clientes VIP. Determine se o cliente terá frete grátis.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Você é cliente VIP? ");
        System.out.println("1 - Sim");
        System.out.println("2 - Não");
        int opcao = scanner.nextInt();
        scanner.nextLine();

        boolean clienteVip = (opcao ==1); //Boolean lê sempre o verdadeiro, aqui estou falando que 1 é TRUE (sim) e 2 é FALSE (não)

        if (clienteVip){
            System.out.println("Você tem direito à frete grátis!");
        } else{
            System.out.println("Digite o valor da sua compra para saber se tem direito a frete grátis: ");
            double compra = scanner.nextDouble();
            if (compra >= 300){
                System.out.println("Você ganhou frete grátis!");
            } else {
                System.out.println("Você não tem direito à frete grátis!");
            }
        }

    }
}
