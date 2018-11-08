package com.ardecs.MySpringBootJPA;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceContext;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import java.util.ArrayList;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:META-INF/Config.xml"})
public class MySpringBootJpaApplicationTests {
    @Autowired
    private CountryRepository countryRepository;
    @PersistenceContext()
    EntityManager em;

    @Test
    public void contextLoads() {


//        JpaTransactionManager txnManager = null;
//        TransactionStatus status =
//                txnManager.getTransaction(new DefaultTransactionDefinition());
        ArrayList<Country> countries = (ArrayList<Country>) countryRepository.findAll();
        for (Country country : countries) {
            System.out.println(country.toString());
        }
//        txnManager.commit(status);

        Country country2=new Country("USA");
        countryRepository.save(country2);
    }

}
