package com.ardecs.MySpringBootJPA;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import org.junit.Test;
import org.junit.runner.RunWith;
//import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
//@SpringBootTest
public class MySpringBootJpaApplicationTests {

    @Test
    public void contextLoads() {
        Country country = new Country("York");
        ApplicationContext context=new ClassPathXmlApplicationContext("Config.xml");

//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("myJPA");
        EntityManagerFactory emf = (EntityManagerFactory) context.getBean("emf");
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
