import java.util.Scanner;

public class DecimalSumToNearestInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter five decimal numbers:");
        
        double sum = 0.0;
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            double number = input.nextDouble();
            sum += number;
        }
        
        input.close();
        
        // Round the sum to the nearest integer
        int roundedSum = (int) Math.round(sum);
        
        System.out.println("Sum of the numbers: " + sum);
        System.out.println("Sum rounded to the nearest integer: " + roundedSum);
    }
}