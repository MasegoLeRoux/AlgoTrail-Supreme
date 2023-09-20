import java.util.Scanner;

public class CoinValueCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user for the number of quarters, dimes, and nickels
        System.out.print("Enter the number of quarters: ");
        int quarters = input.nextInt();

        System.out.print("Enter the number of dimes: ");
        int dimes = input.nextInt();

        System.out.print("Enter the number of nickels: ");
        int nickels = input.nextInt();

        // Calculate the total value of the coins in pennies
        int totalValueInPennies = (quarters * 25) + (dimes * 10) + (nickels * 5);

        System.out.println("Total value of the coins: " + totalValueInPennies + " pennies");

        input.close();
    }
}
