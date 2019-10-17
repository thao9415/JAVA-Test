package com.codegym.views;

import com.codegym.controller.ProductController;
import com.codegym.model.Product;

import java.util.List;
import java.util.Scanner;

public class ProductView {
    public static Scanner scanner = new Scanner(System.in);
    public static ProductController productController = new ProductController();

    private static void menu() {
        System.out.println("Menu: ");
        System.out.println("1. Show list product ");
        System.out.println("2. Add product ");
        System.out.println("3. Edit product ");
        System.out.println("4. Remote list product ");
        System.out.println("5. Find product by name ");
        System.out.println("6. SortUp product by price ");
        System.out.println("6. SortDown product by price ");
        System.out.println("0. Exit! ");
    }

    private static Product inputProduct() {
        System.out.println("Please add info of product: ");
        System.out.println("Id: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Name: ");
        String name = scanner.nextLine();
        System.out.println("Price: ");
        float price = scanner.nextFloat();

        Product product = new Product(id, name, price);
        return product;

    }

    public static void main(String[] args) {

        int choice;
        do {
            menu();
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    List<Product> productList = productController.showAllProduct();
                    for (Product item : productList) {
                        System.out.println("ID: " + item.getId() + " Name: " + item.getName() + " Price: " + item.getPrice());
                    }
                    break;
                case 2: {
                    Product product = inputProduct();
                    productController.addProduct(product);
                    break;
                }
                case 3: {
                    System.out.print("Enter id of product you want edit: ");
                    int id = scanner.nextInt();
                    Product product = inputProduct();
                    productController.editProduct(id, product);
                    break;
                }
                case 4: {
                    System.out.print("Enter id of product you want remove: ");
                    int id = scanner.nextInt();
                    productController.removeProduct(id);
                    break;
                }
                case 5: {
                    System.out.print("Enter name of product you want search");
                    String name = scanner.nextLine();
                    productController.searchProduct(name);
                    break;
                }
                case 6: {
                    productController.sortUpProduct();
                    break;
                }
                case 7: {
                    productController.sortDownProduct();
                    break;
                }

            }

        } while (choice != 0);

    }
}
