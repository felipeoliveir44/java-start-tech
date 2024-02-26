package exemplos.exercicios.ex02;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto(1, "Caneca", 10.00, 5);
        Produto produto2 = new Produto(2, "Camisa", 50.00, 2);
        Produto produto3 = new Produto(3, "Calça", 120.00, 1);

        ArrayList<Produto> produtos = new ArrayList<>();
        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);

        System.out.println("Tamanho da lista: " + produtos.size());
        System.out.println("Produto: " + produtos.get(1).getNome());
        System.out.println(produtos);

        ProdutoPerecivel leite = new ProdutoPerecivel(1, "Leite", 15.00, 3, 2024);
        System.out.println(leite.toString());
        System.out.println("------ Utilizando for --------");

        for (Produto item: produtos) {
            System.out.println(item);
        }
    }
}
