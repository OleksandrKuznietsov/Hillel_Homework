package edu.hillel.Homework14_Stream_API;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) {
        List<Product> productsList = new ArrayList<>();

        Product product1 = new Product("Book", 300, true, 1,
                LocalDate.of(2023, 8, 12));
        Product product2 = new Product("Book", 260, true, 2,
                LocalDate.of(2023, 7, 19));
        Product product3 = new Product("Book", 75, true, 3,
                LocalDate.of(2021, 5, 17));
        Product product4 = new Product("Book", 50, false, 4, LocalDate.now());
        Product product5 = new Product("Pen", 10, true, 5, LocalDate.now());
        Product product6 = new Product("Pen", 20, false, 6, LocalDate.now());
        Product product7 = new Product("Pencil", 15, true, 7, LocalDate.now());
        Product product8 = new Product("Pencil", 25, true, 8, LocalDate.now());
        Product product9 = new Product("Pencil", 5, false, 9, LocalDate.now());

        productsList.add(product1);
        productsList.add(product2);
        productsList.add(product3);
        productsList.add(product4);
        productsList.add(product5);
        productsList.add(product6);
        productsList.add(product7);
        productsList.add(product8);
        productsList.add(product9);


        System.out.println(Product.getProductsList(productsList, "Book", 250));

        System.out.println(Product.getProductsWithDiscount(productsList, "Pencil"));

        System.out.println(Product.getCheapestProduct(productsList, "Book"));

        try {
            System.out.println(Product.getCheapestProduct(productsList, "Plate"));
        } catch (NoSuchElementException e) {
            System.out.println(e.getMessage());
        }


        System.out.println(Product.getLastProducts(productsList, 3));

        System.out.println("Total cost: " + Product.getTotalCost(productsList, "Pencil"));

        System.out.println(Product.groupByType(productsList));


    }
}
