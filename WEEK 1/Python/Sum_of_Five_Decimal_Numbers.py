sum = 0

print("Enter five decimal numbers:")
for i in range(5):
    num = float(input())  # Read a decimal number from the user
    sum += num

roundedSum = int(sum + 0.5)
print(f"Sum rounded to the nearest integer: {roundedSum}")
