function oddest(a) {
    let res = 0;
    for (const b of a) {
        let t = b % 2 === 0 ? b < 0 ? b + 1 : b - 1 : b;
        res = res > t ? res : t; 
    }
    return res;
}

console.log(oddest([1,3]));