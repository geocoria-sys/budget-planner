//Author: Corria

package GroupProject;

public class ShowSummaryFeature {
    public void execute(BudgetData data) {
        double totalExpenses = 0;
        
        // Calculate total using a loop
        for (BudgetData.Expense e : data.getExpenses()) {
            totalExpenses += e.amount;
        }

        double balance = data.getMonthlyIncome() - totalExpenses;

        System.out.println("\n===============================");
        System.out.println("       FINANCIAL SUMMARY       ");
        System.out.println("===============================");
        System.out.printf("Total Monthly Income:  $%.2f%n", data.getMonthlyIncome());
        System.out.printf("Total Monthly Spent:   $%.2f%n", totalExpenses);
        System.out.println("-------------------------------");
        System.out.printf("Remaining Balance:     $%.2f%n", balance);
        System.out.println("===============================");
        
        // Budget Alert
        if (balance < 0) {
            System.out.println("!!! WARNING: You are over budget !!!");
        } else if (balance < (data.getMonthlyIncome() * 0.1)) {
            System.out.println("Notice: You have less than 10% of your income left.");
        }
    }
}
