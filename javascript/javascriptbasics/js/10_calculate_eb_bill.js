var units = 100, amount

if(units > 500)
    amount = units * 7
else if(units > 400)
    amount = units * 6 
else if(units >= 300)
    amount = units * 5.5
else
    amount = units * 4.5

console.log("Amount payable: "+amount);