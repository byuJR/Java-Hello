package Tugas6;

public class Clothing extends Product {

    public Clothing(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculateDiscount() {
        // Example: 5% discount for clothing
        return price * 0.05;
    }
}

