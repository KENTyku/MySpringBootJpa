package com.ardecs.MySpringBootJPA;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.Optional;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:META-INF/Config.xml"})
public class MySpringBootJpaApplicationTests {
    @Autowired
    private CountryRepository countryRepository;

    @Test
    public void testCrud() {

        ArrayList<Country> countries = (ArrayList<Country>) countryRepository.findAll();
        for (Country country : countries) {
            System.out.println(country.toString());
        }
        Country country4 = new Country("123");
        countryRepository.save(country4);
        Country country2=countryRepository.findById(72);
        country2.setCountryName("Test");
        countryRepository.save(country2);
//        countryRepository.delete(country4);
        System.out.println("TEST "+country2.toString());

//
    }

}
