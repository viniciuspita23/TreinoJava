package ExerLogicaProgramacao1ao100Chat;

import java.util.Scanner;

public class Exercicio18 {
    static void main() {
        //18- Horário de funcionamento: receba a hora atual. Informe se uma loja está aberta, considerando funcionamento das 8h às 18h.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a hora para saber se a loja está aberta. \n Horas: ");
        int horas = scanner.nextInt();

        boolean lojaAberta = (horas >=8 && horas <=18); //Se horas estiver entre 8 e 18 temos um valor true (um valor que cumpre com os requisitos)
        // senão, false, um valor que não cumpre com os requisitos de estar entre 8 e 18

        if (lojaAberta){ //O If lê valores verdadeiros, por isso não precisa colocar lojaAberta == true.
            System.out.println("A loja está aberta!");
        } else {
            System.out.println("A loja está fechada!");
        }
    }
}
