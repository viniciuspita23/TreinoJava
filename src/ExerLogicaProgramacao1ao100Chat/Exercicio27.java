package ExerLogicaProgramacao1ao100Chat;

import java.util.Scanner;

public class Exercicio27 {
    public static void main(String[] args) {
        //27- Classificação de IMC: receba peso e altura, calcule o IMC e classifique em abaixo do peso, peso normal, sobrepeso ou obesidade.
//        Classificação	IMC
//        Abaixo do peso	Menor que 18,5
//        Peso normal	18,5 até 24,9
//        Sobrepeso	25 até 29,9
//        Obesidade	30 ou mais

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu peso e altura para saber o IMC.\nPeso: ");
        double peso = scanner.nextDouble();
        System.out.println("Altura: ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);
        if (imc >0) {
            if (imc <= 18.5) {
                System.out.println("Abaixo do peso");
            } else if (imc <= 24.9) {
                System.out.println("Peso normal!");
            } else if (imc <= 29.9) {
                System.out.println("Sobrepeso");
            } else {
                System.out.println("Obesidade!");
            }
        } else {
            System.out.println("Digite um peso e/ou altura válidos!");
        }


    }
}
