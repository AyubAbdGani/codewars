function stat(strg) {
    if (strg === "") return "";

    let split = strg.split(",");

    let arr = [];
    for (const v of split) {
        let time = v.split("|");

        arr.push(Number(time[0]) * 3600 + Number(time[1]) * 60 + Number(time[2])) ;
        
    }
    
    let size = arr.length;
    arr.sort((a,b) => a-b);

    let range = Math.max(...arr) - Math.min(...arr);
    let mean = parseInt(arr.reduce(function(a,b) {
        return a+b;
    }, 0) / size);

    let median = size % 2 === 0 ? parseInt( (arr[size/2-1] + arr[size/2]) / 2) : arr[parseInt((size-1)/2)];
    
    return `Range: ${parseInt(range/3600).toString().padStart(2,'0')}|${parseInt((range % 3600) / 60).toString().padStart(2,'0')}|${(range % 60).toString().padStart(2,'0')} ` + 
    `Average: ${parseInt(mean/3600).toString().padStart(2,'0')}|${parseInt((mean % 3600) / 60).toString().padStart(2,'0')}|${(mean % 60).toString().padStart(2,'0')} ` +  
    `Median: ${parseInt(median/3600).toString().padStart(2,'0')}|${parseInt((median % 3600) / 60).toString().padStart(2,'0')}|${(median % 60).toString().padStart(2,'0')}` ;
}

console.log(stat("01|15|59, 1|47|16, 01|17|20, 1|32|34, 2|17|17"));