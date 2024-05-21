public class Bulldog extends Dog {

    public Bulldog(int position, int avarageLength) {
        super(position, avarageLength);
    }

    @Override
    public void describe() {
        System.out.println("Description of Bulldog: has a short body, sturdy body, has soft fur and avarage length is " + avarageLength + " cm");
    }

    @Override
    public void move() {
        System.out.println("Bulldog move from coordinate " + position + " to coordinate " + (position += 1));
    }

    
    
}
