//KAyla

package GroupProject;



import java.util.Scanner;

public class ManageExpensesFeature {
    public void execute(BudgetData data, Scanner scanner) {
        if (data.getExpenses().isEmpty()) {
            System.out.println("No expenses to manage.");
            return;
        }

        // Display numbered list
        System.out.println("\n--- Manage Expenses ---");
        for (int i = 0; i < data.getExpenses().size(); i++) {
            System.out.println((i + 1) + ". " + data.getExpenses().get(i));
        }

        System.out.print("\nEnter number to edit/remove (0 to cancel): ");
        int index = scanner.nextInt() - 1;

        if (index < 0 || index >= data.getExpenses().size()) {
            System.out.println("Operation cancelled.");
            return;
        }

        System.out.println("1. Remove Expense");
        System.out.println("2. Edit Expense");
        System.out.print("Choice: ");
        int action = scanner.nextInt();

        if (action == 1) {
            data.getExpenses().remove(index);
            System.out.println("Expense removed!");
        } else if (action == 2) {
            scanner.nextLine(); // clear buffer
            System.out.print("Enter new category: ");
            String cat = scanner.nextLine();
            System.out.print("Enter new description: ");
            String desc = scanner.nextLine();
            System.out.print("Enter new amount: ");
            double amt = scanner.nextDouble();
            
            data.getExpenses().set(index, new BudgetData.Expense(cat, desc, amt));
            System.out.println("Expense updated!");
        }
    }
}
