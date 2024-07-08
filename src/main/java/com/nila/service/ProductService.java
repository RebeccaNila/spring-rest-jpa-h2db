package com.nila.service;

import com.nila.model.Product;
import com.nila.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public List<Product> getProducts() {
        return productRepository.findAll();
    }


    public Product getProductById(int productId) {

        return productRepository.findById(productId).orElse(new Product());
    }

    public void addProduct(Product product) {
        productRepository.save(product);
    }

    public void updateProduct(Product product) {

        productRepository.save(product);
    }

    public void deleteProduct(int productId) {

        productRepository.deleteById(productId);
    }


}
