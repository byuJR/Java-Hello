package Praktikum4;

public class Mobil extends Kendaraan {
    protected  int kecepatanMaks;
    protected int jumlahPintu; // Atribut tambahan khusus untuk mobil

    // Constructor
    public Mobil(String nama, int kecepatanMaks, String jenisMesin, int jumlahPintu) {
        super(nama, jenisMesin, kecepatanMaks); // Memanggil constructor dari kelas induk
        this.jumlahPintu = jumlahPintu;
        this.kecepatanMaks = kecepatanMaks;
    }

    // Method untuk menampilkan informasi mobil
    public void tampilkanInfoMobil() {
        // Dapat mengakses kecepatanMaks karena protected
        System.out.println("Kecepatan Maksimum Mobil: " + kecepatanMaks + " km/h");
        System.out.println("Jumlah Pintu: " + jumlahPintu);
    }
}
