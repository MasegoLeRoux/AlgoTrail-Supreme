#include <iostream>
#include <string>

using namespace std;

int main() {
    int rows, columns;
    string user_input;

    cout << "Enter Number of Rows: ";
    cin >> rows;

    cout << "Enter Number of Columns: ";
    cin >> columns;

    cin.ignore(); // Clear the newline character from previous input

    cout << "Enter your name: ";
    getline(cin, user_input);

    cout << "Hollow Box Pattern with " << rows << " rows and " << columns << " columns" << endl;

    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < columns; j++) {
            if (i == 0 || i == rows - 1 || j == 0 || j == columns - 1) {
                cout << "*  ";
            } else {
                cout << "   ";
            }
        }

        if (i == 1) {
            cout << endl;
            cout << "*  Programming Assignment 1     *"<< endl;
            cout << "*  Computer Programming I       *"<< endl;
            cout << "*     Author: " << user_input << "               *"<< endl;
            cout << "*  Due Date: Thursday, Jan. 24  *"<< endl;
        } else {
            cout << endl;
        }
    }

    return 0;
}
