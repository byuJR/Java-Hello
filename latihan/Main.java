package praktikum3;

public class Main {
    public static void main(String[] args) {
        // Membuat objek Hewan menggunakan constructor
        Hewan kucing = new Hewan("Mimi", 3);

        // Menampilkan informasi tentang kucing
        kucing.info();

        // Mengubah nama dan umur menggunakan setter
        kucing.setNama("Kitty");
        kucing.setUmur(4);

        // Menampilkan informasi yang diupdate
        kucing.info();
        
        // Membuat objek Hewan baru untuk anjing
        Hewan anjing = new Hewan("Buddy", 5);
        anjing.berlari(); // Memanggil method berlari()
    }
}
