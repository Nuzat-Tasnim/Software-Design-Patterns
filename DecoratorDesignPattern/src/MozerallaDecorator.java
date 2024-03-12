public class MozerallaDecorator extends PizzaDecorator{

    public MozerallaDecorator(Pizza tempPizza) {
        super(tempPizza);
    }

    @Override
    public String getDescription() {
        return tempPizza.getDescription()+", Mozeralla";
    }

    @Override
    public Double getCost() {
        return tempPizza.getCost()+7.0;
    }

}
