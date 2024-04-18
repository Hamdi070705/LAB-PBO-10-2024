package Praktikum3.Tugas3No1;

public class Preman {
    String nama;
    Senjata senjata = new Senjata();
    int nyawa = 100;
    double coordinate;

    public Preman() {
    }

    public Preman(String nama) {
        this.nama = nama;
    }

    public Preman(String nama, String tipeSenjata, int damageSenjata) {
        this.nama = nama;
        this.senjata.type = tipeSenjata;
        this.senjata.damage = damageSenjata; 
    }

    public Preman(String nama, String tipeSenjata, int damageSenjata, int nyawa,  double coordinate) {
        this.nama = nama;
        this.senjata.type = tipeSenjata;
        this.senjata.damage = damageSenjata;
        this.nyawa = nyawa;
        this.coordinate = coordinate;
    }


    public void cekStatus() {
        System.out.printf("===== Status %s  =====\n", this.getName());
        System.out.println("Nama             : " + this.getName());
        System.out.println("Tipe senjata     : " + this.getSenjata().getType());
        System.out.println("Damage senjata   : " + this.getSenjata().getDamage());
        System.out.println("Nyawa            : " + this.getNyawa());
        System.out.println("Coordinate       : " + this.getCoordinate());
    }

    public void bertapa(int nyawa) {
        this.nyawa = getNyawa() + nyawa;
        System.out.printf("%s telah bertapa dan memperkuat dirinya menjadi %d nyawa. Gacor Kang!\n", this.getName(), nyawa);
    }

    public void movement(double coordinate) {
        this.setCoordinate(coordinate);
        System.out.printf("%s bergerak ke koordinat %.1f \n", this.getName(), coordinate);
    }

    public void upSenjata(String type, int damage) {
        this.senjata.type = type;
        this.senjata.damage = damage;
        System.out.printf("%s berhasil meningkatkan %s menjadi %d damage \n", this.getName(), type, damage);
    }

    public void gelut(Preman enemy) {
        if (this.getCoordinate() == enemy.getCoordinate()) {
            enemy.nyawa -= this.senjata.getDamage();
            this.nyawa -= enemy.senjata.getDamage();

            if (enemy.getNyawa() <= 0) {
                System.out.printf("%s bergelut dengan %s. %s dikalahakan\n", this.getName() , enemy.getName(), enemy.getName());
            } else if (this.getNyawa() <= 0) {
                System.out.printf("%s bergelut dengan %s. %s dikalahkan\n", this.getName(), enemy.getName(), this.getName());
            }
             else {
                System.out.printf("%s gagal dikalahkan. %s sekarat dan lari terbirit-birit \n", enemy.getName(), enemy.getName());
            }
        } else {
            System.out.printf("%s dan %s berjauhan. Tidak bisa bergelut \n", this.getName() , enemy.getName());
        }

    }
    
    public String getName() {
        return nama;
    }

    public void setName(String name) {
        this.nama = name;
    }

    public Senjata getSenjata() {
        return senjata;
    }

    public void setSenjata(Senjata senjata) {
        this.senjata = senjata;
    }

    public int getNyawa() {
        return nyawa;
    }

    public void setNyawa(int health) {
        this.nyawa = health;
    }

    public double getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(double coordinate) {
        this.coordinate = coordinate;
    }
}
