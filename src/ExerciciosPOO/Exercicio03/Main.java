package ExerciciosPOO.Exercicio03;

public class Main {
    public static void main(String[] args) {
        BolsaNinja<FerramentaNinja> bolsaNinja = new BolsaNinja<>();
        bolsaNinja.adicionarFerramenta(new Kunai("Fogo", 200,"Ferro"));
        bolsaNinja.adicionarFerramenta(new Shuriken("Aço", 260, 6));
        bolsaNinja.adicionarFerramenta(new Katana("Japonesa", 300,1.20));

        bolsaNinja.listarFerramentas();
    }
}
