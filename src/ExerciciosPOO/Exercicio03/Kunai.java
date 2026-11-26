package ExerciciosPOO.Exercicio03;

public class Kunai implements FerramentaNinja{
    private String nome;
    private double dano;
    private String material;

    public Kunai(String nome,double dano, String material){
        this.nome = nome;
        this.dano = dano;
        this.material = material;
    }

    @Override
    public void usar(){
        System.out.println(nome + " em ação!");
    }

    @Override
    public String getNome(){
        return nome;
    }

    @Override
    public double getDano(){
        return dano;
    }

    public String toString(){
        return "Kunai " + nome + " feita de " + material + " causando dano de " + dano;
    }
}
