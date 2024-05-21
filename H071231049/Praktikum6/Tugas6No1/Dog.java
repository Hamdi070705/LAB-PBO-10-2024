abstract class Dog {
    int position;
    int avarageLength;
    
    public Dog(int position, int avarageLength) {
        this.position = position;
        this.avarageLength = avarageLength;
    }

    public abstract void move();
    public abstract void describe();
}
