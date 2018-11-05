/*
 * Use and copying for commercial purposes
 * only with the author's permission
 */
package com.ardecs.MySpringBootJPA;

import com.sun.istack.internal.NotNull;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import org.springframework.stereotype.Component;

/**
 *
 * @author Yuri Tveritin, e-mail: kentyku@bk.ru
 */
@Component
public class Product {

    @Id
    @GeneratedValue
    private long id;
    @NotNull
    private float price;
    private long categoryID;
    private long countryID;
    private String name;
    private String comment;

    /**
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * @return the price
     */
    public float getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(float price) {
        this.price = price;
    }

    /**
     * @return the categoryID
     */
    public long getCategoryID() {
        return categoryID;
    }

    /**
     * @param categoryID the categoryID to set
     */
    public void setCategoryID(long categoryID) {
        this.categoryID = categoryID;
    }

    /**
     * @return the countryID
     */
    public long getCountryID() {
        return countryID;
    }

    /**
     * @param countryID the countryID to set
     */
    public void setCountryID(long countryID) {
        this.countryID = countryID;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the comment
     */
    public String getComment() {
        return comment;
    }

    /**
     * @param comment the comment to set
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

}
