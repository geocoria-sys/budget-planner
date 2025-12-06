/*
 * Project: Smart Budget Planner
 * Author: Genesis Coria
 * Date: 12/05/25
 * This class handles setting the user's monthly income.
 */

public class SetIncomeFeature {

    // Attribute: stores the monthly income
    private double monthlyIncome;

    // Constructor: default
    public SetIncomeFeature() {
        this.monthlyIncome = 0.0;
    }

    // Constructor: initializes income
    public SetIncomeFeature(double monthlyIncome) {
        this.monthlyIncome = monthlyIncome;
    }

    // Gets the current monthly income
    public double getMonthlyIncome() {
        return monthlyIncome;
    }

    // Sets the current monthly income
    public void setMonthlyIncome(double monthlyIncome) {
        this.monthlyIncome = monthlyIncome;
    }
}

