public class Main {
    public static void main(String[] args) {
        // Membuat objek Pekerja
        Pekerja pekerja = new Pekerja("Mahardika Bayu Rahmadi", 99, "Programmer", 700000);

        // Menampilkan informasi pekerja
        System.out.println(pekerja.toString());

        // Mengubah nama pekerja
        pekerja.setNama("Bayu Jr");
        System.out.println(pekerja.toString());

        // Mencoba akses langsung atribut
        // System.out.println(pekerja.nama); // Error: nama memiliki akses private
        // System.out.println(pekerja.usia); // Error: usia memiliki akses protected
        // System.out.println(pekerja.gaji); // Error: gaji memiliki akses private
    }
}