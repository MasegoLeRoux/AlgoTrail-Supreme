using System;

class Program {
    static void Main() {
        Console.Write("Enter the hard drive size in GB (manufacturer's specification): ");
        double manufacturerSizeGB = double.Parse(Console.ReadLine());

        double actualSizeGB = manufacturerSizeGB * 1024;

        Console.WriteLine($"Actual storage capacity: {actualSizeGB} GB");
    }
}