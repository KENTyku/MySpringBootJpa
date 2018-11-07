package com.ardecs.MySpringBootJPA;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MySpringBootJpaApplicationTests {

    @Test
    public void contextLoads() {
        Country country = new Country("York");
        ApplicationContext context=new ClassPathXmlApplicationContext("META-INF/Config.xml");

//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("myJPA");
        EntityManagerFactory emf = (EntityManagerFactory) context.getBean("entityManagerFactory");
        EntityManager em = emf.createEntityManager();
// Обеспечивает постоянство Country в базе данных
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(country);
        tx.commit();

        tx.begin();
        System.out.println(em.find(Country.class,23).toString());
        tx.commit();
// Закрывает EntityManager и EntityManagerFactory
        em.close();
        emf.close();
    }

}
