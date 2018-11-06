/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ardecs.MySpringBootJPA;


import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.validation.constraints.NotNull;
import org.springframework.stereotype.Component;

/**
 *
 * @author jury
 */
//@Component
@Entity
    @NamedQuery(name = "findAllProducts", query = "SELECT p FROM Country p")
public class Country  {

    @Id
    @GeneratedValue
    private int id;
    @NotNull
    private String countryName;

    public Country() {
    }

    Country(String countryName) {
        this.countryName = countryName;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the country_name
     */
    public String getCountryName() {
        return countryName;
    }

    /**
     * @param country_name the country_name to set
     */
    public void setCountryName(String country_name) {
        this.countryName = country_name;
    }
}
