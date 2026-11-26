package ExerciciosPOO.Exercicio02;

public class Main {
    public static void main(String[] args) {
        Armazenamento<String> armazenamentoNomes = new Armazenamento<>();
        Armazenamento<Integer> armazenamentoCodigos = new Armazenamento<>();
        Armazenamento<Double> armazenamentoPrecos = new Armazenamento<>();

        armazenamentoNomes.adicionar("Teclado");
        armazenamentoNomes.adicionar("Mouse");
        armazenamentoNomes.adicionar("Monitor");
        armazenamentoNomes.adicionar("Cadeira");
        armazenamentoNomes.adicionar("Fone");

        armazenamentoCodigos.adicionar(123);
        armazenamentoCodigos.adicionar(345);
        armazenamentoCodigos.adicionar(678);
        armazenamentoCodigos.adicionar(910);
        armazenamentoCodigos.adicionar(111);

        armazenamentoPrecos.adicionar(129.90);
        armazenamentoPrecos.adicionar(179.90);
        armazenamentoPrecos.adicionar(999.90);
        armazenamentoPrecos.adicionar(799.90);
        armazenamentoPrecos.adicionar(299.90);

        armazenamentoNomes.listar();
        armazenamentoCodigos.listar();
        armazenamentoPrecos.listar();

        armazenamentoNomes.remover("Fone");
        armazenamentoNomes.remover("Cadeira");
        armazenamentoCodigos.remover(123);
        armazenamentoCodigos.remover(456);
        armazenamentoPrecos.remover(129.90);
        armazenamentoPrecos.remover(179.90);
        armazenamentoPrecos.remover(999.90);
        System.out.println("----------------------");
        armazenamentoNomes.listar();
        armazenamentoCodigos.listar();
        armazenamentoPrecos.listar();

        System.out.println(armazenamentoNomes.obterQuantidade());

        System.out.println(armazenamentoNomes.obterElemento(1));
        System.out.println("teste");
        armazenamentoNomes.limpar();
        armazenamentoNomes.listar();
        armazenamentoPrecos.listar();


    }
}
