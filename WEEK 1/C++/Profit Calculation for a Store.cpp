#include <iostream>

int main() {
    double originalPrice, markupPercentage, salesTaxRate;

    std::cout << "Enter the original price of the item: $";
    std::cin >> originalPrice;

    std::cout << "Enter the percentage of the mark-up: ";
    std::cin >> markupPercentage;

    std::cout << "Enter the sales tax rate: ";
    std::cin >> salesTaxRate;

    double markupAmount = (markupPercentage / 100) * originalPrice;
    double sellingPrice = originalPrice + markupAmount;
    double salesTax = (salesTaxRate / 100) * sellingPrice;
    double finalPrice = sellingPrice + salesTax;

    std::cout << "Original Price: $" << originalPrice << std::endl;
    std::cout << "Mark-up Percentage: " << markupPercentage << "%" << std::endl;
    std::cout << "Selling Price: $" << sellingPrice << std::endl;
    std::cout << "Sales Tax Rate: " << salesTaxRate << "%" << std::endl;
    std::cout << "Sales Tax: $" << salesTax << std::endl;
    std::cout << "Final Price: $" << finalPrice << std::endl;

    return 0;
}
