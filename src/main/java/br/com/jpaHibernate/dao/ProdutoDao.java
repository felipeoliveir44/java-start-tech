package br.com.jpaHibernate.dao;

import br.com.jpaHibernate.model.Produto;

import javax.persistence.EntityManager;
import java.math.BigDecimal;
import java.util.List;

public class ProdutoDao {

    private EntityManager em;

    public ProdutoDao(EntityManager em) {
        this.em = em;
    }

    public void cadastrar(Produto produto) {
        this.em.persist(produto);
    }

    public void atualizar(Produto produto) {
        this.em.merge(produto);
    }

    public void remover(Produto produto) {
        produto = em.merge(produto);
        this.em.remove(produto);
    }

    public Produto buscarPorId(Long id) {
        return em.find(Produto.class, id);
    }

    public List<Produto> buscarTodos() {
        String jpql = "select p from Produto p";
        return em.createQuery(jpql, Produto.class).getResultList();
    }

    public List<Produto> buscarPorNome(String nome) {
        String jpql = "select p from Produto p where p.nome = :nome";
        return em.createQuery(jpql, Produto.class)
                .setParameter("nome", nome)
                .getResultList();
    }

    public List<Produto> buscarPorNomeCategoria(String nomeCategoria) {
        String jpql = "select p from Produto p where p.categoria.nome = ?1";
        return em.createQuery(jpql, Produto.class)
                .setParameter(1, nomeCategoria)
                .getResultList();
    }

    public BigDecimal buscarPorPrecoProduto(String nome) {
        String jpql = "select p.preco from Produto p where p.nome = ?1";
        return em.createQuery(jpql, BigDecimal.class)
                .setParameter(1, nome)
                .getSingleResult();
    }

    public int removerRegistro(String nome) {
        String jpql = "delete from Produto p where p.nome = ?1";
        return em.createQuery(jpql)
                .setParameter(1, nome)
                .executeUpdate();
    }
}
