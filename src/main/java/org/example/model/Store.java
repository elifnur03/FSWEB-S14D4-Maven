package org.example.model;

public class Store {
    public static void listProducts(ProductForSale[] products) {
        for (ProductForSale product : products) {
            product.showDetails();
            System.out.println("----------");
        }
    }

    public static void main(String[] args) {
        ProductForSale[] products = new ProductForSale[3];
        products[0] = new Chocolate("Chocolate", 5.99, "Dark chocolate", "Milka");
        products[1] = new Coke("Coke", 2.99, "Soft drink", 330);
        products[2] = new Bread("Bread", 1.99, "White bread", 500.0);

        listProducts(products);
    }
}