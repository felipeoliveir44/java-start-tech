package exemplos.exercicios.ex01;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Fulano", 19);
        Pessoa pessoa2 = new Pessoa("Sicrano", 20);
        Pessoa pessoa3 = new Pessoa("Cicrano", 21);

        ArrayList<Pessoa> listaPessoas = new ArrayList<>();

        listaPessoas.add(pessoa1);
        listaPessoas.add(pessoa2);
        listaPessoas.add(pessoa3);

        System.out.println("Tamanho da lista: " + listaPessoas.size());
        System.out.println("Pessoa: " + listaPessoas.get(1));
        System.out.println(listaPessoas.toString());

    }
}
