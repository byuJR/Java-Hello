package praktikum3;

public class Hewan {
    // Atribut private
    private String nama;
    private int umur;

    // Constructor untuk menginisialisasi atribut
    public Hewan(String nama, int umur) {
        this.nama = nama;  // 'this' mengacu pada atribut class
        this.umur = umur;
    }

    // Getter untuk nama
    public String getNama() {
        return nama;
    }

    // Setter untuk nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter untuk umur
    public int getUmur() {
        return umur;
    }

    // Setter untuk umur
    public void setUmur(int umur) {
        this.umur = umur;
    }

    // Method suara()
    public void suara() {
        System.out.println("Hewan bersuara");
    }

    // Method info() untuk menampilkan informasi lengkap
    public void info() {
        System.out.println("Nama: " + getNama() + ", Umur: " + getUmur());
    }
    
    public void berlari() {
        System.out.println("Hewan sedang berlari");
    }
}
