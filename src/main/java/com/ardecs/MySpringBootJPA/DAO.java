/*
 * Use and copying for commercial purposes
 * only with the author's permission
 */
package com.ardecs.MySpringBootJPA;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Yuri Tveritin, e-mail: kentyku@bk.ru
 */
@Repository("myDAO")
public class DAO {

//    private static final String RECENT_SPITTLES
//            = "SELECT s FROM Spittle s";
//    private static final String ALL_SPITTERS
//            = "SELECT s FROM Spitter s";
//    private static final String SPITTER_FOR_USERNAME
//            = "SELECT s FROM Spitter s WHERE s.username = :username";
//    private static final String SPITTLES_BY_USERNAME
//            = "SELECT s FROM Spittle s WHERE s.spitter.username = :username";
    @PersistenceContext
    private EntityManager em;                // Для внедрения EntityManager

    public void addProduct(Product product) {
        em.persist(product);                  // Использование EntityManager
    }

    public Product getProductById(long id) {
        return em.find(Product.class, id);       // Использование EntityManager
    }

    public void saveProduct(Product product) {
        em.merge(product);                    // Использование EntityManager
    }

}
