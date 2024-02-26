const squareSum = (numbers) => numbers.reduce((acc, curr) => acc + curr**2, 0);

console.log(squareSum([1,2]));