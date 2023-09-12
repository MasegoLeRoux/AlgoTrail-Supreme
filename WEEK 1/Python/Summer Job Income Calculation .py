# Constants for tax rate
TAX_RATE = 0.18

# Function to calculate income and financial details
def calculate_income(pay_rate_per_hour, hours_worked_per_week, clothes_cost, supplies_cost, bond_rate):
    # Calculate gross income
    gross_income = pay_rate_per_hour * hours_worked_per_week

    # Calculate tax
    tax = gross_income * TAX_RATE

    # Calculate net income after tax
    net_income = gross_income - tax

    # Calculate total expenses (clothes and supplies)
    total_expenses = clothes_cost + supplies_cost

    # Calculate amount to spend after expenses
    amount_to_spend = net_income - total_expenses

    # Calculate savings bond purchase
    bond_purchase = bond_rate * net_income

    # Calculate final savings (net income minus bond purchase)
    final_savings = net_income - bond_purchase

    return gross_income, tax, net_income, total_expenses, amount_to_spend, bond_purchase, final_savings

# Main program
try:
    # Ask the user for pay rate per hour and hours worked per week
    pay_rate_per_hour = float(input("Enter the pay rate per hour (in ZAR): "))
    hours_worked_per_week = float(input("Enter the number of hours worked per week: "))

    # Ask the user for the cost of clothes and school supplies
    clothes_cost = float(input("Enter the cost of clothes (in ZAR): "))
    supplies_cost = float(input("Enter the cost of school supplies (in ZAR): "))

    # Ask the user for the savings bond rate
    bond_rate = float(input("Enter the savings bond rate (as a decimal): "))

    # Calculate income and financial details
    gross_income, tax, net_income, total_expenses, amount_to_spend, bond_purchase, final_savings = calculate_income(
        pay_rate_per_hour, hours_worked_per_week, clothes_cost, supplies_cost, bond_rate)

    # Display financial details in South African English
    print(f"Gross income: ZAR {gross_income:.2f}")
    print(f"Tax: ZAR {tax:.2f}")
    print(f"Net income after tax: ZAR {net_income:.2f}")
    print(f"Total expenses (clothes and supplies): ZAR {total_expenses:.2f}")
    print(f"Amount to spend after expenses: ZAR {amount_to_spend:.2f}")
    print(f"Savings bond purchase: ZAR {bond_purchase:.2f}")
    print(f"Final savings after bond purchase: ZAR {final_savings:.2f}")

except ValueError:
    print("Invalid input. Please enter valid numeric values for the inputs (in ZAR and as a decimal for bond rate).")
