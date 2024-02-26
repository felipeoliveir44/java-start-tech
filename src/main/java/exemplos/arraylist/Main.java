package exemplos.arraylist;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Filmes avatar = new Filmes("Filme");

        avatar.setNome("Avatar");
        avatar.setDescricao("dsoajdsoaijdasjdsa");
        avatar.setMinutos(120.00);
        avatar.setAnoLancamento(2010);

        Filmes poderosoChefao = new Filmes("Filme");
        poderosoChefao.setNome("Poderoso chefão");
        poderosoChefao.setDescricao("dsakdoasjdiosaj");
        poderosoChefao.setMinutos(200.00);
        poderosoChefao.setAnoLancamento(1990);

        Filmes interestelar = new Filmes("Filme");
        interestelar.setNome("Interestelar");
        interestelar.setDescricao("dsaijdoiacisam");
        interestelar.setMinutos(160.00);
        interestelar.setAnoLancamento(2015);

        ArrayList<Filmes> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(avatar);
        listaDeFilmes.add(poderosoChefao);
        listaDeFilmes.add(interestelar);

        System.out.println("Tamanho da lista: " + listaDeFilmes.size());
        System.out.println("Primeiro filme: " + listaDeFilmes.get(1));
        System.out.println("Segundo filme: " + listaDeFilmes.get(2).getNome());

        System.out.println("------------ Lista de filmes ------------");
        System.out.println(listaDeFilmes.toString());


        Serie lost = new Serie("Série");

    }
}
