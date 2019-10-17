package com.codegym.controller;

import com.codegym.model.Product;
import com.codegym.service.ProductService;
import com.codegym.service.ProductServiceImpl;

import java.util.List;

public class ProductController {
    ProductService productService = new ProductServiceImpl();

    public List<Product> showAllProduct() {
        List<Product> productList = productService.findAll();
        if (productList.size() == 0) {
            System.out.println("Khong co san pham nao");
        }
        return productList;
    }

    public void addProduct(Product product) {
        productService.add(product);
    }

    public void editProduct(int id, Product product) {
        productService.edit(id, product);
    }

    public void removeProduct(int id) {
        productService.remove(id);
    }

    public void sortUpProduct() {
        productService.sortUp();
    }

    public void sortDownProduct() {
        productService.sortDown();
    }

    public Product searchProduct(String name) {
        return productService.search(name);
    }


}
