//Author: Bryit
//displays all recorded expenses

package GroupProject;

 class ViewExpensesFeature {
    
 
    public void execute(BudgetData data) {
        System.out.println("\n--- LIST OF EXPENSES ---");
        
        if (data.getExpenses().isEmpty()) {
            System.out.println("No expenses recorded yet.");
        } else {
            System.out.printf("%-15s | %-20s | %s%n", "Category", "Description", "Amount");
            System.out.println("---------------------------------------------------------");
            
            for (BudgetData.Expense e : data.getExpenses()) {
           
                System.out.println(e.toString());
            }
        }
    }
}