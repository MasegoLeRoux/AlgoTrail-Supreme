const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

rl.question('Enter Number of Rows: ', (rows) => {
  rl.question('Enter Number of Columns: ', (columns) => {
    rl.question('Enter your name: ', (userInput) => {
      console.log(`Hollow Box Pattern with ${rows} rows and ${columns} columns`);

      for (let i = 0; i < rows; i++) {
        for (let j = 0; j < columns; j++) {
          if (i === 0 || i === rows - 1 || j === 0 || j === columns - 1) {
            process.stdout.write('*  ');
          } else {
            process.stdout.write('   ');
          }
        }

        if (i === 1) {
          console.log();
          console.log('* Programming Assignment 1     *');
          console.log('* Computer Programming I       *');
          console.log(`*     Author: ${userInput}               *`);
          console.log('* Due Date: Thursday, Jan. 24     *');
        } else {
          console.log();
        }
      }

      rl.close();
    });
  });
});
