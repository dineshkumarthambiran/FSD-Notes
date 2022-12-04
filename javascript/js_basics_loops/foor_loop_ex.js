let students = [
    {
        "sid":5544,
        "sname":"Vijay",
        "country":"India"
    },
    {
        "sid":4433,
        "sname":"Arun",
        "country":"India"
    },
    {
        "sid":5469,
        "sname":"Prem",
        "country":"India"
    },
    {
        "sid":7788,
        "sname":"Anant",
        "country":"India"
    },
    {
        "sid":5654,
        "sname":"Bharath",
        "country":"India"
    }
]


let marks = [80,85,75,78,65,87,95,55, 35,78,95]

for(let counter=1 ; counter<=10; counter++){
    console.log(counter);
}

// ++, --, +=, -=

for(let counter=10; counter>=0; counter-=2){
    console.log(counter);
}

console.log("************************************");
for(let index = 0; index<marks.length; index++){
    console.log(marks[index]);
}

console.log("************************************");
for(let m of marks){
    console.log(m);
}

console.log("************************************");
for(let index in marks){
    console.log(index);
}

console.log("************************************");
for(let student of students){
    console.log(student);
}