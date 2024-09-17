package Praktikum4;

public class Praktikum_PBO4 {
    public static void main(String[] args) {
        // Membuat objek Mobil
        Mobil mobil = new Mobil("Toyota", 180, "Bensin", 4);

        // Menampilkan data awal
        System.out.println("Merek: " + mobil.getMerek());
        System.out.println("Model: " + mobil.getModel());
        System.out.println("Tahun: " + mobil.getTahun());

        // Mengubah data
        mobil.setModel("Innova");
        mobil.setTahun(2021);

        // Menampilkan data setelah perubahan
        System.out.println("Model baru: " + mobil.getModel());
        System.out.println("Tahun baru: " + mobil.getTahun());


        // Menampilkan informasi mobil
        mobil.tampilkanInfoMobil();
    }
}