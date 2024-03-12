public class Client {
    public static void main(String[] args) {
        ShoppingCart sc = new ShoppingCart();
        sc.addItem(new Item("book",150.0));
        sc.addItem(new Item("pen",15.0));
        sc.addItem(new Item("eraser",5.0));
        
        Card card = new CreditCard();
        card.payment(sc.calc());
        MobileBank mb = new Bikash();
        mb.payment(sc.calc());
    }
}
