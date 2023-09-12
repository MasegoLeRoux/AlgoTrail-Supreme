
LITERS_PER_CARTON = 3.78

def calculate_profit(total_liters, cost_per_liter, profit_per_carton):

    cartons_needed = total_liters / LITERS_PER_CARTON

   
    cost_R = total_liters * cost_per_liter


    profit_R = cartons_needed * profit_per_carton

    return cartons_needed, cost_R, profit_R

# Main program
while True:
    try:
        total_liters = float(input("Enter the total amount of milk produced in the morning (in liters): "))

  
        cost_per_liter_R = float(input("Enter the cost of producing one liter of milk (in R): "))

 
        profit_per_carton_R = float(input("Enter the profit on each carton of milk (in R): "))

        if total_liters < 0:
            print("Please enter a positive value for the total milk produced.")
        elif total_liters == 0:
            print("No milk produced, no profit to calculate.")
            break  
        elif cost_per_liter_R < 0:
            print("Please enter a positive value for the cost per liter (in R).")
        elif profit_per_carton_R < 0:
            print("Please enter a non-negative value for the profit per carton (in R).")
        else:
          
            cartons_needed, cost_R, profit_R = calculate_profit(total_liters, cost_per_liter_R, profit_per_carton_R)
            print(f"Number of milk cartons needed: {cartons_needed:.2f}")
            print(f"Cost of producing the milk: {cost_R:.2f} R")
            print(f"Profit for producing the milk: {profit_R:.2f} R")
            break  # Exit the loop if valid input is provided

    except ValueError:
        print("Invalid input. Please enter valid numeric values for the inputs (in R).")
