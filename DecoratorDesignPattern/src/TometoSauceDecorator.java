public class TometoSauceDecorator extends PizzaDecorator{

    public TometoSauceDecorator(Pizza tempPizza) {
        super(tempPizza);
    }

    @Override
    public String getDescription() {
        return tempPizza.getDescription()+", Tomato Sauce";
    }

    @Override
    public Double getCost() {
        return tempPizza.getCost()+6.0;
    }
}
