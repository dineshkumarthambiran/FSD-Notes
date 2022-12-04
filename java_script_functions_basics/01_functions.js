// Function with no argument and no return type
function doSomething(){
    console.log("Helo world");
    console.log("Welcome to JS functions");
    console.log("The end");
}

function addNumbersAndDisplay(num1, num2){
    let result = num1+num2
    console.log("Sum = "+result);
}

function getName(){
    console.log("Hello");
    return "Vignesh"
}

function getNameLength(yourName){
    return yourName.length
}

//Calling (executing) the function
// doSomething()
// addNumbersAndDisplay(500,600)
// let authorName = getName()
// console.log(getName());
console.log("Your name length: "+(getNameLength(getName())));
