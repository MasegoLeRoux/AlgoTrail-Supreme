const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

function getUserInput(prompt) {
  return new Promise((resolve, reject) => {
    rl.question(prompt, (input) => {
      const number = parseFloat(input);
      if (!isNaN(number)) {
        resolve(number);
      } else {
        reject("Invalid input. Please enter a valid decimal number.");
      }
    });
  });
}

async function main() {
  try {
    let sum = 0;

    for (let i = 1; i <= 5; i++) {
      const number = await getUserInput(`Enter decimal number ${i}: `);
      sum += number;
    }

    const result = Math.round(sum);

    console.log(`The sum of the numbers is: ${result}`);
  } catch (error) {
    console.error(error);
  } finally {
    rl.close();
  }
}

main();
