package de.neufische.aufgabe0510.controller;

import de.neufische.aufgabe0510.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("product")

public class ProductController {



    List<Product> products = List.of(new Product("Bike"), new Product("Car"));

    @GetMapping
    public List<Product> getProducts() {
        return products;
    }



}
