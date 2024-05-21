public class Main {
    public static void main(String[] args) {
        Pitbull pitbull = new Pitbull(0, 45);
        SiberianHusky siberianHusky = new SiberianHusky(0, 50);
        Bulldog bulldog = new Bulldog(0, 30);
        GermanShepherd germanShepherd = new GermanShepherd(0, 60);

        barriers();
        pitbull.move();
        pitbull.describe();

        barriers();
        siberianHusky.move();
        siberianHusky.describe();

        barriers();
        bulldog.move();
        bulldog.describe();

        barriers();
        germanShepherd.move();
        germanShepherd.describe();

        Smartphone smartphone = new Smartphone(1000000, "POCO");
        Car car = new Car(3, "Blue", 500);

        barriers();
        smartphone.move();
        
        barriers();
        car.move();
        barriers();

    }

    public static void barriers() {
        System.out.println("====================================================================================================");
    }
}   
