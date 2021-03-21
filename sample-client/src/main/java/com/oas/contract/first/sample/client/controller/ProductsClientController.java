package com.oas.contract.first.sample.client.controller;

import com.oas.contract.first.client.model.ProductDetails;
import com.oas.contract.first.sample.client.service.ProductClientService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/client")
@RequiredArgsConstructor
public class ProductsClientController {

    private final ProductClientService productClientService;

    @GetMapping("products")
    public ResponseEntity<List<ProductDetails>> getProducts() {
        log.info("executing getProducts method of ProductsClientController");
        return ResponseEntity.ok(productClientService.getAllProducts());
    }
}
