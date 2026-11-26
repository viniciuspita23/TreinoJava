package ExerciciosPOO.Exercicio01;

import java.util.ArrayList;
import java.util.List;

public class Mochila <T>{
    private List<T> objetos;

    //Construtor
    public Mochila(){
        this.objetos = new ArrayList<>();
    }

    //Metodo adicionar itens
    public void adicionarItem(T objeto){
        if (objeto == null){
            System.out.println("não é permitido adicionar itens nulos");
            return;
        }
        objetos.add(objeto);
    }

    //Metodo remover itens
    public void removerItem(T objeto){
        objetos.remove(objeto);
    }

    //Esse for serve para percorrer todos os elementos de um array ou coleção
    //objeto (variável que recebe o elemento)
    // : (2 pontos significa "dentro de")
    //objetos seria o array que será percorrido
    public void listarItens(){
        for (T objeto : objetos){
            System.out.println(objeto);
        }
    }

    //Metodo para ver a quantidade de itens
    public int quantidadeItens(){
        return objetos.size();
    }

    //Metodo para verificar se o objeto está presenta na mochila
    public boolean verificarItem(T objeto){
        return objetos.contains(objeto);
    }
}
