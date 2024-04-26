import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        printBarriers();

        System.out.println("===== BANGUN RUANG ===== ");
        System.out.println("1. KUBUS");
        System.out.println("2. BALOK");
        System.out.println("3. BOLA");
        System.out.println("4. TABUNG");
        System.out.println();
        System.out.println("===== BANGUN DATAR ======");
        System.out.println("5. PERSEGI");
        System.out.println("6. PERSEGI PANJANG");
        System.out.println("7. LINGKARAN");
        System.out.println("8. TRAPESIUM");

        printBarriers();

        System.out.print("Pilihan: ");
        int pilihan = sc.nextInt();

        printBarriers();

        switch (pilihan) {
            case 1:
                System.out.print("Masukkan sisi kubus: ");
                double sisiKubus = sc.nextDouble();
                Kubus kubus = new Kubus(sisiKubus);
                System.out.println("Luas kubus  : " + kubus.hitungLuas());
                System.out.println("Volume kubus: " + kubus.hitungVolume());
                break;
            case 2:
                System.out.print("Masukkan panjang balok: ");
                double panjangBalok = sc.nextDouble();
                System.out.print("Masukkan lebar balok: ");
                double lebarBalok = sc.nextDouble();
                System.out.print("Masukkan tinggi balok: ");
                double tinggiBalok = sc.nextDouble();
                Balok balok = new Balok(panjangBalok, lebarBalok, tinggiBalok);
                System.out.println("Luas balok  : " + balok.hitungLuas());
                System.out.println("Volume balok: " + balok.hitungVolume());
                break;
            case 3:
                System.out.print("Masukkan jari-jari bola: ");
                double jariJariBola = sc.nextDouble();
                Bola bola = new Bola(jariJariBola);
                System.out.println("Luas bola  : " + bola.hitungLuas());
                System.out.println("Volume bola: " + bola.hitungVolume());
                break;
            case 4:
                System.out.print("Masukkan jari-jari tabung: ");
                double jariJariTabung = sc.nextDouble();
                System.out.print("Masukkan tinggi tabung: ");
                double tinggiTabung = sc.nextDouble();
                Tabung tabung = new Tabung(jariJariTabung, tinggiTabung);
                System.out.println("Luas tabung  : " + tabung.hitungLuas());
                System.out.println("Volume tabung: " +tabung.hitungVolume());
            case 5:
                System.out.print("Masukkan sisi persegi: ");
                double sisiPersegi = sc.nextDouble();
                Persegi persegi = new Persegi(sisiPersegi);
                System.out.println("Luas persegi    : " + persegi.hitungLuas());
                System.out.println("Keliling persegi: " + persegi.hitungKeliling());
                break;
            case 6:
                System.out.print("Masukkan panjang persegi panjang: ");
                double panjangPP = sc.nextDouble();
                System.out.print("Masukkan lebar persegi panjang: ");
                double lebarPP = sc.nextDouble();
                PersegiPanjang pp = new PersegiPanjang(panjangPP, lebarPP);
                System.out.println("Luas persegi panjang    : " + pp.hitungLuas());
                System.out.println("Keliling persegi panjang: " + pp.hitungKeliling());
                break;
            case 7:
                System.out.print("Masukkan jari-jari lingkaran: ");
                double jariJariLingkaran = sc.nextDouble();
                Lingkaran lingkaran = new Lingkaran(jariJariLingkaran);
                System.out.println("Luas lingkaran    : " + lingkaran.hitungLuas());
                System.out.println("Keliling lingkaran: " + lingkaran.hitungKeliling());
                break;
            case 8:
                System.out.print("Masukkan sisi 1 trapesium: ");
                double sisi1Trapesium = sc.nextDouble();
                System.out.print("Masukkan sisi 2 trapesium: ");
                double sisi2Trapesium = sc.nextDouble();
                System.out.print("Masukkan sisi 3 trapesium: ");
                double sisi3Trapesium = sc.nextDouble();
                System.out.print("Masukkan sisi 4 trapesium: ");
                double sisi4Trapesium = sc.nextDouble();
                System.out.print("Masukkan tinggi trapesium: ");
                double tinggiTrapesium = sc.nextDouble();
                Trapesium Trapesium = new Trapesium(sisi1Trapesium, sisi2Trapesium, sisi3Trapesium, sisi4Trapesium, tinggiTrapesium);
                System.out.println("Luas trapesium    : " + Trapesium.hitungLuas());
                System.out.println("Keliling trapesium: " + Trapesium.hitungKeliling());
                break;
            default:
                System.out.println("Pilihan yang anda masukkan tidak valid!");
                break;
        }
        printBarriers();
        sc.close();
    }

    public static void printBarriers() {
        System.out.println("---------------------------------------");
    }
}

