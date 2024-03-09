package br.com.jpaHibernate;

import br.com.jpaHibernate.dao.CategoriaDao;
import br.com.jpaHibernate.dao.ProdutoDao;
import br.com.jpaHibernate.model.Categoria;
import br.com.jpaHibernate.model.Produto;
import br.com.jpaHibernate.util.JPAUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.math.BigDecimal;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EntityManager em = JPAUtil.getEntityManager();
        EntityTransaction transaction = em.getTransaction();
        ProdutoDao produtoDao = new ProdutoDao(em);
        BigDecimal precoDoProduto = produtoDao.buscarPorPrecoProduto("Xiaomi");
        System.out.println("Preço: " + precoDoProduto);

        /*Produto p = produtoDao.buscarPorId(1l);
        System.out.println(p.getNome());
        List<Produto> todos = produtoDao.buscarPorNome("Xiaomi Redmi");
        System.out.println(todos);
        List<Produto> categoria = produtoDao.buscarPorNomeCategoria("Celulares");
        System.out.println("Categoria: " + categoria);

        BigDecimal precoDoProduto = produtoDao.buscarPorPrecoProduto("Xiaomi Redmi");
        System.out.println("Preço: " + precoDoProduto);*/



    }

    public static void cadastrarProduto(String nomeProduto, String descricao, BigDecimal preco, String nomeCategoria) {
        Categoria categoria = new Categoria(nomeCategoria);
        Produto celular = new Produto(nomeProduto, descricao, preco, categoria);

        EntityManager em = JPAUtil.getEntityManager();
        ProdutoDao produtoDao = new ProdutoDao(em);
        CategoriaDao categoriaDao = new CategoriaDao(em);

        em.getTransaction().begin();

        categoriaDao.cadastrar(categoria);
        produtoDao.cadastrar(celular);

        em.getTransaction().commit();
        em.close();
    }

    public static void excluirRegistro(String nome) {
        EntityManager em = JPAUtil.getEntityManager();
        EntityTransaction transaction = em.getTransaction();
        ProdutoDao produtoDao = new ProdutoDao(em);
        try {
            transaction.begin();
            // Chamar o método para remover o registro
            produtoDao.removerRegistro(nome);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            em.close();
        }
    }

}