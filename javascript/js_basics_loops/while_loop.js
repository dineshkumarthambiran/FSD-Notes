let counter=1  // Initialization

while(counter<=10){
    counter++
    console.log(counter);
}


counter = 100
while(counter>=0){
    console.log(counter);
    counter-=2
}

let userInput = 123456
//654321

let sum = 0

// while(userInput>0){
//     sum = sum + userInput %10
//     userInput = parseInt(userInput / 10)
// }

console.log("*******************");
while(userInput>0){
    console.log(userInput % 10);
    userInput = parseInt(userInput / 10)
}

// console.log("Sum = "+sum);