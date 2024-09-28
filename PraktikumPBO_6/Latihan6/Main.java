package Praktikum6;

public class Main {
    public static void main(String[] args) {
        // Create objects of Kucing and Anjing
        Hewan kucing = new Kucing();
        Hewan anjing = new Anjing();

        // Call bersuara on each object
        System.out.println("Suara kucing: ");
        kucing.bersuara();  // Output: Meow

        System.out.println("Suara anjing: ");
        anjing.bersuara();  // Output: Woof

        // Demonstrating polymorphism
        Hewan hewan = new Hewan();
        System.out.println("Suara hewan umum: ");
        hewan.bersuara();   // Output: Hewan bersuara
    }
}