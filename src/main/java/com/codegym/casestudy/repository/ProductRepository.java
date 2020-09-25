package com.codegym.casestudy.repository;

import com.codegym.casestudy.model.Product;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ProductRepository extends PagingAndSortingRepository<Product, Long> {
}
