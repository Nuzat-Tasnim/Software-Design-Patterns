public class Pizza implements Food{
    private String preparedItems;

    public void PrepareFood(String ItemRequired) {
        preparedItems = "Thin crust pizza with ingredients - "+ItemRequired;
    }

    public String DeliverFood() {
        return preparedItems;
    }
}
