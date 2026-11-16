package ExerLogicaProgramacao1ao100Chat;

import java.util.Scanner;

public class Exercicio26 {
    public static void main(String[] args) {
        //26- Verificação de disponibilidade: receba duas variáveis booleanas: produto disponível e loja aberta.
        // A venda só poderá acontecer se ambas forem verdadeiras.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Verificação de disponbilidade de venda!");
        System.out.println("Loja aberta? ");
        System.out.println("1 - Sim");
        System.out.println("2 - Não");
        int opcaoLoja = scanner.nextInt();
        boolean loja = (opcaoLoja ==1);

        if (!loja){
            System.out.println("Loja fechada! Impossível realizara venda!");
        } else {
            System.out.println("Produto disponível? ");
            System.out.println("1 - Sim");
            System.out.println("2 - Não");
            int opcaoProduto = scanner.nextInt();
            boolean produto = (opcaoProduto ==1);
            if (produto){
                System.out.println("Venda disponível!");
            } else {
                System.out.println("Produto indisponível, impossível realizar a venda!");
            }
        }



    }
}
