package Tugas5;

class SepedaMotor extends KendaraanDarat {
    private String jenisTransmisi;

    public SepedaMotor(String merk, String model, int jumlahRoda, String jenisTransmisi) {
        super(merk, model, jumlahRoda);
        this.jenisTransmisi = jenisTransmisi;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jenis Transmisi: " + jenisTransmisi);
    }
}
