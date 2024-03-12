public class DebitCard implements Card{
    @Override
    public void payment(Double amount) {
        System.out.println("Paid by Debit card");
    }
}
