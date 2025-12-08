package GroupProject;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Project: Smart Budget Planner
 * Author:  Kayla Sturgeon

 * This class is the main entry point and console interface for the application.
 */
public class SmartBudgetPlannerApp {

    public static void main(String[] args) {
        
        // Shared resources
        Scanner scanner = new Scanner(System.in);
        BudgetData data = new BudgetData();
        boolean running = true;

        // Initialize all feature classes
        SetIncomeFeature setIncome = new SetIncomeFeature();
        AddExpenseFeature addExpense = new AddExpenseFeature();
        ViewExpensesFeature viewExpenses = new ViewExpensesFeature();
        ShowSummaryFeature showSummary = new ShowSummaryFeature();
        ExitProgramFeature exitProgram = new ExitProgramFeature();

        System.out.println("*********************************************");
        System.out.println("* SMART BUDGET PLANNER (FEATURE-AS-CLASS) *");
        System.out.println("*********************************************");

        while (running) {
            displayMenu();
            try {
                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                switch (choice) {
                    case 1:
                        setIncome.execute(scanner, data);
                        break;
                    case 2:
                        addExpense.execute(scanner, data);
                        break;
                    case 3:
                        viewExpenses.execute(data);
                        break;
                    case 4:
                        showSummary.execute(data);
                        break;
                    case 5:
                        running = !exitProgram.execute(); // Stop the loop if true is returned
                        break;
                    default:
                        System.out.println("\n🚫 Invalid option. Please try again.");
                }
            } catch (InputMismatchException e) {
                System.out.println("\n🚫 Invalid input. Please enter a number (1-5).");
                scanner.nextLine(); // Clear the invalid input
            }
        }
        scanner.close();
    }

    private static void displayMenu() {
        System.out.println("\n================ MENU ================");
        System.out.println("1. Set Monthly Income");
        System.out.println("2. Add New Expense");
        System.out.println("3. View Expenses List");
        System.out.println("4. Show Summary (Total Expenses & Balance)");
        System.out.println("5. Exit Program");
        System.out.print("Select an option: ");
    }
}
