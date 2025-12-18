//Author: KAyla

package GroupProject;

import java.util.Scanner;


public class SmartBudgetPlannerApp {
    private final BudgetData budgetData;
    private final Scanner scanner;
    
    // Feature Instances
    private final SetIncomeFeature setIncomeFeature;
    private final AddExpenseFeature addExpenseFeature;
    private final ViewExpensesFeature viewExpensesFeature;
    private final ShowSummaryFeature showSummaryFeature;
    private final ManageExpensesFeature manageExpensesFeature;

    public SmartBudgetPlannerApp() {
        this.budgetData = new BudgetData();
        this.scanner = new Scanner(System.in);
        
        // Initialize all feature modules
        this.setIncomeFeature = new SetIncomeFeature();
        this.addExpenseFeature = new AddExpenseFeature();
        this.viewExpensesFeature = new ViewExpensesFeature();
        this.showSummaryFeature = new ShowSummaryFeature();
        this.manageExpensesFeature = new ManageExpensesFeature();
    }

    public void start() {
        // Automatically load existing data from the text file on startup
        budgetData.loadFromFile("budget.txt");
        
        boolean running = true;
        System.out.println("========================================");
        System.out.println("   Welcome to Smart Budget Planner!     ");
        System.out.println("========================================");

        while (running) {
            printMenu();
            
            // Basic check to ensure scanner is still active
            if (!scanner.hasNext()) break;
            
            String choice = scanner.next();

            switch (choice) {
                case "1":
                    setIncomeFeature.execute(budgetData, scanner);
                    break;
                case "2":
                    addExpenseFeature.execute(budgetData, scanner);
                    break;
                case "3":
                    viewExpensesFeature.execute(budgetData);
                    break;
                case "4":
                    showSummaryFeature.execute(budgetData);
                    break;
                case "5":
                    // The new feature for Edit/Remove
                    manageExpensesFeature.execute(budgetData, scanner);
                    break;
                case "6":
                    // Save data before closing
                    budgetData.saveToFile("budget.txt");
                    System.out.println("\nData saved successfully. Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid selection. Please enter a number between 1 and 6.");
            }
        }
        scanner.close();
    }

    private void printMenu() {
        System.out.println("\n--- MAIN MENU ---");
        System.out.println("1. Set Monthly Income");
        System.out.println("2. Add New Expense");
        System.out.println("3. View List of Expenses");
        System.out.println("4. Show Financial Summary");
        System.out.println("5. Edit or Remove Expenses"); // New Improvement
        System.out.println("6. Save and Exit");
        System.out.print("Select an option: ");
    }

    public static void main(String[] args) {
      
        new SmartBudgetPlannerApp().start();
    }
}