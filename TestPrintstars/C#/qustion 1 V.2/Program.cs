using System;

class Program
{
    static void Main()
    {
        string authorName = "Kamogelo Mashigo"; // Replace with the author's name
        int width = 40; // Adjust the width as needed

        PrintLine('*', width);
        PrintCenteredLine("Programming Assignment 1", width);
        PrintCenteredLine("Computer Programming I", width);
        PrintCenteredLine($"Author: {authorName}", width);
        PrintCenteredLine("Due Date: Thursday, Jan. 24", width);
        PrintLine('*', width);
    }

    static void PrintLine(char symbol, int width)
    {
        Console.WriteLine(new string(symbol, width));
    }

    static void PrintCenteredLine(string text, int width)
    {
        int padding = (width - text.Length - 2) / 2;
        string centeredText = new string(' ', padding) + text + new string(' ', padding);
        Console.WriteLine($"*{centeredText}*");
    }
}
