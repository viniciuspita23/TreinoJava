package ExerciciosPOO.Exercicio01;

public class Main {
    public static void main(String[] args) {
        Mochila<Object> mochila = new Mochila<>();
        mochila.adicionarItem("Mapa");
        mochila.adicionarItem(1082);
        mochila.adicionarItem(29.600);

        mochila.adicionarItem(new Pocao("Mágica", 263));
        mochila.adicionarItem(new Pocao("Espiritual", 473));
        mochila.adicionarItem(new Arma("Espada", 300));
        mochila.adicionarItem(new Arma("Faca", 160));

        mochila.listarItens();
        System.out.println("-------------------------");
        mochila.removerItem(1082);
        mochila.listarItens();
        System.out.println("-------------------------");
        System.out.println(mochila.verificarItem("Mapa"));
        System.out.println(mochila.quantidadeItens());

    }
}
