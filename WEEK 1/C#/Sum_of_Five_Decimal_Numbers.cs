using System;

class Program
{
    static void Main()
    {
        double sum = 0.0;

        Console.WriteLine("Enter five decimal numbers:");

        for (int i = 0; i < 5; i++)
        {
            double num;
            if (double.TryParse(Console.ReadLine(), out num))
            {
                sum += num;
            }
            else
            {
                Console.WriteLine("Invalid input. Please enter a valid decimal number.");
                i--; // Decrement i to re-enter the current value
            }
        }

        int roundedSum = (int)(sum + 0.5);
        Console.WriteLine($"Sum rounded to the nearest integer: {roundedSum}");
    }
}
