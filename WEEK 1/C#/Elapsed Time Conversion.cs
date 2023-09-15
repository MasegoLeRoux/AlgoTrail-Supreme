using System;

class Program
{
    static void Main()
    {
        Console.Write("Enter the elapsed time in seconds: ");
        try
        {
            if (int.TryParse(Console.ReadLine(), out int elapsedTimeInSeconds))
            {
                int hours = elapsedTimeInSeconds / 3600;
                int minutes = (elapsedTimeInSeconds % 3600) / 60;
                int seconds = elapsedTimeInSeconds % 60;

                Console.WriteLine($"Elapsed Time: {hours} hours, {minutes} minutes, {seconds} seconds");
            }
            else
            {
                Console.WriteLine("Invalid input. Please enter a valid number of seconds.");
            }
        }
        catch (Exception ex)
        {
            Console.WriteLine($"An error occurred: {ex.Message}");
        }
    }
}
