package com.productservice.nihal.productservicenihal;

import com.productservice.nihal.productservicenihal.controller.ProductController;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProductServiceNihalApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ProductServiceNihalApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
    }
}
