import ee.GroceryItemOrder;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<GroceryItemOrder> list = new ArrayList();

    public GroceryList() {
    }

    public void add(GroceryItemOrder item){
        if (list.size()<10)
            list.add(item);
        else
            System.out.println("Basket is full!!  "+ item.name +" is removed.");
    }

    public double getTotalCost(){
        double total=0;
        for (var item:list)
            total += item.getCost();
        return total;
    }
}
