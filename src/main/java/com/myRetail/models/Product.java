package com.myRetail.models;
import com.myRetail.models.Price;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Consumer products from the myRetail company.
 * Created by morganebridges on 12/27/2016
 */
@Entity
public class Product {
    @Id
    @GeneratedValue
    private long id;
    Price price;
    public Product(String id, String name, Price price) {

    }


}
