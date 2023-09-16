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
    const elapsedTimeInSeconds = await getUserInput('Enter the elapsed time in seconds: ');

    if (elapsedTimeInSeconds < 0) {
      console.log('Please enter a non-negative value for elapsed time.');
      return;
    }

    const hours = Math.floor(elapsedTimeInSeconds / 3600);
    const remainingSeconds = elapsedTimeInSeconds % 3600;
    const minutes = Math.floor(remainingSeconds / 60);
    const seconds = remainingSeconds % 60;

    console.log(`Elapsed time: ${hours} hours, ${minutes} minutes, and ${seconds} seconds.`);
  } catch (error) {
    console.error(error);
  } finally {
    rl.close();
  }
}

main();
