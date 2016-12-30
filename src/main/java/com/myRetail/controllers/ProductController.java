package com.myRetail.controllers;

import com.myRetail.models.*;
import com.myRetail.repositories.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.myRetail.models.Product;


/**
 * Created by fjorgeDevelopers on 12/28/16.
 */
public class ProductControllerpackage com.myRetail.controllers;



@ComponentScan("com.myRetail")
@EnableAutoConfiguration
@RequestMapping("/user")
@RestController
public class UserController {
    @Autowired
    UserRepository userRepo;

    @Autowired
    ZombieRepository zombieRepo;

    @Autowired
    UserService userService;

    /**
     * An endpoint responsible for returning the metadata on a single product in the system.
     * @param - The UID for the requested product.
     * @return - Encoded JSON data representing a product.
     * @throws IllegalStateException
     */
    @RequestMapping(path="/products", method = RequestMethod.GET)
    public Product getProductInfo(@RequestBody String id) throws IllegalStateException{
        return new Product("0122d", "name", new Price("34kd", "USA"));
    }

    @Autowired
    ProductService productService;

    private final Logger log = LoggerFactory.getLogger(UserController.class);
    @RequestMapping(path="/products", method = RequestMethod.GET)
    public Product[] getProductInfo(@RequestBody String[] ids) throws IllegalStateException{
        Product[] theReturn = new Product[ids.length];

    }
String arr[] = new String[];
    /**
     * ()() _-^-.'.=Extra Credit!='.-^-_ ()()
     * Overload the
     *
     */
    @RequestMapping(path="/products", method = RequestMethod.PUT){

    }
}
