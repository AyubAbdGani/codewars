function getCount(str) {  
    let counter = 0;
    let vowel = "aiueo";  
    for (const v of str) {
        if (vowel.indexOf(v) >= 0){
            counter++;
        }
    }
    return counter;
}

console.log(getCount("o a kak ushakov lil vo kashu kakao"));