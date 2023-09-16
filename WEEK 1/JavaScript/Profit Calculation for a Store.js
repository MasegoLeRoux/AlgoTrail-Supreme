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
    const originalPrice = await getUserInput('Enter the original price of the item (in ZAR): ');
    const markupPercentage = await getUserInput('Enter the percentage of the mark-up: ');
    const salesTaxRate = await getUserInput('Enter the sales tax rate (in percentage): ');

    if (originalPrice < 0 || markupPercentage < 0 || salesTaxRate < 0) {
      console.log('Please enter non-negative values for price, markup percentage, and sales tax rate.');
      return;
    }

    const sellingPrice = originalPrice * (1 + markupPercentage / 100);
    const salesTax = (sellingPrice * salesTaxRate) / 100;
    const finalPrice = sellingPrice + salesTax;

    console.log(`Original price of the item: ZAR ${originalPrice.toFixed(2)}`);
    console.log(`Percentage of the mark-up: ${markupPercentage}%`);
    console.log(`Store's selling price of the item: ZAR ${sellingPrice.toFixed(2)}`);
    console.log(`Sales tax rate: ${salesTaxRate}%`);
    console.log(`Sales tax: ZAR ${salesTax.toFixed(2)}`);
    console.log(`Final price of the item: ZAR ${finalPrice.toFixed(2)}`);
  } catch (error) {
    console.error(error);
  } finally {
    rl.close();
  }
}

main();

