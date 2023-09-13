#include <iostream>
using namespace std;

int main() {
    const double MilkCartonVolumeLiters = 3.78;
    const double CostPerLiter = 0.38;
    const double ProfitPerCarton = 0.27;

    cout << "Enter the total amount of milk produced in the morning (liters): ";
    double totalMilkProduced;

    
    while (true) {
        cin >> totalMilkProduced;
        if (totalMilkProduced >= 0.0) {
            break;  
        } else {
            cout << "Invalid input. Please enter a non-negative value: ";
        }
    }

    int numberOfCartons = static_cast<int>(totalMilkProduced / MilkCartonVolumeLiters);
    double costOfProduction = totalMilkProduced * CostPerLiter;
    double profit = numberOfCartons * ProfitPerCarton;

    printf("Number of milk cartons needed: %d\n", numberOfCartons);
    printf("Cost of producing the milk: $%.2f\n", costOfProduction);
    printf("Profit for producing the milk: $%.2f\n", profit);

    return 0;
}
