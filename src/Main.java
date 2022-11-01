import ee.GroceryItemOrder;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

         {
            GroceryList list =new GroceryList();

            list.add(new GroceryItemOrder("avocado", 60));
            list.add(new GroceryItemOrder("banana", 50));
            list.add(new GroceryItemOrder("apple", 40));
            list.add(new GroceryItemOrder("kiwi", 30));
            for (GroceryItemOrder groceryItemOrder : Arrays.asList(new GroceryItemOrder("avocado", 60), new GroceryItemOrder("banana", 50), new GroceryItemOrder("apple", 40), new GroceryItemOrder("kiwi", 30))) {
                list.add(groceryItemOrder);
            }
            list.add(new GroceryItemOrder("avocado", 60));
            list.add(new GroceryItemOrder("banana", 50));
            list.add(new GroceryItemOrder("apple", 40));
            list.add(new GroceryItemOrder("kiwi", 30));

            System.out.println(list.getTotalCost());
        }
    }
}