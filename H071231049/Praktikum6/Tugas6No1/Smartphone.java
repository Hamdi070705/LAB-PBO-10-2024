public class Smartphone implements Method {
    int price;
    String brand;

    public Smartphone() {
    }

    public Smartphone(int price, String brand) {
        this.price = price;
        this.brand = brand;
    }
    
    @Override
    public void move() {
        System.out.println("Smartphone berpindah");
    }
}
