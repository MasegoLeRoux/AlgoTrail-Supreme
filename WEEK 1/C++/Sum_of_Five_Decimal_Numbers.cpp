#include <iostream>
using namespace std;

int main() {
    double capacity, mpg;

    cout << "Enter fuel tank capacity (in gallons): ";
    cin >> capacity;

    cout << "Enter miles per gallon (MPG): ";
    cin >> mpg;

    double milesWithoutRefueling = 0.0;
    int iterations = 0;

    while (capacity > 0.0) {
        milesWithoutRefueling += mpg;
        capacity -= 1.0;
        iterations++;
    }

    cout << "The automobile can be driven " << milesWithoutRefueling << " miles without refueling." << endl;
    cout << "Number of refuel iterations: " << iterations << endl;

    return 0;
}
