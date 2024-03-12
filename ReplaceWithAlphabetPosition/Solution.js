//Link : https://www.codewars.com/kata/546f922b54af40e1e90001da

function alphabetPosition(text) {
    return text.split('').map((b) => (b)).filter((b) => b.match(/^[a-zA-Z]+$/) !== null).map((b) => b === b.toUpperCase() ? b.charCodeAt(0) - 64 : b.charCodeAt(0) - 96).join(" ");
}

const aaa = (text) =>text.toUpperCase().replace(/[^A-Z]/g, '').split('').map(ch => ch.charCodeAt(0) - 64).join(' ');

console.log(aaa("Hey0"));