public class Pitbull extends Dog{


    public Pitbull(int position, int avarageLength) {
        super(position, avarageLength);
    }

    
    @Override
    public void describe() {
        System.out.println("Description of Pitbull: Pitbull is strong dog, muscular dog, has soft fur, vicius dog and avarage length is " + avarageLength  + " cm");
    }
    
    @Override
    public void move() {
        System.out.println("Pitbull move from coordinate " + position + " to coordinate " + (position += 3));
    }
    

}
