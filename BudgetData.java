//Author: Kayla
//Holds central income and expense data and handles persistence.


package GroupProject;

import java.util.ArrayList;
import java.util.List;
import java.io.*;
import java.util.Scanner;


public class BudgetData {
    private double monthlyIncome;
    private List<Expense> expenses;

    public BudgetData() {
        this.monthlyIncome = 0.0;
        this.expenses = new ArrayList<>();
    }

    // --- Getters and Setters ---
    public double getMonthlyIncome() { return monthlyIncome; }
    public void setMonthlyIncome(double monthlyIncome) { this.monthlyIncome = monthlyIncome; }
    public List<Expense> getExpenses() { return expenses; }

  
    
    //Saves the current income and expense list to a text file.
     
    public void saveToFile(String filename) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
            writer.println(monthlyIncome);
            for (Expense e : expenses) {
                // Using pipe delimiter to avoid conflicts with descriptions containing commas
                writer.println(e.category + "|" + e.description + "|" + e.amount);
            }
            System.out.println("[System] Data saved successfully to " + filename);
        } catch (IOException e) {
            System.out.println("[Error] Could not save data: " + e.getMessage());
        }
    }

    
    public void loadFromFile(String filename) {
        File file = new File(filename);
        if (!file.exists()) return;

        try (Scanner fileScanner = new Scanner(file)) {
            if (fileScanner.hasNextLine()) {
                this.monthlyIncome = Double.parseDouble(fileScanner.nextLine());
            }
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] parts = line.split("\\|");
                if (parts.length == 3) {
                    expenses.add(new Expense(parts[0], parts[1], Double.parseDouble(parts[2])));
                }
            }
            System.out.println("[System] Data loaded successfully from " + filename);
        } catch (Exception e) {
            System.out.println("[Error] Could not load data: " + e.getMessage());
        }
    }

  
    public static class Expense {
        public String category;
        public String description;
        public double amount;

        public Expense(String category, String description, double amount) {
            this.category = category;
            this.description = description;
            this.amount = amount;
        }

        @Override
        public String toString() {
            return String.format("[%s] %-15s | $%.2f", category, description, amount);
        }
    }
}