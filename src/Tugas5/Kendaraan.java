package Tugas5;

class Kendaraan {
    protected String merk;
    protected String model;

    public Kendaraan(String merk, String model) {
        this.merk = merk;
        this.model = model;
    }

    public void tampilkanInfo() {
        System.out.println("Merk: " + merk);
        System.out.println("Model: " + model);
    }
}
