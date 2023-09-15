using System;

class Program {
    static void Main() {
        Console.Write("Enter the total amount of milk produced in the morning (liters): ");
        decimal totalMilkProduced = decimal.Parse(Console.ReadLine());

        Console.Write("Enter the cost of producing one liter of milk: $");
        decimal costPerLiter = decimal.Parse(Console.ReadLine());

        Console.Write("Enter the profit per carton of milk: $");
        decimal profitPerCarton = decimal.Parse(Console.ReadLine());

        const decimal MilkCartonVolumeLiters = 3.78m;

        int numberOfCartons = (int)(totalMilkProduced / MilkCartonVolumeLiters);
        decimal costOfProduction = totalMilkProduced * costPerLiter;
        decimal profit = numberOfCartons * profitPerCarton;

        Console.WriteLine($"Number of milk cartons needed: {numberOfCartons}");
        Console.WriteLine($"Cost of producing the milk: R{costOfProduction:F2}");
        Console.WriteLine($"Profit for producing the milk: R{profit:F2}");
    }
}
