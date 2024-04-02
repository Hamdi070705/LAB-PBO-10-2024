package Praktikum2;

class Cuboid {
    double height;
    double widht;
    double length;

    double getVolume() {
        double volume = length * widht * height;
        return volume;
    }
}
public class Tugas2No3 {
    public static void main(String[] args) {
        Cuboid cuboid = new Cuboid();
        cuboid.height = 50;
        cuboid.widht = 30;
        cuboid.length = 3;
        System.out.printf("Volume = %.2f\n", cuboid.getVolume());
    }
}
