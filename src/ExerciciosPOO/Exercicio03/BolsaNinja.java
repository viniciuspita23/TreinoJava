package ExerciciosPOO.Exercicio03;

import java.util.ArrayList;
import java.util.List;

public class BolsaNinja <T extends FerramentaNinja>{
    private List<T> bolsa;

    public BolsaNinja(){
        this.bolsa = new ArrayList<>();
    }

    public void adicionarFerramenta(T objeto){
        if(objeto == null){
            System.out.println("Não é permitido adicionar valores nulos");
        }
        bolsa.add(objeto);
    }

    public void removerFerramenta(T objeto){
        bolsa.remove(objeto);
    }

    public void listarFerramentas(){
        for (T objeto : bolsa){
            System.out.println(objeto);
        }
    }

    public boolean buscarFerramenta(T objeto){
        return bolsa.contains(objeto);
    }

    public double calcularDanoTotal(){
        double total = 0;
        for (int i = 0; i < bolsa.size(); i++) {
            total += bolsa.get(i).getDano();
        }
        return total;
    }

    //Estudar isso aqui
    public T obterFerramentaMaisForte() {
        double maiorDano = 0;
        T ferramentaMaisForte = null;
        for (T objeto : bolsa) {
            if (objeto.getDano() > maiorDano) {
                maiorDano = objeto.getDano();
                ferramentaMaisForte = objeto;
            }
        }
        return ferramentaMaisForte;
    }

    public int qtdFerramentasArmazenadas(){
        return bolsa.size();
    }
}
