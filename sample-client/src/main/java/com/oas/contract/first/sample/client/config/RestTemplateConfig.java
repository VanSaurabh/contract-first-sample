package com.oas.contract.first.sample.client.config;

import com.oas.contract.first.client.api.ProductsApi;
import com.oas.contract.first.client.utils.ApiClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig {

    @Bean
    public ProductsApi configureProductsApiClient() {
        return new ProductsApi(
                new ApiClient(
                        new RestTemplate()
                ).setBasePath("http://localhost:8081")
        );
    }
}


