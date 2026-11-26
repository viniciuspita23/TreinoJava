package ExerciciosPOO.Exercicio01;

public class Pocao {
    private String nome;
    private int quantidade;

    public Pocao(String nome, int quantidade){
        this.nome = nome;
        this.quantidade = quantidade;
    }


    //Precisa do get pois os atributos são private
    public String getNome(){
        return nome;
    }
    public int getQuantidade(){
        return quantidade;
    }

    @Override
    public String toString(){
        return "Poção " + nome + " de quantidade " + quantidade;
    }
}
