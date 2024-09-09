package tugas;

public class Main {
    public static void main(String[] args) {
        // Membuat objek Mobil
        Mobil mobil1 = new Mobil("Toyota", "Avanza", 2020, "Merah");
        Mobil mobil2 = new Mobil("Honda", "Civic", 2021, "Biru");

        // Menampilkan informasi mobil
        mobil1.displayInfo();
        mobil1.startEngine();
        System.out.println(); // Untuk pemisah

        mobil2.displayInfo();
        mobil2.startEngine();
    }
}