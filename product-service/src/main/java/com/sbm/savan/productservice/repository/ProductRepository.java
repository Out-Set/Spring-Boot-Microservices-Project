package com.sbm.savan.productservice.repository;

import com.sbm.savan.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {

}
