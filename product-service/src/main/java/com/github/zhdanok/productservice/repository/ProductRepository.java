package com.github.zhdanok.productservice.repository;

import com.github.zhdanok.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
