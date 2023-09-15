
class Program {
    static void Main() {
        Console.Write("Enter fuel tank capacity (in gallons): ");
        double capacity = double.Parse(Console.ReadLine());

        Console.Write("Enter miles per gallon (MPG): ");
        double mpg = double.Parse(Console.ReadLine());

        double milesWithoutRefueling = capacity * mpg;
        Console.WriteLine($"The automobile can be driven {milesWithoutRefueling} miles without refueling.");
    }
}