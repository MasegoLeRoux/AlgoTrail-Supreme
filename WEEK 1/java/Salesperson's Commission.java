import java.util.Scanner;

public class CarCommissionCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            // Get user input
            System.out.print("Enter the selling price of the used car (in ZAR): ");
            double sellingPrice = input.nextDouble();

            System.out.print("Enter the cost of the car (in ZAR): ");
            double costOfCar = input.nextDouble();

            // Validate input
            if (sellingPrice < 0 || costOfCar < 0) {
                System.out.println("Please enter non-negative values for selling price and cost of the car.");
                return;
            }

            final double commissionPercentage = 30;
            final double baseCommission = 20;

            double commission = 0;

            if (sellingPrice > costOfCar) {
                double excessAmount = sellingPrice - costOfCar;
                commission = baseCommission + (excessAmount * (commissionPercentage / 100));
            } else {
                System.out.println("No commission earned as the selling price is not greater than the cost of the car.");
            }

            // Output results
            System.out.println("Selling price of the car: ZAR " + String.format("%.2f", sellingPrice));
            System.out.println("Cost of the car: ZAR " + String.format("%.2f", costOfCar));
            System.out.println("Commission earned: ZAR " + String.format("%.2f", commission));
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            input.close();
        }
    }
}

