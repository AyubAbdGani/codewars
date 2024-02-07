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