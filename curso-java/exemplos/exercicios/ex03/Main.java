package exemplos.exercicios.ex03;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> listaNome = new ArrayList<>();

        listaNome.add("Fulano");
        listaNome.add("Sicrano");
        listaNome.add("Beltrano");

        for (String nomes: listaNome) {
            System.out.println("Nome: " + nomes);
        }
    }
}
