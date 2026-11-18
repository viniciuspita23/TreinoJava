package ExerLogicaProgramacao1ao100Chat;

public class Exercicio33 {
    public static void main(String[] args) {
        //33- Números pares: exiba todos os números pares de 1 até 100.
        for (int i = 0; i <= 100; i++) {
            int valor = i;
            if (valor % 2 == 0)
                System.out.println(valor);
        }
    }
}
