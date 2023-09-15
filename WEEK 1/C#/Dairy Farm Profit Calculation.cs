using System;

class Program {
    static void Main() {
        const decimal MilkCartonVolumeLiters = 3.78m;
        const decimal CostPerLiter = 0.38m;
        const decimal ProfitPerCarton = 0.27m;

        Console.Write("Enter the total amount of milk produced in the morning (liters): ");
        decimal totalMilkProduced = decimal.Parse(Console.ReadLine());

        int numberOfCartons = (int)(totalMilkProduced / MilkCartonVolumeLiters);
        decimal costOfProduction = totalMilkProduced * CostPerLiter;
        decimal profit = numberOfCartons * ProfitPerCarton;

        Console.WriteLine($"Number of milk cartons needed: {numberOfCartons}");
        Console.WriteLine($"Cost of producing the milk: ${costOfProduction:F2}");
        Console.WriteLine($"Profit for producing the milk: ${profit:F2}");
    }
}
