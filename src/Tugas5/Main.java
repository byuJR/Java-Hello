package Tugas5;

public class Main {
    public static void main(String[] args) {
        // Contoh penggunaan kelas Kucing
        Kucing kucing = new Kucing("Milo", "Domestik", "Kuning");
        kucing.tampilkanInfo();
        kucing.buatSuara();
        System.out.println();

        // Contoh penggunaan kelas Anjing
        Anjing anjing = new Anjing("Buddy", "Herder", "Golden Retriever");
        anjing.tampilkanInfo();
        anjing.buatSuara();
        System.out.println();

        // Contoh penggunaan kelas Mobil
        Mobil mobil = new Mobil("Toyota", "Camry", 4, "Otomatis");
        mobil.tampilkanInfo();
        System.out.println();

        // Contoh penggunaan kelas SepedaMotor
        SepedaMotor motor = new SepedaMotor("Honda", "CBR600RR", 2, "Manual");
        motor.tampilkanInfo();
    }
}
