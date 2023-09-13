#include <iostream>
using namespace std;

int main() {
    const double Pi = 3.141593;
    double radius;

    cout << "Enter the radius of the circle: ";
    cin >> radius;

    double area = Pi * pow(radius, 2);
    printf("Area of the circle: %.2f\n", area);

    return 0;
}
