// Link https://www.codewars.com/kata/515e271a311df0350d00000f

const squareSum = (numbers) => numbers.reduce((acc, curr) => acc + curr**2, 0);

console.log(squareSum([1,2]));