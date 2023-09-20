import java.util.Scanner;

public class ElapsedTimeConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to input the elapsed time in seconds
        System.out.print("Enter the elapsed time in seconds: ");
        int elapsedTimeInSeconds = input.nextInt();

        // Calculate hours, minutes, and remaining seconds
        int hours = elapsedTimeInSeconds / 3600;
        int minutes = (elapsedTimeInSeconds % 3600) / 60;
        int seconds = elapsedTimeInSeconds % 60;

        // Output the elapsed time
        System.out.println("Elapsed time: " + hours + " hours, " + minutes + " minutes, " + seconds + " seconds");

        input.close();
    }
}
