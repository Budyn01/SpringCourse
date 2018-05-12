function isPrime(n) {
    var divisor = 3,
        limit = Math.sqrt(n);

    if (n === 2 || n === 3)
        return true;
    if (n % 2 === 0)
        return false;

    while (divisor <= limit) {
        if (n % divisor === 0)
            return false;
        else
            divisor += 2;
    }

    return true;
}

function primeFactors(n) {
    var factors = [],
        divisor = 2;

    while (n > 2) {
        if (n % divisor === 0) {
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

    for (var i = 0; i < n - 1; i++) {
        var temp = n1;
        n1 = n2;
        n2 += temp;
    }

    return n1;
}

function greatestCommonDivisor(a, b) {
    if (b == 0)
        return a;
    else
        return greatestCommonDivisor(b, a % b);
}

function removeDuplicate(arr) {
    var exists = {},
        outArray = [],
        elm;

    for (var i = 0; i < arr.length; i++) {
        elm = arr[i];
        if (!exists[elm]) {
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

    for (var i = 0; i < a.length + b.length; i++) {
        if (a[aI] < b[bI]) {
            outArray.push(a[aI++]);
        } else {
            outArray.push(b[bI++]);
        }
    }
}

//True private method in JavaScript
var Employee = function (name, company, salary) {
    this.name = name || "";       //Public attribute default value is null
    this.company = company || ""; //Public attribute default value is null
    this.salary = salary || 5000; //Public attribute default value is null

    // Private method
    var increaseSalary = function () {
        this.salary = this.salary + 1000;
    }.bind(this);

    // Public method
    this.displayIncreasedSalary = function () {
        increaseSalary();
        console.log(this.salary);
    };
};

var emp1 = new Employee("John", "Pluto", 3000);
emp1.displayIncreasedSalary();


var globalVar = "abc";

(function outerFunction(outerArg) {
    var outerFuncVar = "x";
    (function innerFunction(innerArg) {
        var innerFuncVar = "y";
        console.log(
            "outerArg = " + outerArg + "\n" +
            "outerFuncVar = " + outerFuncVar + "\n" +
            "innerArg = " + innerArg + "\n" +
            "innerFuncVar = " + innerFuncVar + "\n" +
            "globalVar = " + globalVar);
    })(5);
})(7);

var mul = function (x) {
    return function (y) {
        return function (z) {
            return x * y * z;
        }
    }
};
console.log(mul(5)(2)(1));

/*
    Deleting array
 */

var arrayList = [1, 2, 3];
//  Method 1 - The references stay not deleted
arrayList = [];
//  Method 2
arrayList.length = 0;
//  Method 3
arrayList.splice(0, arrayList.length); // removes all from 0 to arrayLength
//  Method 4
while (arrayList.length) {
    arrayList.pop();
}


if (Object.prototype.toString.call(arrayList) === '[object Array]') {
    console.log('Array!');
}
console.log(Array.isArray(arrayList));

/*
    Delete operator is used for deleting object properties, doesn't affect variables,
    also doesn't work on prototype property
 */
var x = {foo: 1};

var f = function () {
    delete x.foo;
    console.log(x.foo);  // Undefined because the property is deleted
};

var Employee1 = {
    company: 'xyz'
};
var emp2 = Object.create(Employee);
delete emp2.company;        //  Nothing has changed!
console.log(emp2.company);  //  xyz

/*
    undefined x 1 in JavaScript
*/

var trees = ["redwood", "bay", "cedar", "oak", "maple"];
delete trees[3]; // Output is ["redwood", "bay", "cedar", undefined × 1, "maple"]

var ar = [];
ar[121] = "Elo";
console.log(ar.length);

var bar = true;
console.log(bar + 0);       //  1
console.log(bar + "xyz");   //  truezyx
console.log(bar + true);    //  2
console.log(bar + false)    //  1

// Run-Time function declaration

var foo = function () {
    console.log("Hi I am inside Foo");
};
// Parse-Time function declaration

barr(); // Call bar function here, It will not give an Error
function barr() {
    console.log("Hi I am inside Foo");
}

// Difference between method, constructor and function in JS

var obj = {
    helloWorld : function() {
        return "hello world, " + this.name;
    },
    name: 'John Carter'
};
obj.helloWorld(); // // "hello world John Carter"

// Singleto pattern in JS

var MyNameSpace = {};
MyNameSpace.Singleton = (function() {
    var singletonInstance;

    function constructor() {
        var privateVar1 = "Nishant";
        var privateVar2 = [1,2,3,4,5];

        function privateMethod1() {
            // code stuff
        }

        function privateMethod1() {
            // code stuff
        }
        return {
            attribute1: "Budyn",
            publicMethod : function() {
                console.log("Elo");
            }
        }
    }

    return {
        getInstance : function() {
            if(!singletonInstance) {
                singletonInstance = constructor();
            }
            return singletonInstance;
        }
    }
});

var deepClone = function(object) {
    var newObject = {};
    for(var key in object) {
        if(typeof object[key] === "object") {
            newObject[key] = deepClone(object[key]);
        } else {
            newObject[key] = object[key];
        }
    }


    return newObject;
};

'use strict';

var employee = {
    name: "Nishant"
};



(function()
{
    // 'use strict';
    //Freeze the object
    Object.freeze(employee);

// Seal the object
    Object.seal(employee);

    console.log(Object.isExtensible(employee)); // false
    console.log(Object.isSealed(employee));     // true
    console.log(Object.isFrozen(employee));     // true


    employee.name = "xyz"; // fails silently unless in strict mode
    employee.age = 30;     // fails silently unless in strict mode
    delete employee.name;  // fails silently unless it's in strict mode
    console.log(employee);
}());