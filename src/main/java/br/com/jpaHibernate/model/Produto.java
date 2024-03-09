package br.com.jpaHibernate.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

// Estamos fazendo o mapeamento de uma entidade
@Entity // Aqui dizemos que existe uma tabela no banco de dados que chama produto
@Table(name = "produtos") // Aqui dizemos que o nome da tabela não é "Produto" e sim, tbprodutos
public class Produto {

    // Aqui definimos os mesmos atributos com as colunas do banco de dados
    // Caso, o nome da coluna fosse diferente da classe, podemos utilizar a anotação @Column

    // A JPA nao sabe que o ID é auto incrementado e nem que é um ID (Chave primaria)
    // Por isso, utilizamos a anotação @id e @GeneratedValue
    // IDENTITY é geralmente utilizado por mysql e postgre,é gerado utilizando uma coluna de identidade
    // SEQUENCE é geralmente utilziado pela oracle


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    private String nome;
    private String descricao;
    private BigDecimal preco;


    private LocalDate dataCadastro = LocalDate.now();
    @ManyToOne
    private Categoria categoria;
    public Produto(String nome, String descricao, BigDecimal preco, Categoria categoria) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.categoria = categoria;
    }

    public Produto() {
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Dados do produto: \n" +
                "ID: " + id + "\n" +
                "Nome: " + nome + "\n" +
                "Descrição: " + descricao + "\n" +
                "Preço: " + preco + "\n" +
                "Data do cadastro: " + dataCadastro + "\n" +
                "Categoria: " + categoria.getNome() + "\n" +
                "--------------- \n"  ;


    }
}
