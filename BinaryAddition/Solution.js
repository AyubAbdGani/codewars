//Link : https://www.codewars.com/kata/551f37452ff852b7bd000139

function addBinary(a,b) {
    let c = a + b;
    let result = "";
    
    while (c > 0) {
        let t = c % 2;
        result = t + result;
        c = Math.floor(c/2);
    } 

    return result;
}

console.log(addBinary(5,3))