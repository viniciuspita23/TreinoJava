package ExerLogicaProgramacao1ao100Chat;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        //15- Classificação de velocidade: receba uma velocidade e classifique: até 60 km/h, velocidade permitida; de 61 a 80, atenção; acima de 80, excesso de velocidade.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira a velocidade para saber os limites da via. \n Velocidade: ");
        double velocidade = scanner.nextDouble();

        if (velocidade >80){
            System.out.println("Excesso de velocidade, irá levar uma multa!");
        } else if (velocidade > 60 && velocidade < 81) {
            System.out.println("Atenção, reduza para não levar uma multa!");
        } else {
            System.out.println("Velocidade permitida!");
        }
    }
}
