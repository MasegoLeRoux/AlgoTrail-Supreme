using System;
using system Console;
class Program {
    static void Main() {
        Console.Write("Enter the number of quarters: ");
        int quarters = int.Parse(Console.ReadLine());

        Console.Write("Enter the number of dimes: ");
        int dimes = int.Parse(Console.ReadLine());

        Console.Write("Enter the number of nickels: ");
        int nickels = int.Parse(Console.ReadLine());

        int totalValueInPennies = (quarters * 25) + (dimes * 10) + (nickels * 5);

        Console.WriteLine($"Total value in pennies: {totalValueInPennies}");
    }
}
