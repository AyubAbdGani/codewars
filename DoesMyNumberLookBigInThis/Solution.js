// Link :https://www.codewars.com/kata/5287e858c6b5a9678200083c/train/javascript

const narcissistic = (value) => value.toString().split("").reduce((acc, curr) => acc + Math.pow(curr, value.toString().length),0) === value;



console.log(narcissistic(5))
  