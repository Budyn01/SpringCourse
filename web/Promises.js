// function readData() {
//     const xhr = new XMLHttpRequest();
//     xhr.open('GET', 'https://jsonplaceholder.typicode.com/posts');
//     xhr.onload = function() {
//         if(this.status === 200) {
//             console.log(JSON.parse(this.responseText));
//         }
//     };
//     xhr.send();
// }
//
// readData();
// console.log("Siema");

// const promise = new Promise((resolve, reject) => {
//     const xhr = new XMLHttpRequest();
//     xhr.open("GET", 'https://jsonplaceholder.typicode.com/posts');
//     xhr.addEventListener('load', () => resolve(JSON.parse(xhr.responseText)));
//     xhr.addEventListener('error', () => reject(JSON.parse(xhr.statusText)));
//     xhr.send();
// });
//
// promise.then((res) => {
//     for (let obj in res) {
//         console.log(res[obj].title);
//     }
// });


console.log("!!null: " + (!!null));
console.log("!!undefined: " + (!!undefined));
console.log("!![]: " + (!![]));
console.log("!!1: " + (!!'1'));

console.log("1 == '1': " + (1 == '1'));
console.log("1 === '1': " + (1 === '1'));

console.log("undefined == null: " + (null == undefined));
console.log("undefined === null: " + (null === undefined));
console.log("undefined == false: " + (false == undefined));
console.log("undefined === false: " + (false === undefined));
console.log("null == false: " + (false == null));
console.log("null == true: " + (true == null));
console.log("null === false: " + (false === null));
console.log("null === true: " + (true === null));
console.log("null === 0: " + (0 === null));
console.log("null == 0: " + (0 == null));
