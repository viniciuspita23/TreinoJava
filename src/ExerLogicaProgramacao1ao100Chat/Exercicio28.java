package ExerLogicaProgramacao1ao100Chat;

import java.util.Scanner;

public class Exercicio28 {
    public static void main(String[] args) {
        //28- Validação de acesso por tentativas: receba o número de tentativas de login. O usuário será bloqueado quando atingir cinco tentativas.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a senha para entrear no sistema: ");

        String senhaCorreta = "senha123";
        String senha = " ";

        for (int i = 1; i <= 5; i++){
            senha = scanner.nextLine();
            if (senha.equals(senhaCorreta)){
                System.out.println("Acesso liberado!");
                break;
            }
            if (!senha.equals(senhaCorreta) && i == 5) {
                System.out.println("5 solicitações! Usuário bloqueado!");
            } else if (!senha.equals(senhaCorreta)) {
                System.out.println("Senha incorreta. Digite novamente: ");
            }

        }



    }
}
