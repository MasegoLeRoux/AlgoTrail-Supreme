#include <iostream>
using namespace std;

int main() {
    double capacity, mpg;

    cout << "Enter fuel tank capacity (in gallons): ";
    cin >> capacity;

    cout << "Enter miles per gallon (MPG): ";
    cin >> mpg;

    double milesWithoutRefueling = capacity * mpg;
    printf("The automobile can be driven %.2f miles without refueling.\n", milesWithoutRefueling);

    return 0;
}
