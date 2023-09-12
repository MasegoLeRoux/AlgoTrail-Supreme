import math

def calculate_area(radius):
    return math.pi * radius**2

while True:
    try:
        radius = float(input("Enter the radius of the circle (non-null positive value): "))

        if radius <= 0:
            print("Please enter a non-null positive value for the radius.")
        else:
            area = calculate_area(radius)
            print(f"The area of the circle with radius {radius} is {area:.2f}")
            break 
    except ValueError:
        print("Invalid input. Please enter a valid number for the radius.")
