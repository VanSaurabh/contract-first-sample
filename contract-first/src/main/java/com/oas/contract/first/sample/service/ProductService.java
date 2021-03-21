package com.oas.contract.first.sample.service;

import com.oas.contract.first.sample.model.Products;
import com.oas.contract.first.sample.repository.ProductRepository;
import com.oas.contract.first.server.model.ProductDetails;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Slf4j
@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public List<ProductDetails> getProducts() {
        Map<String, Products> productsMap = productRepository.getAllProducts();
        List<ProductDetails> productDetailsList = new ArrayList<>();
        productsMap.forEach((k, v) ->
                productDetailsList.add(new ProductDetails()
                        .name(v.getName())
                        .price(BigDecimal.valueOf(v.getPrice()))
                        .category(getCategory(v.getCategory())))
        );
        return productDetailsList;
    }

    private ProductDetails.CategoryEnum getCategory(String category) {
        switch (category){
            case "FASHION":
                return ProductDetails.CategoryEnum.FASHION;
            case "FOOD":
                return ProductDetails.CategoryEnum.FOOD;
            case "ELECTRONICS":
                return ProductDetails.CategoryEnum.ELECTRONICS;
            default:
                throw new IllegalArgumentException("Invalid category");
        }
    }
}
