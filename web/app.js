function isPrime(n) {
    var divisor = 3,
        limit = Math.sqrt(n);

    if(n === 2 || n === 3)
        return true;
    if(n % 2 === 0)
        return false;

    while(divisor <= limit) {
        if(n % divisor === 0)
            return false;
        else
            divisor += 2;
    }

    return true;
}
function primeFactors(n) {
    var factors = [],
        divisor = 2;

    while(n > 2) {
        if(n % divisor === 0) {
            factors.push(divisor);
            n /= divisor;
        } else
            divisor++
    }
    return factors;
}
function fibonacci(n) {
    var n1 = 1;
    var n2 = 1;

    for(var i = 0; i < n - 1; i++) {
        var temp = n1;
        n1 = n2;
        n2 += temp;
    }

    return n1;
}
function greatestCommonDivisor(a, b){
    if(b == 0)
        return a;
    else
        return greatestCommonDivisor(b, a%b);
}
function removeDuplicate(arr) {
    var exists = {},
        outArray = [],
        elm;

    for(var i = 0; i < arr.length; i++) {
        elm = arr[i];
        if(!exists[elm]) {
            outArray.push(elm);
            exists[elm] = true;
        }
    }
    return outArray;
}
function mergeSortedArray(a, b) {
    var outArray = [],
        aI = 0,
        bI = 0;

    for(var i = 0; i < a.length + b.length; i++) {
        if(a[aI] < b[bI]) {
            outArray.push(a[aI++]);
        } else {
            outArray.push(b[bI++]);
        }
    }
}


