import java.util.Scanner;

public class SummerJobIncomeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            // Get user input
            System.out.print("Enter your pay rate per hour (in ZAR): ");
            double payRatePerHour = input.nextDouble();

            System.out.print("Enter the number of hours worked each week: ");
            double hoursWorkedPerWeek = input.nextDouble();

            if (payRatePerHour < 0 || hoursWorkedPerWeek < 0) {
                System.out.println("Please enter non-negative values for pay rate and hours worked.");
                return;
            }

            int weeksWorked = 8; // Assuming a typical summer job lasts for 8 weeks
            double income = payRatePerHour * hoursWorkedPerWeek * weeksWorked;

            double taxRate = 0.15; // 15% tax rate
            double taxAmount = income * taxRate;

            double clothesAndSuppliesCost = 500; // Estimated cost of clothes and school supplies
            double savingsBondPurchase = 1000; // Amount spent on savings bonds

            double totalExpenses = clothesAndSuppliesCost + savingsBondPurchase;
            double remainingIncome = income - taxAmount - totalExpenses;

            // Output results
            System.out.println("Income from summer job: ZAR " + String.format("%.2f", income));
            System.out.println("Tax amount: ZAR " + String.format("%.2f", taxAmount));
            System.out.println("Expenses on clothes and school supplies: ZAR " + String.format("%.2f", clothesAndSuppliesCost));
            System.out.println("Savings bond purchase: ZAR " + String.format("%.2f", savingsBondPurchase));
            System.out.println("Remaining income: ZAR " + String.format("%.2f", remainingIncome));
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            input.close();
        }
    }
}
