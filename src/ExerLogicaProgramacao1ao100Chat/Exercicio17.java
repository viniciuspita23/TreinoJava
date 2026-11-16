package ExerLogicaProgramacao1ao100Chat;

import java.util.Scanner;

public class Exercicio17 {
    public void main(String[] args) {
        //17- Validação de senha: receba uma senha e uma senha cadastrada. Verifique se são iguais.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua senha para entrar no sistema: ");
        String senha = scanner.nextLine();

        String senhaCadastrada = "Teste123"; //Aqui fala que a senha cadastrada no sistema é "Teste123"
        boolean senhaCorreta = senha.equals(senhaCadastrada); //variável senha recebe o que foi digitado pelo usuário e compara com senhaCadastrada utilizando o equals
                                                           //se forem iguais o boolean é verdadeiro e libera acesso, senão nega.
                                                       //É o .equals que retorna se a variável boolean senhaCorreta true ou false. Quando feito a comparação e ambos são iguais é TRUE
                                                     //quando feito a comparação e não são iguals é FALSE.

        if (senhaCorreta){ //Não precisa colocar senha correta == true pois o java já lê o if como verdadeiro e o else como falso.
            //Então se for false o java vai pro else. Se for true ele lê o if e encerra.
            System.out.println("Acesso liberado!");
        } else {
            System.out.println("Acesso negado!");
        }
    }
}
