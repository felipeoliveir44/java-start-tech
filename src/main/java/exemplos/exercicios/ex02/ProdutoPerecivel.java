package exemplos.exercicios.ex02;

public class ProdutoPerecivel extends Produto{
    int dataValidade;

    public ProdutoPerecivel(int id, String nome, double preco, int quantidade, int dataValidade) {
        super(id, nome, preco, quantidade);
        this.dataValidade = dataValidade;
    }

    public int getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(int dataValidade) {
        this.dataValidade = dataValidade;
    }

    @Override
    public String toString() {
        return "ProdutoPerecivel{" +
                "dataValidade=" + dataValidade +
                ", id=" + id +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }
}
