                    #Description:
            ################################
#Create a program that prompts the user for the capacity,
# in gallons, of an automobile's fuel tank and the miles
# per gallon (MPG) the automobile can be driven. 
#The program should output the number of miles the automobile,
# can be driven without refueling.

print("Enter the capacity of the automobile's fuel tank (in gallons):\n")
fuelCapacity = float(input()) 
print("Enter the miles per gallon (MPG) of the automobile:\n")
milesPerGallon = float(input()) 
milesWithoutRefueling = fuelCapacity * milesPerGallon
print(f"The automobile can be driven approximately {milesWithoutRefueling} miles without refueling.")