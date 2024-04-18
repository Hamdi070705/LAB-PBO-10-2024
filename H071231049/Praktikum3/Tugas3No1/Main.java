package Praktikum3.Tugas3No1;

public class Main {
    public static void main(String[] args) {
        Senjata senjata1 = new Senjata();
        senjata1.setType("Pisau Dapur");
        senjata1.setDamage(100);

        Preman preman1 = new Preman("Ucup", senjata1.getType(), senjata1.getDamage(), 500, 1.0);

        Senjata senjata2 = new Senjata("Golok", 200);

        Preman preman2 = new Preman();
        preman2.setName("Otong");
        preman2.setSenjata(senjata2);
        preman2.setNyawa(500);
        preman2.setCoordinate(2.5);
        
        preman1.cekStatus();
        printBarriers();
        preman2.cekStatus();

        printBarriers();
        preman2.upSenjata("Golok Emas",600);

        printBarriers();
        preman2.setCoordinate(1.0);

        printBarriers();
        preman1.cekStatus();
        printBarriers();
        preman2.cekStatus();

        printBarriers();
        preman2.gelut(preman1);

        printBarriers();
        preman1.bertapa(1000);
        printBarriers();
        preman1.cekStatus();

    }

    public static void printBarriers() {
        System.out.println("================================");
    }
}
