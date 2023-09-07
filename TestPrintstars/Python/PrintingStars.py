rows = int(input("Enter Number of Rows: "))
columns = int(input("Enter Number of Columns: "))
user_input =(input('Enter your name: '))


print("Hollow Box Pattern with", rows, "rows and", columns, "columns")

for i in range(0, rows):
    for j in range(0, columns):
        if(i == 0 or i == rows - 1 or j == 0 or j == columns - 1):
            print('*', end='  ')
        else:
            print(' ', end='  ')
            

    if i == 1:
        print()
        print('*','Programming Assignment 1     ', end='  *\n')
        print('*','Computer Programming I       ', end='  *\n')
        print('*','     Author: ' + user_input               , end='               *\n')
        print('*','Due Date: Thursday,Jan. 24     ',end='*\n')
    else:
        print()  

