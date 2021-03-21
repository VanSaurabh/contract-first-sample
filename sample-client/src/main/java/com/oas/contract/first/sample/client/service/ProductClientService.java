package com.oas.contract.first.sample.client.service;

import com.oas.contract.first.client.api.ProductsApi;
import com.oas.contract.first.client.model.ProductDetails;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class ProductClientService {

    private final ProductsApi productsApiClient;

    public List<ProductDetails> getAllProducts() {
        log.info("executing getAllProducts method of ProductClientService");
        return productsApiClient.getProducts();
    }
}



