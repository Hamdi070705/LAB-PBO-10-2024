public class Tabung extends BangunRuang {
    double jariJari, tinggi;

    public Tabung() {
    }

    public Tabung(double jariJari, double tinggi) {
        this.jariJari = jariJari;
        this.tinggi = tinggi;
    }

    public double hitungLuas() {
        return 2 * Math.PI * jariJari * (jariJari + tinggi);
    }

    public double hitungVolume() {
        return Math.PI * jariJari * jariJari * tinggi;
    }
}
