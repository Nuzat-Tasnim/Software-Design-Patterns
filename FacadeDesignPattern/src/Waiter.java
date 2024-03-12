public class Waiter {
    static Ingredients ing = new Ingredients();
    static Food food;
    public static String DeliverFood(FoodType ft){
        switch (ft){
            case PIZZA:
                food = new Pizza();
                String PizzaItems = ing.PizzaIngredients();
                food.PrepareFood(PizzaItems);
                return food.DeliverFood();
            case PASTA:
                food = new Pasta();
                String PastaItems = ing.PastaIngredients();
                food.PrepareFood(PastaItems);
                return food.DeliverFood();

            default:
                return null;
        }

    }
}
