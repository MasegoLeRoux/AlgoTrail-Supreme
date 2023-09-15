using System;

class Program {
    static void Main() {
        const double Pi = 3.141593;

        Console.Write("Enter the radius of the circle: ");
        double radius = double.Parse(Console.ReadLine());

        double area = Pi * Math.Pow(radius, 2);
        Console.WriteLine($"Area of the circle: {area:F2}");
    }
}