using System;

Console.Write("Enter Number of Rows: ");
int rows = int.Parse(Console.ReadLine());

Console.Write("Enter Number of Columns: ");
int columns = int.Parse(Console.ReadLine());

Console.Write("Enter your name: ");
string user_input = Console.ReadLine();

Console.WriteLine($"Hollow Box Pattern with {rows} rows and {columns} columns");

for (int i = 0; i < rows; i++)
{
    for (int j = 0; j < columns; j++)
    {
        if (i == 0 || i == rows - 1 || j == 0 || j == columns - 1)
        {
            Console.Write("*  ");
        }
        else
        {
            Console.Write("   ");
        }
    }

    if (i == 1)
    {
        Console.WriteLine();
        Console.WriteLine($"* Programming Assignment 1     *");
        Console.WriteLine($"* Computer Programming I       *");
        Console.WriteLine($"*     Author: {user_input}               *");
        Console.WriteLine($"* Due Date: Thursday, Jan. 24     *");
    }
    else
    {
        Console.WriteLine();
    }
}
