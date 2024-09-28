package Tugas6;

public class Book extends Product {

    public Book(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculateDiscount() {
        // Example: 10% discount for books
        return price * 0.10;
    }
}

