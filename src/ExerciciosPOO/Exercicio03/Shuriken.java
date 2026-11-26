package ExerciciosPOO.Exercicio03;

public class Shuriken implements FerramentaNinja{
    private String nome;
    private double dano;
    private int qtdPontas;

    public Shuriken(String nome, double dano, int qtdPontas){
        this.nome = nome;
        this.dano = dano;
        this.qtdPontas = qtdPontas;
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
        return "Shuriken " + nome + " de " + qtdPontas + " pontas causando dano de " + dano;
    }

}
