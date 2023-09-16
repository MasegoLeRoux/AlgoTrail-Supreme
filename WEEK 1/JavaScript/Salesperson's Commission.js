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
    const sellingPrice = await getUserInput('Enter the selling price of the used car (in ZAR): ');
    const costOfCar = await getUserInput('Enter the cost of the car (in ZAR): ');

    if (sellingPrice < 0 || costOfCar < 0) {
      console.log('Please enter non-negative values for selling price and cost of the car.');
      return;
    }

    const commissionPercentage = 30;
    const baseCommission = 20;
    
    let commission = 0;

    if (sellingPrice > costOfCar) {
      const excessAmount = sellingPrice - costOfCar;
      commission = baseCommission + (excessAmount * (commissionPercentage / 100));
    } else {
      console.log('No commission earned as the selling price is not greater than the cost of the car.');
    }

    console.log(`Selling price of the car: ZAR ${sellingPrice.toFixed(2)}`);
    console.log(`Cost of the car: ZAR ${costOfCar.toFixed(2)}`);
    console.log(`Commission earned: ZAR ${commission.toFixed(2)}`);
  } catch (error) {
    console.error(error);
  } finally {
    rl.close();
  }
}

main();