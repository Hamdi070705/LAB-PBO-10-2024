import java.util.Scanner;

public class Keluarga {
    boolean menikah;
    int jumlahAnak;

    public Keluarga() {}

    public void statusPernikahan() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Apakah karyawan sudah menikah? (ya/tidak): ");
        String status = scanner.nextLine();
        if (status.equalsIgnoreCase("ya")) {
            setMenikah(true);
            jumlahAnak(scanner);
        } else if (status.equalsIgnoreCase("tidak")) {
            setMenikah(false);
        } else {
            System.out.println("Input tidak valid. Harap masukkan ya atau tidak.");
        }
    }

    public void jumlahAnak(Scanner scanner) {
        if (menikah) {
            System.out.print("Berapa jumlah anak karyawan? ");
            jumlahAnak = scanner.nextInt();
            scanner.nextLine();
        }
    }

    public void infoKeluarga() {
        if (menikah) {
            System.out.println("Karyawan menikah dan memiliki " + jumlahAnak + " anak.");
        } else {
            System.out.println("Karyawan belum menikah.");
        }
    }

    public boolean isMenikah() {
        return menikah;
    }

    public void setMenikah(boolean menikah) {
        this.menikah = menikah;
    }

    public int getJumlahAnak() {
        return jumlahAnak;
    }

    public void setJumlahAnak(int jumlahAnak) {
        this.jumlahAnak = jumlahAnak;
    }

    
}
