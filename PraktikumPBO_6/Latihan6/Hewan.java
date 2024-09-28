package Praktikum6;

class Hewan {

    // Method for making sound
    public void bersuara() {
        System.out.println("Hewan bersuara");
    }

    // Method for eating with a specified food
    public void makan(String makanan) {
        System.out.println("Hewan makan " + makanan);
    }

    // Method for eating with a specified food and portion
    public void makan(String makanan, int jumlah) {
        System.out.println("Hewan makan " + jumlah + " porsi " + makanan);
    }
}
