public abstract class PizzaDecorator implements Pizza{

    protected Pizza tempPizza;

    public PizzaDecorator(Pizza tempPizza) {
        this.tempPizza = tempPizza;
    }

    public abstract String getDescription();
    public abstract Double getCost();
}
