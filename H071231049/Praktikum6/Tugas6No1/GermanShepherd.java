public class GermanShepherd extends Dog {

    public GermanShepherd(int position, int avarageLength) {
        super(position, avarageLength);
    }

    @Override
    public void describe() {
        System.out.println("Description of German Shepherd: looks like a wolf, Has thick fur, has a long ears and avarage length is " + avarageLength + " cm");
    }

    @Override
    public void move() {
        System.out.println("German Shepherd move from coordinate " + position + " to coordinate " + (position += 3));
    }

    
    
}
