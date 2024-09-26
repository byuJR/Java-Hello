package Tugas5;

class Mobil extends KendaraanDarat {
    private String jenisTransmisi;

    public Mobil(String merk, String model, int jumlahRoda, String jenisTransmisi) {
        super(merk, model, jumlahRoda);
        this.jenisTransmisi = jenisTransmisi;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jenis Transmisi: " + jenisTransmisi);
    }
}
