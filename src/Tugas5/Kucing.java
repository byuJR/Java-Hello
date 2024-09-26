package Tugas5;

class Kucing extends Hewan {
    private String warna;

    public Kucing(String nama, String jenis, String warna) {
        super(nama, jenis);
        this.warna = warna;
    }

    public void buatSuara() {
        System.out.println("Meow!");
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Warna: " + warna);
    }
}
