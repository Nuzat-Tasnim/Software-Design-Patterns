public class AmericanPizza implements Pizza{

    @Override
    public String getDescription() {
        return "Heavy Dough";
    }

    @Override
    public Double getCost() {
        return 10.0;
    }
}
