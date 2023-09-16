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
    const manufacturerGB = await getUserInput('Enter the hard drive size as specified by the manufacturer (in GB): ');

    if (manufacturerGB < 0) {
      console.log('Please enter a non-negative value for hard drive size.');
      return;
    }

    const bytesInGBManufacturer = 1000 * 1000 * 1000; // 1 GB (manufacturer) = 1,000,000,000 bytes
    const bytesInGBStandard = 1024 * 1024 * 1024; // 1 GB (standard) = 1,073,741,824 bytes

    const actualGB = manufacturerGB * (bytesInGBManufacturer / bytesInGBStandard);

    console.log(`The actual storage capacity of the hard drive is approximately ${actualGB.toFixed(2)} GB.`);
  } catch (error) {
    console.error(error);
  } finally {
    rl.close();
  }
}

main();
