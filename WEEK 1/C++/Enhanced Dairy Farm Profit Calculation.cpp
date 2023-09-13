#include <iostream>
using namespace std;

int main() {
    double milkCartonVolumeLiters, costPerLiter, profitPerCarton;
    
    cout << "Enter milk carton volume in liters: ";
    cin >> milkCartonVolumeLiters;

    cout << "Enter cost per liter: $";
    cin >> costPerLiter;

    cout << "Enter profit per carton: $";
    cin >> profitPerCarton;

    cout << "Enter the total amount of milk produced in the morning (liters): ";
    double totalMilkProduced;
    cin >> totalMilkProduced;

    int numberOfCartons = static_cast<int>(totalMilkProduced / milkCartonVolumeLiters);
    double costOfProduction = totalMilkProduced * costPerLiter;
    double profit = numberOfCartons * profitPerCarton;

    printf("Number of milk cartons needed: %d\n", numberOfCartons);
    printf("Cost of producing the milk: $%.2f\n", costOfProduction);
    printf("Profit for producing the milk: $%.2f\n", profit);

    return 0;
}
