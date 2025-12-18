//Author: Corria
package GroupProject;

import java.util.Scanner;

public class SetIncomeFeature {
    public void execute(BudgetData data, Scanner scanner) {
        System.out.print("Enter your monthly income: ");
        if (scanner.hasNextDouble()) {
            double income = scanner.nextDouble();
            data.setMonthlyIncome(income);
            System.out.println("Income updated successfully!");
        } else {
            System.out.println("Invalid input. Please enter a number.");
            scanner.next(); // Clear invalid input
        }
    }
}
