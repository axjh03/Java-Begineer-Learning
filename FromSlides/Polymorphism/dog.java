public class dog extends animal {

    @Override // Same as animal bust but different and hence had to override
    public void makeNoise() {
        System.out.println("Bark");
    }
    // One extra method that animal class does not have
    public void playDead() {
        System.out.println("Roll over");
    }
}
