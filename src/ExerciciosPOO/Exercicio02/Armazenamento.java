package ExerciciosPOO.Exercicio02;

import java.util.ArrayList;
import java.util.List;

public class Armazenamento <T>{
    private List<T> estoques;

    //Construtores
    public Armazenamento(){
        this.estoques = new ArrayList<>();
    }

    //Metodo adicionar
    public void adicionar(T estoque){
        if (estoque == null){
            System.out.println("Não é possível adicionar valores nulos");
            return;
        }
        estoques.add(estoque);
    }

    //Metodo remover
    public void remover(T estoque){
        estoques.remove(estoque);
    }

    //Metodo buscar
    public boolean buscar(T estoque){
        return estoques.contains(estoque);
    }

    //Metodo listar
    public void listar(){
        for (T estoque : estoques){
            System.out.println(estoque);
        }
    }

    //Metodo que retorna quantidade de elementos
    public int obterQuantidade() {
        return estoques.size();
    }

    //Metodo de posição do elemento
    //Se utiliza o T pois o elemento a ser buscado pode ser de diferentes tipos
    public T obterElemento(int posicao){
        return estoques.get(posicao);
    }

    //Metodo limpar
    public void limpar(){
        estoques.clear();
    }


}
