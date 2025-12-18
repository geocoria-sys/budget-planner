

---

## Project Overview: Smart Budget Planner

A Java-based console application designed to help users track monthly income and expenses, manage financial data through a modular interface, and persist information using file storage.

### Initial Features

* **Set Monthly Income:** Allows users to define their total budget for the month.
* **Add Expense Entry:** Enables the creation of individual expense items with descriptions and amounts.
* **View List of Expenses:** Displays all currently recorded expenses in a formatted console table.
* **Show Financial Summary:** Calculates total spending and displays the remaining balance against the set income.
* **Exit Program:** Safely shuts down the application.

### Additional Features (Enhanced Version)

* **Persistent Data Storage (`budget.txt`):** Automatically saves all data to a text file upon exiting and reloads it upon startup, ensuring data is not lost between sessions.
* **Categorization:** Expenses now include a "Category" field (e.g., Food, Rent, Transport) for better organization and reporting.
* **Full CRUD Management (Edit/Remove):** Users can now select specific existing expenses by their index to either update the details or delete them entirely.
* **Budget Alerts:** Logic to warn users if they have exceeded their income or are nearing their spending limit.

---

## Team Assignments & Responsibilities

You can add this table to your documentation to show who is responsible for which part of the codebase:

| Member | Component / Feature | Description |
| --- | --- | --- |
| **Corria** | `SetIncomeFeature.java` | Logic for setting and updating the monthly income. |
| **Kayla** | `SmartBudgetPlannerApp.java`, `BudgetData.java`, `ManageExpensesFeature.java`, `budget.txt` | Core architecture, data model, Edit/Remove logic, and file persistence. |
| **Bryit** | `AddExpenseFeature.java`, `ViewExpensesFeature.java` | Logic for creating, categorizing, and displaying expense lists. |
| **Harrison** | `ExitProgramFeature` / Exit Logic | Handling safe application shutdown and final save triggers. |

---

### Final Project Structure

When you upload this to GitHub, your file structure should look like this:

* `src/GroupProject/`
* `SmartBudgetPlannerApp.java` (The entry point)
* `BudgetData.java` (The data model)
* `SetIncomeFeature.java`
* `AddExpenseFeature.java`
* `ViewExpensesFeature.java`
* `ShowSummaryFeature.java`
* `ManageExpensesFeature.java`


* `budget.txt` (Generated in the project root)
* `README.md` (Using the text above)


