package com.ardecs.MySpringBootJPA;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:META-INF/Config.xml"})
public class MySpringBootJpaApplicationTests {
    @Autowired
    private CountryRepository countryRepository;

    @Test
    public void contextLoads() {
//        Country country = new Country("York");
//        ApplicationContext context=new ClassPathXmlApplicationContext("META-INF/Config.xml");
//
////        EntityManagerFactory emf = Persistence.createEntityManagerFactory("myJPA");
//        EntityManagerFactory emf = (EntityManagerFactory) context.getBean("entityManagerFactory");
//        EntityManager em = emf.createEntityManager();
//// Обеспечивает постоянство Country в базе данных
//        EntityTransaction tx = em.getTransaction();
//        tx.begin();
//        em.persist(country);
//        tx.commit();
//
//        tx.begin();
//        System.out.println(em.find(Country.class,23).toString());
//        tx.commit();
//        tx.begin();
//        System.out.println(countryRepository.findById((long) 24).toString());
//        tx.commit();
//
//
//// Закрывает EntityManager и EntityManagerFactory
//        em.close();
//        emf.close();
        ArrayList<Country> countries= (ArrayList<Country>) countryRepository.findAll();
        for (Country country:countries) {
            System.out.println(country.toString());

        }
    }

}
