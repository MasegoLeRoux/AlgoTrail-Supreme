const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

function getUserInput(prompt) {
  return new Promise((resolve) => {
    rl.question(prompt, (input) => {
      resolve(parseInt(input));
    });
  });
}

async function main() {
  try {
    const quarters = await getUserInput('Enter the number of quarters: ');
    const dimes = await getUserInput('Enter the number of dimes: ');
    const nickels = await getUserInput('Enter the number of nickels: ');

    if (quarters < 0 || dimes < 0 || nickels < 0) {
      console.log('Please enter positive numbers for the coins.');
      return;
    }

    const totalPennies = quarters * 25 + dimes * 10 + nickels * 5;

    console.log(`The total value of the coins in pennies is: ${totalPennies} pennies.`);
  } catch (error) {
    console.error(error);
  } finally {
    rl.close();
  }
}

main();
