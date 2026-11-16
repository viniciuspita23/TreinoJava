package ExerLogicaProgramacao1ao100Chat;

import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        //22- Senha e usuário: receba usuário e senha. O acesso só será permitido se ambos estiverem corretos.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite usuário e senha para entrar no sistema.\nUsuário: ");
        String usuario = scanner.nextLine();
        System.out.println("Senha: ");
        String senha = scanner.nextLine();

        String usuarioCorreto = "Usuario123";
        String senhaCorreta = "Senha123";

        if (usuario.equals(usuarioCorreto) && senha.equals(senhaCorreta)){
            System.out.println("Acesso liberado!");
        } else if (usuario.equals(usuarioCorreto) && !senha.equals(senhaCorreta)) {
            System.out.println("Senha incorreta!");
        } else if (!usuario.equals(usuarioCorreto) && senha.equals(senhaCorreta)) {
            System.out.println("Usuário incorreto!");
        } else {
            System.out.println("Usuário e senha incorretos!");
        }


    }
}
