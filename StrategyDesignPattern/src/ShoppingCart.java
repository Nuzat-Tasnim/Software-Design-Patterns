import java.util.ArrayList;

public class ShoppingCart {
    ArrayList<Item> itemList = new ArrayList<Item>();

    public void addItem(Item item){
        itemList.add(item);
    }
    public Double calc(){
        Double sum=0.0;
        for(Item item : itemList){
            sum+=item.cost;
        }
        return sum;
    }
}
