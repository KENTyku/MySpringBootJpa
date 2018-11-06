package com.ardecs.MySpringBootJPA;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MySpringBootJpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(MySpringBootJpaApplication.class, args);
        Country country = new Country("Russia");
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("com."
                + "ardecs_MySpringBootJPA_jar_0.0.1-SNAPSHOTPU");
        EntityManager em = emf.createEntityManager();
// Обеспечивает постоянство Country в базе данных
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(country);
        tx.commit();
// Закрывает EntityManager и EntityManagerFactory
        em.close();
        emf.close();
    }
}
