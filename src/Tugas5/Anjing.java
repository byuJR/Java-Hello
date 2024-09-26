package Tugas5;

class Anjing extends Hewan {
    private String ras;

    public Anjing(String nama, String jenis, String ras) {
        super(nama, jenis);
        this.ras = ras;
    }

    public void buatSuara() {
        System.out.println("Guk! Guk!");
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Ras: " + ras);
    }
}
