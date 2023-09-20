import java.util.Scanner;

public class ItemPriceCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            // Get user input
            System.out.print("Enter the original price of the item (in ZAR): ");
            double originalPrice = input.nextDouble();

            System.out.print("Enter the percentage of the mark-up: ");
            double markupPercentage = input.nextDouble();

            System.out.print("Enter the sales tax rate (in percentage): ");
            double salesTaxRate = input.nextDouble();

            // Validate input
            if (originalPrice < 0 || markupPercentage < 0 || salesTaxRate < 0) {
                System.out.println("Please enter non-negative values for price, markup percentage, and sales tax rate.");
                return;
            }

            // Calculate selling price, sales tax, and final price
            double sellingPrice = originalPrice * (1 + markupPercentage / 100);
            double salesTax = (sellingPrice * salesTaxRate) / 100;
            double finalPrice = sellingPrice + salesTax;

            // Output results
            System.out.println("Original price of the item: ZAR " + String.format("%.2f", originalPrice));
            System.out.println("Percentage of the mark-up: " + markupPercentage + "%");
            System.out.println("Store's selling price of the item: ZAR " + String.format("%.2f", sellingPrice));
            System.out.println("Sales tax rate: " + salesTaxRate + "%");
            System.out.println("Sales tax: ZAR " + String.format("%.2f", salesTax));
            System.out.println("Final price of the item: ZAR " + String.format("%.2f", finalPrice));
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            input.close();
        }
    }
}


