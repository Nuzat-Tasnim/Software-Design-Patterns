public class CreditCard implements Card{
    @Override
    public void payment(Double amount) {
        System.out.println("Paid by Credit card");
    }
}
