package Praktikum2;

public class Tugas2No2 {
    public static void main(String[] args) {
        Produk produk1 = new Produk();
        produk1.setProduk("001", "Keyboard" , 10, 15000);
        produk1.infoProduk();
        produk1.isAvailable();
        
        Produk produk2 = new Produk();
        produk2.setProduk("002", "Mouse" , -1, 15000);
        produk2.infoProduk();
        produk2.isAvailable();
    }
    
}

class Produk {
    String id;
    String nama;
    int stok;
    int harga;

    public void setProduk(String id, String nama, int stok, int harga) {
        this.id = id;
        this.nama = nama;
        this.stok = stok <= 0 ? 0 : stok;
        this.harga = harga;
    }

    public void isAvailable() {
    if (stok > 0) {
        System.out.println(nama + " Tersedia sebanyak " + stok + " stok");
    } else {
        System.out.println(nama + " Tidak tersedia");
    }
    }
    public void infoProduk() {
        System.out.println("ID produk: " + id);
        System.out.println("Nama produk: " + nama);
        System.out.println("Stok produk: " + stok);
        System.out.println("Harga produk: " + harga);
    }
}