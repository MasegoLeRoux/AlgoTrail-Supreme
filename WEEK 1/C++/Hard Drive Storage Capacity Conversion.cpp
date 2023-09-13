#include <iostream>
using namespace std;

int main() {
    double manufacturerSizeGB;

    cout << "Enter the hard drive size in GB (manufacturer's specification): ";
    cin >> manufacturerSizeGB;

    double actualSizeGB = manufacturerSizeGB * 1024;

    printf("Actual storage capacity: %.2f GB\n", actualSizeGB);

    return 0;
}
