
LITERS_PER_CARTON = 3.78
COST_PER_LITER = 0.38
PROFIT_PER_CARTON = 0.27

def calculate_profit(total_liters):

    cartons_needed = total_liters / LITERS_PER_CARTON
    cost = total_liters * COST_PER_LITER
    profit = cartons_needed * PROFIT_PER_CARTON
    return cartons_needed, cost, profit


while True:
    try:

        total_liters = float(input("Enter the total amount of milk produced in the morning (in liters): "))

        if total_liters <= 0:
            print("Please enter a positive value for the total milk produced.")
        else:

            cartons_needed, cost, profit = calculate_profit(total_liters)
            print(f"Number of milk cartons needed: {cartons_needed:.2f}")
            print(f"Cost of producing the milk: ${cost:.2f}")
            print(f"Profit for producing the milk: ${profit:.2f}")
            break

    except ValueError:
        print("Invalid input. Please enter a valid number for the total milk produced.")
