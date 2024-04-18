package Tugas4No2;

public class Main {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop();
        laptop1.setMerk("Rog");
        laptop1.setModel("ROG Strix");
        laptop1.setHarga(271);
        laptop1.setTahunProduksi("2021");
        laptop1.setDeskripsi("Laptop Geming");

        laptop1.displayInfo();
        
        System.out.println();

        Laptop laptop2 = new Laptop("HP", "HP Spectre x360", 271, "2020", "Laptop Geming");
        System.out.println(laptop2.getMerk());
        System.out.println(laptop2.getModel());
        System.out.println(laptop2.getHarga());
        System.out.println(laptop2.getTahunProduksi());
        System.out.println(laptop2.getDeskripsi());
        System.out.println();

        SelfUtils.displaySelfData();
    }
}
