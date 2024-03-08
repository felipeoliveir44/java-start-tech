package br.com.jpaHibernate;

import br.com.jpaHibernate.dao.ProdutoDao;
import br.com.jpaHibernate.model.Produto;
import br.com.jpaHibernate.util.JPAUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        Produto celular = new Produto();

        celular.setNome("Xiaomi");
        celular.setDescricao("Celular Xiaomi ");
        celular.setPreco(BigDecimal.valueOf(100.00));

        Produto tv = new Produto();
        tv.setNome("TV 50 Polegadas");
        tv.setDescricao("TV Samsung 50 pol");
        tv.setPreco(new BigDecimal(2300.00));


        EntityManager em = JPAUtil.getEntityManager();
        ProdutoDao produtoDao = new ProdutoDao(em);

        em.getTransaction().begin();
        produtoDao.cadastrar(tv);
        em.getTransaction().commit();
        em.close();

    }
}