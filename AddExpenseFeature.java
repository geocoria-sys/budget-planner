
//Author: Bryit
package GroupProject; 

import java.util.Scanner;

public class AddExpenseFeature {
    public void execute(BudgetData data, Scanner scanner) {
        System.out.print("Enter expense category (e.g., Food, Rent, Transport): ");
        scanner.nextLine(); 
        String category = scanner.nextLine();

        System.out.print("Enter expense description: ");
        String desc = scanner.nextLine();
        
        System.out.print("Enter expense amount: ");
        if (scanner.hasNextDouble()) {
            double amount = scanner.nextDouble();
            
          
            data.getExpenses().add(new BudgetData.Expense(category, desc, amount));
            
            System.out.println("Expense added successfully!");
        } else {
            System.out.println("Invalid amount. Expense not added.");
            scanner.next();
        }
    }
}