package Tugas5;

class KendaraanDarat extends Kendaraan {
    protected int jumlahRoda;

    public KendaraanDarat(String merk, String model, int jumlahRoda) {
        super(merk, model);
        this.jumlahRoda = jumlahRoda;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jumlah Roda: " + jumlahRoda);
    }
}
