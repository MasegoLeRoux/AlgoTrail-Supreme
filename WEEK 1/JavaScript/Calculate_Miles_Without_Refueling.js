const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

function getUserInput(prompt) {
  return new Promise((resolve) => {
    rl.question(prompt, (input) => {
      resolve(parseFloat(input));
    });
  });
}

async function main() {
  try {
    const tankCapacity = await getUserInput('Enter the fuel tank capacity (in gallons): ');
    const mpg = await getUserInput('Enter the miles per gallon (MPG): ');

    if (tankCapacity <= 0 || mpg <= 0) {
      console.log('Both tank capacity and MPG should be positive values.');
      return;
    }

    const milesWithoutRefueling = tankCapacity * mpg;

    console.log(`The automobile can be driven for ${milesWithoutRefueling} miles without refueling.`);
  } catch (error) {
    console.error(error);
  } finally {
    rl.close();
  }
}

main();
