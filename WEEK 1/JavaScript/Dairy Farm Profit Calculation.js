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
    const totalMilkProduced = await getUserInput('Enter the total amount of milk produced in liters in the morning: ');

    if (totalMilkProduced < 0) {
      console.log('Please enter a non-negative value for milk production.');
      return;
    }

    const milkCartonCapacity = 3.78; // liters
    const costPerLiter = 3.78; // ZAR
    const profitPerCarton = 2.70; // ZAR

    const cartonsNeeded = Math.ceil(totalMilkProduced / milkCartonCapacity);
    const totalCost = totalMilkProduced * costPerLiter;
    const totalProfit = cartonsNeeded * profitPerCarton;

    console.log(`Number of milk cartons needed: ${cartonsNeeded}`);
    console.log(`Cost of producing the milk: ZAR ${totalCost.toFixed(2)}`);
    console.log(`Profit for producing the milk: ZAR ${totalProfit.toFixed(2)}`);
  } catch (error) {
    console.error(error);
  } finally {
    rl.close();
  }
}

main();
