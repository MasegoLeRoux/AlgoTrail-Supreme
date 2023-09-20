import java.util.Scanner;

public class HardDriveCapacityConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the hard drive size as specified by the manufacturer (in GB)
        System.out.print("Enter the hard drive size as specified by the manufacturer (in GB): ");
        
        if (input.hasNextDouble()) {
            double manufacturerSizeGB = input.nextDouble();

            // Calculate the actual storage capacity (in GB) based on the computer memory standard
            double actualSizeGB = manufacturerSizeGB * 1000 * 1000 * 1000 / (1024 * 1024 * 1024);

            // Output the actual storage capacity
            System.out.println("Actual storage capacity: " + actualSizeGB + " GB");
        } else {
            System.out.println("Invalid input. Please enter a valid number for the hard drive size.");
        }

        input.close();
    }
}
