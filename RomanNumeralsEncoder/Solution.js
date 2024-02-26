const romansChar = {
    I : 1,
    V : 5,
    X : 10,
    L : 50,
    C : 100,
    D : 500,
    M : 1000
}

const getRomanChar = (r) => {
    for (let key in romansChar){
        if (romansChar[key] === r) return key;
    }
    return "";
}

function solution(number){
    let str = number.toString();
    let pangkat = 0;
    let result = "";

    for (let i = str.length - 1; i >= 0 ; i-- ){
        let iVal = parseInt(str[i]);
        
        if (iVal === 0 && pangkat === 0){
            pangkat++;
            continue;
        }

        let satuan = 10 ** pangkat;

        if (4 === iVal){
            let a = 5 * satuan;
            let b = 1 * satuan;
            result += getRomanChar(a) + getRomanChar(b);
        }else if (9 === iVal){
            let a = 10 * satuan;
            let b = 1 * satuan;
            result += getRomanChar(a) + getRomanChar(b);
        }else {
            let q = iVal >= 5 ? Math.abs(5 - iVal) : iVal;
            for (let j = 0; j < q; j++){
                result += getRomanChar(1 * satuan);
            }

            if (iVal >= 5){
                result += getRomanChar(5 * satuan);
            }
        }
        pangkat++;
    }
    return result.split('').reverse().join('');
}

console.log(solution(2321549));