public class Client {
    public static void main(String[] args) {
        Pizza pizza = new MozerallaDecorator(new TometoSauceDecorator(new MozerallaDecorator(new ItalianPizza())));
        System.out.println(pizza.getDescription());
        System.out.println(pizza.getCost());

        pizza = new MozerallaDecorator(new TometoSauceDecorator(new MozerallaDecorator(new AmericanPizza())));
        System.out.println(pizza.getDescription());
        System.out.println(pizza.getCost());
    }
}
