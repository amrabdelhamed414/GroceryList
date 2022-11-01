package ee;

public class GroceryItemOrder {
    public String name;
    private int quantity;
    private double pricePerUnit;

    public Groceryitemorder(String name, int quantity, double pricePerUnit) {
        this.name = name;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
    }

    public GroceryItemOrder(String kiwi, int i1) {
    }

    public double getCost(){
        return quantity*pricePerUnit;
    }
}
