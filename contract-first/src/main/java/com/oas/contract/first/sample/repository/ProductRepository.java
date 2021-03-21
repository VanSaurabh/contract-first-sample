package com.oas.contract.first.sample.repository;

import com.oas.contract.first.sample.model.Products;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Slf4j
@Repository
public class ProductRepository {

    private Map<String, Products> productsMap = null;

    @PostConstruct
    public void setupProductsMap() {
        productsMap = new HashMap<>();
        productsMap.put("product1", Products.builder().name("product1").category("FASHION").price(120.00).build());
        productsMap.put("product2", Products.builder().name("product2").category("FOOD").price(10.00).build());
        productsMap.put("product3", Products.builder().name("product3").category("ELECTRONICS").price(110.00).build());
        productsMap.put("product4", Products.builder().name("product4").category("FASHION").price(1200.00).build());
        productsMap.put("product5", Products.builder().name("product5").category("FOOD").price(1120.00).build());
        productsMap.put("product6", Products.builder().name("product6").category("ELECTRONICS").price(20.00).build());
        productsMap.put("product7", Products.builder().name("product7").category("FASHION").price(12.00).build());
        productsMap.put("product8", Products.builder().name("product8").category("FOOD").price(10.00).build());
        productsMap.put("product9", Products.builder().name("product9").category("ELECTRONICS").price(1200.00).build());
        productsMap.put("product10", Products.builder().name("product10").category("FASHION").price(120.00).build());
    }


    public Map<String, Products> getAllProducts() {
        return productsMap;
    }
}
