function changeText(){
    let firstPara = document.getElementById("firstPara")
    console.log("Old Text: "+firstPara.innerText);
    firstPara.innerText = "New Text!!!"
    console.log("New Text: "+firstPara.innerText);
}

function showAlert(){
    let firstPara = document.getElementById("firstPara")
    alert(firstPara.innerText)
}

function validate(){
    let userName = document.getElementById("userName")
    let password = document.getElementById("password")

    // console.log(userName.value);
    // console.log(password.value);

    if(userName.value=="Vignesh" && password.value == "Vignesh"){
        alert("Login Success")
    }
    else{
        alert("Login failed!")
    }
}

let result = ""
let num1=0, num2=0
function add(){
    num1 = parseInt(document.getElementById("num1").value)
    num2 = parseInt(document.getElementById("num2").value)

    result = "Sum = "+(num1+num2)

    let output = document.getElementById("output")
    output.innerText = result

}