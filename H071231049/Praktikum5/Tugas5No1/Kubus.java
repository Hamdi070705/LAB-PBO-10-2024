public class Kubus extends BangunRuang {
    double sisi;
    
    
    public Kubus() {
    }

    public Kubus(double sisi) {
        this.sisi = sisi;
    }

    public double hitungLuas() {
        return 6 * sisi * sisi;
    }

    public double hitungVolume() {
        return sisi * sisi * sisi;
    }
}
