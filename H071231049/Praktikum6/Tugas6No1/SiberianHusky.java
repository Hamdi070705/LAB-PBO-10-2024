public class SiberianHusky extends Dog {

    public SiberianHusky(int position, int avarageLength) {
        super(position, avarageLength);
    }
    
    @Override
    public void describe() {
        System.out.println("Description of Siberian Husky: Has thick fur, looks like a wolf, has a unique eye color and avarage length is " + avarageLength  + " cm");
    }

    @Override
    public void move() {
        System.out.println("Siberian Hsuky move from coordinate " + position + " to coordinate " + (position += 2));
    }

    
    
}
