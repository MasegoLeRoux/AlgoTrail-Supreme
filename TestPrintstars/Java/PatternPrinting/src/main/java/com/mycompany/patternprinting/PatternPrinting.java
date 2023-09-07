
package com.mycompany.patternprinting;

/**
 *
 * @author Maseg
 */
public class PatternPrinting {

    public static void main(String[] args) {
       int width = 40;
        String authorName = "Kamogelo"; 

        printStars(width);
        printEmptyLine(width);
        printCenteredLine("Programming Assignment 1", width);
        printEmptyLine(width);
        printCenteredLine("Computer Programming I", width);
        printEmptyLine(width);
        printCenteredLine("Author: " + authorName, width);
        printEmptyLine(width);
        printCenteredLine("Due Date: Thursday, Jan. 24", width);
        printStars(width);
    }

    // Method to print a line of asterisks
    public static void printStars(int width) {
        for (int i = 0; i < width; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    // Method to print an empty line with asterisks at the edges
    public static void printEmptyLine(int width) {
        System.out.print("*");
        for (int i = 0; i < width - 2; i++) {
            System.out.print(" ");
        }
        System.out.println("*");
    }

    // Method to print a centered line with asterisks at the edges
    public static void printCenteredLine(String text, int width) {
        int spaces = (width - text.length() - 2) / 2;
        System.out.print("*");
        for (int i = 0; i < spaces; i++) {
            System.out.print(" ");
        }
        System.out.print(text);
        for (int i = 0; i < spaces; i++) {
            System.out.print(" ");
        }
        // Adjust for odd widths
        if ((width - text.length() - 2) % 2 != 0) {
            System.out.print(" ");
        }
        System.out.println("*");
    }
}
