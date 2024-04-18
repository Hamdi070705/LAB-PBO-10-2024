package Tugas4No2;

public class Laptop {
    private String merk;
    private String model;
    private int harga;
    private String tahunProduksi;
    private String deskripsi;

    public Laptop() {
    }
    

    public Laptop(String merk, String model, int harga, String tahunProduksi, String deskripsi) {
        this.merk = merk;
        this.model = model;
        this.harga = harga;
        this.tahunProduksi = tahunProduksi;
        this.deskripsi = deskripsi;
    }


    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public String getTahunProduksi() {
        return tahunProduksi;
    }

    public void setTahunProduksi(String tahunProduksi) {
        this.tahunProduksi = tahunProduksi;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public void displayInfo() {
        System.out.println("Merk           : " + getMerk());
        System.out.println("Model          : " + getModel());
        System.out.println("Harga          : " + getHarga());
        System.out.println("Tahun Produksi : " + getTahunProduksi());
        System.out.println("Deskripsi      : " + getDeskripsi());
    }
}


