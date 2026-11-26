package ExerciciosPOO.ExerciciosLogica;

import java.util.Scanner;

public class EncontrarMaiorNumero {
    public static void main(String[] args) {
        //Encontrar o maior número
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 10 números para encontrar o maior número");
        //Pra fazer isso vc precisa de 2 variáveis, 1 pro número que está sendo analisando naquele momento (numeroAtual), e 2 para guardar o maior número encontrado até agora (maiorNumero)
        int maiorNumero = 0;
        for (int i = 0; i < 10; i++){
            int numeroAtual = scanner.nextInt();
            if (numeroAtual > maiorNumero){ //O número digitado (numeroAtual) é maior que o (maiorNumero)? Sim pois (maiorNumero) foi declarado como 0 para inicializar
                maiorNumero = numeroAtual; //Então caso seja maior, (maiorNumero) recebe e guarda o número digitado (numeroAtual) e o processo se repete, até ficar salvo o maiorNumero
            }
        }
        System.out.println("Maior número = " + maiorNumero);






    }
}
