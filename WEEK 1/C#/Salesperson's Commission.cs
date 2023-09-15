using System;

class Program {
    static void Main() {
        Console.Write("Enter the selling price of the used car: R");
        double sellingPrice = double.Parse(Console.ReadLine());

        Console.Write("Enter the cost of the car: R");
        double costOfCar = double.Parse(Console.ReadLine());

        const double BaseCommission = 20.0;
        const double CommissionRate = 0.30;

        double excessPrice = Math.Max(0, sellingPrice - costOfCar);
        double commission = BaseCommission + (excessPrice * CommissionRate);

        Console.WriteLine($"Excess Price: R{excessPrice:F2}");
        Console.WriteLine($"Commission: R{commission:F2}");
    }
}
