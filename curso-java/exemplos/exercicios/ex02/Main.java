package exemplos.exercicios.ex02;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Caneca", 10.00, 5);
        Produto produto2 = new Produto("Camisa", 50.00, 2);
        Produto produto3 = new Produto("Calça", 120.00, 1);

        ArrayList<Produto> produtos = new ArrayList<>();
        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);

        System.out.println("Tamanho da lista: " + produtos.size());
        System.out.println("Produto: " + produtos.get(1).getId());
        System.out.println(produtos);

    }
}
