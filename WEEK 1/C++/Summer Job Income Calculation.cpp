#include <iostream>
using namespace std;

int main() {
    double payRatePerHour, hoursWorkedPerWeek, taxRatePercentage, spending, savingsBondPurchases;

    cout << "Enter pay rate per hour: R";
    cin >> payRatePerHour;

    cout << "Enter the number of hours worked each week: ";
    cin >> hoursWorkedPerWeek;

    cout << "Enter the tax rate as a percentage: ";
    cin >> taxRatePercentage;

    cout << "Enter spending on clothes and school supplies: $";
    cin >> spending;

    cout << "Enter savings bond purchases: $";
    cin >> savingsBondPurchases;

    double grossIncome = payRatePerHour * hoursWorkedPerWeek;
    double taxAmount = (taxRatePercentage / 100) * grossIncome;
    double netIncome = grossIncome - taxAmount - spending - savingsBondPurchases;

    printf("Gross Income: $%.2f\n", grossIncome);
    printf("Tax Amount: $%.2f\n", taxAmount);
    printf("Net Income: $%.2f\n", netIncome);

    return 0;
}
