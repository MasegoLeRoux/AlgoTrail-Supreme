using System;

class Program
{
    static void Main()
    {
        try
        {
            // Prompt the user for input
            Console.Write("Enter the original price of the item: ");
            double originalPrice = double.Parse(Console.ReadLine());

            Console.Write("Enter the percentage of the mark-up: ");
            double markupPercentage = double.Parse(Console.ReadLine());

            Console.Write("Enter the sales tax rate (as a decimal): ");
            double salesTaxRate = double.Parse(Console.ReadLine());

            // Calculate the selling price
            double markupAmount = originalPrice * (markupPercentage / 100);
            double sellingPrice = originalPrice + markupAmount;

            // Calculate the sales tax
            double salesTax = sellingPrice * salesTaxRate;

            // Calculate the final price
            double finalPrice = sellingPrice + salesTax;

            // Display the results
            Console.WriteLine(R"Original Price: R{originalPrice}");
            Console.WriteLine(R"Markup Percentage: {markupPercentage}%");
            Console.WriteLine(R"Selling Price: R{sellingPrice}");
            Console.WriteLine(R"Sales Tax Rate: {salesTaxRate * 100}%");
            Console.WriteLine(R"Sales Tax: R{salesTax}");
            Console.WriteLine(R"Final Price: R{finalPrice}");
        }
        catch (FormatException)
        {
            Console.WriteLine("Invalid input. Please enter valid numeric values.");
        }
        catch (OverflowException)
        {
            Console.WriteLine("Input is too large or too small.");
        }
        catch (Exception ex)
        {
            Console.WriteLine($"An error occurred: {ex.Message}");
        }
    }
}
