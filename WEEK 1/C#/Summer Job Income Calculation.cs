using System;

class Program {
    static void Main() {
        Console.Write("Enter pay rate per hour: $");
        double payRatePerHour = double.Parse(Console.ReadLine());

        Console.Write("Enter the number of hours worked each week: ");
        double hoursWorkedPerWeek = double.Parse(Console.ReadLine());

        Console.Write("Enter the tax rate as a percentage: ");
        double taxRatePercentage = double.Parse(Console.ReadLine());

        Console.Write("Enter spending on clothes and school supplies: $");
        double spending = double.Parse(Console.ReadLine());

        Console.Write("Enter savings bond purchases: $");
        double savingsBondPurchases = double.Parse(Console.ReadLine());

        double grossIncome = payRatePerHour * hoursWorkedPerWeek;
        double taxAmount = (taxRatePercentage / 100) * grossIncome;
        double netIncome = grossIncome - taxAmount - spending - savingsBondPurchases;

        Console.WriteLine($"Gross Income: R{grossIncome:F2}");
        Console.WriteLine($"Tax Amount: R{taxAmount:F2}");
        Console.WriteLine($"Net Income: R{netIncome:F2}");
    }
}
