public class Car implements Method {
    int totalForwardGear;
    String color;
    int maxSpeed;

    public Car() {
    }

    public Car(int totalForwardGear, String color, int maxSpeed) {
        this.totalForwardGear = totalForwardGear;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
    
    @Override
    public void move() {
        System.out.println("Mobil sedang berakselerasi");
    }
}
