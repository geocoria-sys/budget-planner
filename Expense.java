

package GroupProject;


public class Expense {
    
    private final String name;
    private final double amount;

    /**
     * Constructor for creating a new Expense object.
     * @param name The name or description of the expense.
     * @param amount The monetary amount of the expense.
     */
    public Expense(String name, double amount) {
        this.name = name;
        this.amount = amount;
    }



    public String getName() { 
        return name; 
    }
    
    public double getAmount() { 
        return amount; 
    }

  
    @Override
    public String toString() {
        return name + " ($" + String.format("%.2f", amount) + ")";
    }
}