package com.codegym.repository;

import com.codegym.model.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ProductRepositoryImpl implements ProductRepository {

    List<Product> productList = new ArrayList<>();

    {
        productList.add(new Product(1, "Meomeo", 1000));
        productList.add(new Product(2, "gaugau", 2000));
        productList.add(new Product(3, "chitchit", 3000));
    }


    @Override
    public void add(Product product) {
        productList.add(product);
    }

    @Override
    public void edit(int id, Product product) {
        productList.set((id - 1), product);

    }

    @Override
    public void remove(int id) {
        productList.remove((id - 1));
    }

    @Override
    public Product search(String name) {
        for (Product item : productList) {

            if (item.getName().equals(name)) {
                return item;
            }
        }
        return null;
    }

    @Override
    public void sortUp() {
        List<Product> array = new ArrayList<>();
        productList.sort(Comparator.comparing(Product::getPrice));
    }

    @Override
    public void sortDown() {
        List<Product> array = new ArrayList<>();
        productList.sort(Comparator.comparing(Product::getPrice).reversed());

    }


    @Override
    public List<Product> findAll() {
        return productList;
    }
}
