package exemplos.arraylist;

public class Filmes {
    String nome;
    String descricao;
    double minutos;
    int anoLancamento;

    String categoria;

    public Filmes(String categoria) {
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getMinutos() {
        return minutos;
    }

    public void setMinutos(double minutos) {
        this.minutos = minutos;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    @Override
    public String toString() {
        return ">>>> Lista de filmes: \n" +
                "Nome: " + nome + "\n" +
                "Descrição: " + descricao + "\n" +
                "Duração: " + minutos + "\n" +
                "Ano de lançamento: " + anoLancamento + "\n" +
                "Categoria: " + categoria + "\n";

    }
}
