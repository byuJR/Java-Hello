package Tugas6;

public class Electronic extends Product {

    public Electronic(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculateDiscount() {
        // Example: 15% discount for electronics
        return price * 0.15;
    }
}

