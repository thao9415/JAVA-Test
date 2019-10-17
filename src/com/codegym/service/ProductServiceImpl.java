package com.codegym.service;

import com.codegym.model.Product;
import com.codegym.repository.ProductRepositoryImpl;

import java.util.List;

public class ProductServiceImpl implements ProductService {
    ProductRepositoryImpl productRepository = new ProductRepositoryImpl();

    @Override
    public void add(Product product) {

        productRepository.add(product);

    }

    @Override
    public void edit(int id, Product product) {
        productRepository.edit(id, product);

    }

    @Override
    public void remove(int id) {

        productRepository.remove(id);

    }

    @Override
    public void sortUp() {

        productRepository.sortUp();

    }

    @Override
    public void sortDown() {

        productRepository.sortDown();

    }

    @Override
    public Product search(String name) {
        return productRepository.search(name);
    }

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }
}
