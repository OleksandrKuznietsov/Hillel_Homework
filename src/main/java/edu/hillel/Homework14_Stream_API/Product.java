package edu.hillel.Homework14_Stream_API;

import java.util.*;
import java.util.stream.Collectors;
import java.time.LocalDate;


public class Product {
    private final String type;
    private double price;
    private final boolean discount;
    private final LocalDate createDate;
    private final int id;

    public Product(String type, double price, boolean discount, int id, LocalDate createDate) {
        this.type = type;
        this.price = price;
        this.discount = discount;
        this.id = id;
        this.createDate = createDate;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public static List<Product> getProductsList(List<Product> products, String type, double price) {
        return products.stream()
                .filter(product -> product.getType().equals(type))
                .filter(product -> product.getPrice() > price)
                .collect(Collectors.toList());

    }


    public static List<Product> getProductsWithDiscount(List<Product> products, String type) {
        return products.stream()
                .filter(product -> product.getType().equals(type))
                .filter(product -> product.discount)
                .peek(product -> product.price *= 0.9)
                .collect(Collectors.toList());
    }


    public static Product getCheapestProduct(List<Product> products, String type) {
        Optional<Product> cheapestProduct = products.stream()
                .filter(product -> product.getType().equals(type))
                .min(Comparator.comparingDouble(product -> product.price));
        return cheapestProduct.orElseThrow(() ->
                new NoSuchElementException("Product from [" + type + "] category not found"));
    }


    public static List<Product> getLastProducts(List<Product> products, long numberOfProducts) {
        return products.stream()
                .sorted(Comparator.comparing(Product::getCreateDate).reversed())
                .limit(numberOfProducts)
                .collect(Collectors.toList());
    }


    public static double getTotalCost(List<Product> products, String type) {
        LocalDate currentDate = LocalDate.now();
        return products.stream()
                .filter(product -> product.getType().equals(type))
                .filter(product -> product.getPrice() <= 75)
                .filter(product -> product.getCreateDate().getYear() == currentDate.getYear())
                .mapToDouble(Product::getPrice)
                .sum();
    }


    public static Map<String, List<Product>> groupByType(List<Product> products) {
        return products.stream()
                .collect(Collectors.groupingBy(Product::getType));
    }

    @Override
    public String toString() {
        return "Product{" +
                "type='" + type + '\'' +
                ", price=" + price +
                ", discount=" + discount +
                ", createDate=" + createDate +
                ", id=" + id +
                '}';
    }
}
