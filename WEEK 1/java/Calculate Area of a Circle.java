import java.util.Scanner;

public class CircleAreaCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Define the constant value of π
        final double PI = 3.141593;

        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble();

        // Calculate the area of the circle using the formula
        double area = PI * Math.pow(radius, 2);

        System.out.println("The area of the circle with radius " + radius + " is: " + area);

        input.close();
    }
}
