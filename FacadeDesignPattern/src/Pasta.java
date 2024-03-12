public class Pasta implements Food{
    private String preparedItems;

    public void PrepareFood(String ItemRequired) {
        preparedItems = "Tomato pasta with ingredients "+ItemRequired;
    }

    public String DeliverFood() {
        return preparedItems;
    }
}
