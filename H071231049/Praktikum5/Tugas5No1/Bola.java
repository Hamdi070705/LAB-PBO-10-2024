public class Bola extends BangunRuang {
    double jariJari;

    public Bola() {
    }

    public Bola(double jariJari) {
        this.jariJari = jariJari;
    }

    public double hitungLuas() {
        return 4 * Math.PI * jariJari * jariJari;
    }

    public double hitungVolume() {
        return (4.0 / 3.0) * Math.PI * jariJari * jariJari * jariJari;
    }
}
