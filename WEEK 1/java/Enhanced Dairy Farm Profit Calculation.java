import java.util.Scanner;

public class DairyFarmProfitCalculatorEnhanced {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Constants
        final double CARTON_CAPACITY = 3.78; // Liters

        // Prompt the user for input
        System.out.print("Enter the total amount of milk produced in the morning (in liters): ");
        double totalMilkProduced = input.nextDouble();

        System.out.print("Enter the cost of producing one liter of milk (in ZAR): ");
        double costPerLiter = input.nextDouble();

        System.out.print("Enter the profit on each carton of milk (in ZAR): ");
        double profitPerCarton = input.nextDouble();

        // Calculate the number of milk cartons needed to hold the milk
        int numberOfCartons = (int) Math.ceil(totalMilkProduced / CARTON_CAPACITY);

        // Calculate the cost of producing the milk
        double costOfProduction = totalMilkProduced * costPerLiter;

        // Calculate the profit for producing the milk
        double profit = numberOfCartons * profitPerCarton;

        System.out.println("Number of milk cartons needed: " + numberOfCartons);
        System.out.println("Cost of producing the milk: R" + costOfProduction);
        System.out.println("Profit for producing the milk: R" + profit);

        input.close();
    }
}

