package exemplos.ordenacao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<Integer>();

        numeros.add(5);
        numeros.add(2);
        numeros.add(60);
        numeros.add(30);

        for (Integer numero: numeros) {
            System.out.println("Número: " + numero);
        }

        Collections.sort(numeros);
        System.out.println("Lista ordenada: " + numeros);


    }
}
