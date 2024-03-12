public class ItalianPizza implements Pizza{

    @Override
    public String getDescription() {
        return "Thin dough";
    }

    @Override
    public Double getCost() {
        return 5.0;
    }
}
