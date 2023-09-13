#include <iostream>
using namespace std;

int main() {
    double sellingPrice, costOfCar;

    cout << "Enter the selling price of the used car: $";
    cin >> sellingPrice;

    cout << "Enter the cost of the car: $";
    cin >> costOfCar;

    const double BaseCommission = 20.0;
    const double CommissionRate = 0.30;

    double excessPrice = max(0.0, sellingPrice - costOfCar);
    double commission = BaseCommission + (excessPrice * CommissionRate);

    printf("Excess Price: $%.2f\n", excessPrice);
    printf("Commission: $%.2f\n", commission);

    return 0;
}
