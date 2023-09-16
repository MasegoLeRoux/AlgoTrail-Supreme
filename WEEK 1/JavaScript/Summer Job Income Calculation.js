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
    const payRatePerHour = await getUserInput('Enter your pay rate per hour (in ZAR): ');
    const hoursWorkedPerWeek = await getUserInput('Enter the number of hours worked each week: ');
    
    if (payRatePerHour < 0 || hoursWorkedPerWeek < 0) {
      console.log('Please enter non-negative values for pay rate and hours worked.');
      return;
    }

    const weeksWorked = 8; // Assuming a typical summer job lasts for 8 weeks
    const income = payRatePerHour * hoursWorkedPerWeek * weeksWorked;

    const taxRate = 0.15; // 15% tax rate
    const taxAmount = income * taxRate;

    const clothesAndSuppliesCost = 500; // Estimated cost of clothes and school supplies
    const savingsBondPurchase = 1000; // Amount spent on savings bonds

    const totalExpenses = clothesAndSuppliesCost + savingsBondPurchase;
    const remainingIncome = income - taxAmount - totalExpenses;

    console.log(`Income from summer job: ZAR ${income.toFixed(2)}`);
    console.log(`Tax amount: ZAR ${taxAmount.toFixed(2)}`);
    console.log(`Expenses on clothes and school supplies: ZAR ${clothesAndSuppliesCost.toFixed(2)}`);
    console.log(`Savings bond purchase: ZAR ${savingsBondPurchase.toFixed(2)}`);
    console.log(`Remaining income: ZAR ${remainingIncome.toFixed(2)}`);
  } catch (error) {
    console.error(error);
  } finally {
    rl.close();
  }
}

main();
