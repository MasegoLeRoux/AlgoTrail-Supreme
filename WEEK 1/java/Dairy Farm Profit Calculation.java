import java.util.Scanner;

public class DairyFarmProfitCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Constants in ZAR
        final double CARTON_CAPACITY = 3.78; // Liters
        final double COST_PER_LITER = 3.78;  // ZAR per liter
        final double PROFIT_PER_CARTON = 2.70; // ZAR per carton

        // Prompt the user for the total amount of milk produced in the morning (in liters)
        System.out.print("Enter the total amount of milk produced in the morning (in liters): ");
        double totalMilkProduced = input.nextDouble();

        // Calculate the number of milk cartons needed to hold the milk
        int numberOfCartons = (int) Math.ceil(totalMilkProduced / CARTON_CAPACITY);

        // Calculate the cost of producing the milk
        double costOfProduction = totalMilkProduced * COST_PER_LITER;

        // Calculate the profit for producing the milk
        double profit = numberOfCartons * PROFIT_PER_CARTON;

        // Output the results in ZAR
        System.out.println("Number of milk cartons needed: " + numberOfCartons);
        System.out.println("Cost of producing the milk: R" + costOfProduction);
        System.out.println("Profit for producing the milk: R" + profit);

        input.close();
    }
}

