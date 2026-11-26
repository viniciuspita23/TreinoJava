package ExerciciosPOO.Exercicio01;

public class Arma {
    private String nome;
    private int dano;

    public Arma(String nome, int dano){
        this.nome = nome;
        this.dano = dano;
    }

    //Precisa do get pois os atributos são private
    public String getNome(){
        return nome;
    }

    public int getDano(){
        return dano;
    }

    @Override
    public String toString(){
        return "Arma " + nome + " de dano " + dano;
    }
}
