package ExerciciosPOO.Exercicio03;

public class Katana implements FerramentaNinja{
    private String nome;
    private double dano;
    private double comprimento;

    public Katana(String nome, double dano, double comprimento){
        this.nome = nome;
        this.dano = dano;
        this.comprimento = comprimento;
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
        return "Kunai " + nome + " de comprimento " + comprimento + " causando dano de " + dano;
    }
}
