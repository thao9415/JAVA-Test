package com.codegym.service;

import com.codegym.model.Product;
import com.codegym.repository.GeneralRepository;

public interface ProductService extends GeneralRepository<Product> {
    void add(Product product);

    void edit(int id, Product product);

    void remove(int id);

    Product search(String name);

    void sortUp();

    void sortDown();
}
