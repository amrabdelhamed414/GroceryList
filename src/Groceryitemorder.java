public class Groceryitemorder{

    public String name;
    private int quantity;
    private double pricePerUnit;

    public Groceryitemorder(String name, int quantity, double pricePerUnit) {
        this.name = name;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
    }

    public double getCost(){
        return quantity*pricePerUnit;
    }}

