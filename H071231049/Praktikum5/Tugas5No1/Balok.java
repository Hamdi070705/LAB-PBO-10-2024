public class Balok extends BangunRuang {
    double panjang, lebar, tinggi;

    
    public Balok() {
    }


    public Balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.tinggi = tinggi;
        this.lebar = lebar;
    }

    public double hitungVolume() {
        return panjang * lebar * tinggi;
    }

    public double hitungLuas() {
        return 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));
    }
}
