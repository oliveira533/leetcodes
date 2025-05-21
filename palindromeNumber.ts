function isPalindrome(x: number): boolean {
    let parsedNumber: string = "";
    let op: string = "";
    parsedNumber = `${x}`
    const list = parsedNumber.split('');
    let  invert: string = "";
    invert+= op;
    for(let i = list.length - 1; i >= 0; i--){
        invert += list[i];
    }

    if(invert == x.toString()){
        return true
    }

    return false
};

const result = isPalindrome(-121);

console.log(result);