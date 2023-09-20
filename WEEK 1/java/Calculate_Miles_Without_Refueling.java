import java.util.Scanner;

public class FuelTankMilesCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user for the fuel tank capacity (in gallons)
        System.out.print("Enter the fuel tank capacity (in gallons): ");
        double fuelCapacity = input.nextDouble();

        // Prompt the user for the miles per gallon (MPG)
        System.out.print("Enter the miles per gallon (MPG): ");
        double mpg = input.nextDouble();

        // Calculate the number of miles the automobile can be driven without refueling
        double milesWithoutRefueling = fuelCapacity * mpg;

        System.out.println("The automobile can be driven for " + milesWithoutRefueling + " miles without refueling.");

        input.close();
    }
}
