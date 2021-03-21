package com.oas.contract.first.sample.controller;

import com.oas.contract.first.sample.service.ProductService;
import com.oas.contract.first.server.api.ProductsApi;
import com.oas.contract.first.server.model.ProductDetails;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
public class ProductController implements ProductsApi {

    private final ProductService productService;

    @Override
    @GetMapping("service/products")
    public ResponseEntity<List<ProductDetails>> getProducts() {
        log.info("executing getProducts method of ProductController...");
        return ResponseEntity.ok(productService.getProducts());
    }
}
