#include <iostream>
using namespace std;

int main() {
    int seconds;

    cout << "Enter the elapsed time for an event in seconds: ";
    cin >> seconds;

    int hours = seconds / 3600;
    int remainingSeconds = seconds % 3600;
    int minutes = remainingSeconds / 60;
    int remainingSecondsFinal = remainingSeconds % 60;

    printf("Elapsed time: %d hours, %d minutes, %d seconds\n", hours, minutes, remainingSecondsFinal);

    return 0;
}
