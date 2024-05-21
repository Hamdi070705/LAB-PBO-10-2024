import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Karyawan> daftarKaryawan = new ArrayList<>();
        // Audio audio = new Audio() {
            
        // };

        boolean exit = false;
        while (!exit) {
            System.out.println("Data karyawan:");
            System.out.println("a. Tambah data karyawan");
            System.out.println("b. Tampilkan detail karyawan");
            System.out.println("c. Keluar");
            System.out.print("Pilih opsi (a-c): ");
            String pilihan = scanner.nextLine();

            switch (pilihan) {
                case "a":
                    tambahDataKaryawan(scanner, daftarKaryawan);
                    break;
                case "b":
                    tampilkanDetailKaryawan(daftarKaryawan);
                    break;
                case "c":
                    exit = true;
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }

    private static void tambahDataKaryawan(Scanner scanner, List<Karyawan> daftarKaryawan) {
        Karyawan karyawan = new Karyawan();
        System.out.print("Masukkan nama: ");
        karyawan.setNama(scanner.nextLine());

        try {
            System.out.print("Masukkan umur: ");
            int umur = scanner.nextInt();
            karyawan.setUmur(umur);

            Pengalaman pengalaman = new Pengalaman();
            pengalaman.tambahPengalaman();
            if (pengalaman.getJenisPekerjaan().equalsIgnoreCase("Freelancer") || pengalaman.getJenisPekerjaan().equalsIgnoreCase("Magang") || pengalaman.getJenisPekerjaan().equalsIgnoreCase("Pekerja tetap") ) {
                System.out.print("Gaji sebelumnya: ");
                double gaji = scanner.nextDouble();
                karyawan.setGaji(gaji);
            }

            Pendidikan pendidikan = new Pendidikan();
            pendidikan.tambahPendidikan();

            Projek projek = new Projek();
            projek.tambahProjek();

            karyawan.statusPernikahan();
            scanner.nextLine();

            if (umur < 18 || pendidikan.getJenjangPendidikan().equalsIgnoreCase("SD") || pendidikan.getJenjangPendidikan().equalsIgnoreCase("SMP") || projek.getJumlahProjek() < 4) {
                System.out.println("Karyawan tidak memenuhi syarat.");
                return;
            }

            System.out.println("Pengalaman sedang diproses...");
            System.out.println("Pendidikan terakhir: " + pendidikan.getJenjangPendidikan());
            System.out.println("Jumlah projek IT: " + projek.getJumlahProjek());
            System.out.println("=============");
            System.out.println("Selamat, karyawan diterima!");
            System.out.println("=============");

            karyawan.setJabatan("Karyawan");

            daftarKaryawan.add(karyawan);
        } catch (NumberFormatException e) {
            System.out.println("Inputan harus berupa integer untuk umur.");
        }
    }

    private static void tampilkanDetailKaryawan(List<Karyawan> daftarKaryawan) {
        if (daftarKaryawan.isEmpty()) {
            System.out.println("Belum ada data karyawan.");
            return;
        }

        for (Karyawan karyawan : daftarKaryawan) {
            System.out.println("Detail karyawan:");
            System.out.println("Nama: " + karyawan.getNama());
            System.out.println("Umur: " + karyawan.getUmur());
            System.out.println("Jabatan: " + karyawan.getJabatan());
            System.out.println("Gaji: " + karyawan.getGaji());
            System.out.println("Status Pernikahan: " + karyawan.isMenikah());
            System.out.println("Jumlah anak: " + karyawan.getJumlahAnak());
            System.out.println();
        }
    }
}
