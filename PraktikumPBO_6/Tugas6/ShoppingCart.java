package Tugas6;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Product> productList;

    public ShoppingCart() {
        productList = new ArrayList<>();
    }

    // Add product to the shopping cart
    public void addProduct(Product product) {
        productList.add(product);
    }

    // Calculate total price after discount
    public double calculateTotalAfterDiscount() {
        double total = 0;
        for (Product product : productList) {
            double priceAfterDiscount = product.getPrice() - product.calculateDiscount();
            total += priceAfterDiscount;
        }
        return total;
    }

    // Display all products in the cart
    public void displayProducts() {
        for (Product product : productList) {
            System.out.println(product.getName() + " - Price: " + product.getPrice() +
                    ", Discount: " + product.calculateDiscount() +
                    ", Price after discount: " + (product.getPrice() - product.calculateDiscount()));
        }
    }
}
