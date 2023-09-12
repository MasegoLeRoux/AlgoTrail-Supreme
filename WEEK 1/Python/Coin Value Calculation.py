def main():
    while True:
        try:
            quarters = int(input("Enter the number of quarters: "))
            dimes = int(input("Enter the number of dimes: "))
            nickels = int(input("Enter the number of nickels: "))

            if quarters < 0 or dimes < 0 or nickels < 0:
                raise ValueError("Please enter non-negative values for quarters, dimes, and nickels.")

            total_value_in_pennies = (quarters * 25) + (dimes * 10) + (nickels * 5)

            print(f"Total value in pennies: {total_value_in_pennies}")
            break 
        except ValueError as e:
            print(f"Invalid input: {e}")

if __name__ == "__main__":
    main()
