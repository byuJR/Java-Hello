package Tugas6;

public class Main {
    public static void main(String[] args) {
        // Create some products
        Book book1 = new Book("Java Programming Book", 100000);
        Electronic electronic1 = new Electronic("Smartphone", 3000000);
        Clothing clothing1 = new Clothing("T-shirt", 150000);

        // Create a shopping cart
        ShoppingCart cart = new ShoppingCart();

        // Add products to the cart
        cart.addProduct(book1);
        cart.addProduct(electronic1);
        cart.addProduct(clothing1);

        // Display products in the cart
        cart.displayProducts();

        // Calculate the total price after discounts
        System.out.println("Total price after discount: " + cart.calculateTotalAfterDiscount());
    }
}

