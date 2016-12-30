package com.myRetail;


//locals
import com.myRetail.services.ProductService.java
import com.myRetail.repositories.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.rest.RepositoryRestMvcAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

//frameworks

@ComponentScan("com.myRetail")
@EnableAutoConfiguration(exclude = { RepositoryRestMvcAutoConfiguration.class })
@SpringBootApplication(scanBasePackages = {"com.myRetail.services", "com.myRetail.repositories"})
public class Application implements CommandLineRunner{
    @Autowired
    private ProductService productService;
    @Autowired
    private UserRepository userRepo;
    @PersistenceContext

    Logger log = LoggerFactory.getLogger(Application.class);

	private EntityManager entityManager;
    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Application.class, args);

        LoggerFactory.getLogger(Application.class).info("Product Application is online.");

    }
    @Override
    public void run(String ...args){
    		log.trace("Inside @Override CommandLineRunner.run method");
    }
}