package com.codegym.casestudy.service.Product;

import com.codegym.casestudy.model.Product;

import java.sql.PreparedStatement;

public interface ProductService {
    Iterable<Product> findAll();

    Product findOne(Long id);

    void save(Product product);

    void delete(Long id);
}
