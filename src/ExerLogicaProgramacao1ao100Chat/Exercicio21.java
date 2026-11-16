package ExerLogicaProgramacao1ao100Chat;

import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {
        //21- Classificação de triângulo: considerando três lados válidos, informe se o triângulo é equilátero, isósceles ou escaleno.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite os 3 lados do triângulo para saber qual tipo é.\n Primeiro lado: ");
        int l1 = scanner.nextInt();
        System.out.println("Lado 2: ");
        int l2 = scanner.nextInt();
        System.out.println("Lado 3: ");
        int l3 = scanner.nextInt();

        if (l1 == l2 && l1 == l3){
            System.out.println("Triângulo equilátero!");
        } else if(l1 == l2 && l1 !=l3 || l2 == l3 && l2 != l1 || l3 == l1 && l3 != l2){
            System.out.println("Trângulo isósceles!");
        } else {
            System.out.println("Triângulo escaleno!");
        }
    }

}
