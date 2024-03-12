public class Rocket implements MobileBank{
    @Override
    public void payment(Double amount) {
        System.out.println("Paid by Rocket");
    }
}
