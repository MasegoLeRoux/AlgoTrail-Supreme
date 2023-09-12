
def calculate_prices(original_price, markup_percentage, sales_tax_rate):

    markup_amount = (markup_percentage / 100) * original_price

    selling_price = original_price + markup_amount

    sales_tax = (sales_tax_rate / 100) * selling_price

    final_price = selling_price + sales_tax

    return selling_price, sales_tax, final_price

# Main program
try:
    # Ask the user for the original price
    original_price = float(input("Enter the original price of the item (in R): "))

    # Ask the user for the markup percentage
    markup_percentage = float(input("Enter the percentage of the mark-up: "))

    # Ask the user for the sales tax rate
    sales_tax_rate = float(input("Enter the sales tax rate (in percentage): "))

    # Calculate prices using the function
    selling_price, sales_tax, final_price = calculate_prices(original_price, markup_percentage, sales_tax_rate)

    # Display the results in South African English
    print(f"Original price of the item: R {original_price:.2f}")
    print(f"Percentage of the mark-up: {markup_percentage:.2f}%")
    print(f"Store’s selling price of the item: R {selling_price:.2f}")
    print(f"Sales tax rate: {sales_tax_rate:.2f}%")
    print(f"Sales tax: R {sales_tax:.2f}")
    print(f"Final price of the item: R {final_price:.2f}")

except ValueError:
    print("Invalid input. Please enter valid numeric values for the inputs (in R and percentage).")
