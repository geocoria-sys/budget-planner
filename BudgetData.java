package GroupProject;

import java.util.ArrayList;
import java.util.List;

/*
 * Project: Smart Budget Planner
 * Author:  Kayla Sturgeon
 
 * This class serves as the central data store for the application, holding income and expenses.
 */
public class BudgetData {
    
    // Core Attributes
    private double monthlyIncome;
    private List<Expense> expenses;

  
    public BudgetData() {
        this.monthlyIncome = 0.0;
        this.expenses = new ArrayList<>();
    }

    
    // Retrieves the current monthly income
    public double getMonthlyIncome() {
        return monthlyIncome;
    }

    // Sets the monthly income
    public void setMonthlyIncome(double monthlyIncome) {
        this.monthlyIncome = monthlyIncome;
    }

    // Retrieves the list of expenses (for adding/viewing)
    public List<Expense> getExpenses() {
        return expenses;
    }
}
