
def calculate_commission(selling_price, cost_price):

    excess_price = max(0, selling_price - cost_price)
    commission = 20 + (0.30 * excess_price)
    return commission

# Main program
try:
    
    cost_price = float(input("Enter the cost price of the car (in ZAR): "))

    selling_price = float(input("Enter the selling price of the car (in ZAR): "))

   
    if selling_price < cost_price:
        print("Selling price cannot be less than the cost price.")
    else:
   
        commission = calculate_commission(selling_price, cost_price)

    
        print(f"Cost price of the car: ZAR {cost_price:.2f}")
        print(f"Selling price of the car: ZAR {selling_price:.2f}")
        print(f"Commission: ZAR {commission:.2f}")

except ValueError:
    print("Invalid input. Please enter valid numeric values for the inputs (in ZAR).")
