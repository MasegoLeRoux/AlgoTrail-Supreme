const pi = 3.141593;

function calculateCircleArea(radius) {
  return pi * radius * radius;
}

const radius = 5; 
const area = calculateCircleArea(radius);

console.log(`The area of a circle with radius ${radius} is: ${area}`);
