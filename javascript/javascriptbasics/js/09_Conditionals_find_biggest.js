var a = 75, b = 75, c = 57

console.log("Program to find the biggest among 2");

// if(a > b){
//     console.log("A is the biggest");
// }
// else if(a < b){
//     console.log("B is the biggest");
// }
// else{
//     console.log("Both are equal");
// }

if(a > b){
    if(a > c){
        console.log("A is the biggest");
    }
    else{
        console.log("C is the biggest");
    }
}
else{
    if(b > c){
        console.log("B is the greatest");
    }
    else{
        console.log("C is the greatest");
    }
}