package de.neufische.aufgabe0510.model;


import org.springframework.web.bind.annotation.GetMapping;


public class Product {

    String productName;

    public Product(String productName) {
        this.productName = productName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

}
