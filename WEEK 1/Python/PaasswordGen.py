
import random
import string

def generate_password(length, use_digits, use_letters, use_symbols):
    characters = ''
    
    if use_digits:
        characters += string.digits
    if use_letters:
        characters += string.ascii_letters
    if use_symbols:
        characters += string.punctuation

    if not characters:
        print("Please select at least one character type.")
        return None

    password = ''.join(random.choice(characters) for _ in range(length))
    return password

def main():
    print("Password Generator")
    print("==================")

    length = int(input("Enter the desired password length: "))
    use_digits = input("Use digits (0-9)? (yes/no): ").lower() == 'yes'
    use_letters = input("Use letters (a-zA-Z)? (yes/no): ").lower() == 'yes'
    use_symbols = input("Use symbols (!@#$%^&*, etc.)? (yes/no): ").lower() == 'yes'

    password = generate_password(length, use_digits, use_letters, use_symbols)

    if password:
        print("Generated Password: ", password)
        
        # Ask the user for a file name to save the password
        file_name = input("Enter a file name to save the password (e.g., password.txt): ")

        # Save the password to the specified file, creating it if it doesn't exist
        with open(file_name, 'w') as file:
            file.write(password)
            print(f"Password saved to {file_name}")

if __name__ == "__main__":
    main()
