package Praktikum2;

public class Tugas2No4 {
    public static void main(String[] args) {
        Alamat alamat = new Alamat();
        alamat.jalan = "Tamalanrea Indah";
        alamat.kota = "Makassar";

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.alamat = alamat;
        mahasiswa.nama = "Hamdi";
        mahasiswa.nim = "H071231049";

        System.out.println("Nama: " + mahasiswa.getNama());
        System.out.println("Nim: " + mahasiswa.getNim());
        System.out.println("Alamat: " + mahasiswa.getAlamat());
    }
}
class Alamat {
    String jalan;
    String kota;
    
}

class Mahasiswa {
    String nama;
    String nim;
    Alamat alamat;
    
    String getNama() {
        return nama;
    }
    
    String getAlamat() {
        return alamat.jalan + ", " + alamat.kota;
    }
    String getNim() {
        return nim;
    }
}