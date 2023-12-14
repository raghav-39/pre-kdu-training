
let firstNumber = 0;
let secondNumber = 0;


function addition(){
    
    firstNumber = parseInt(document.getElementById("number1").value);
    secondNumber = parseInt(document.getElementById("number2").value);
    if(isNaN(firstNumber) || isNaN(secondNumber)){
        alert("Invalid Number");
        return;
    }
    const sum = firstNumber+secondNumber;
    document.getElementsByClassName("result")[0].innerHTML = sum;

    
}

function substract(){
    firstNumber = parseInt(document.getElementById("number1").value);
    secondNumber = parseInt(document.getElementById("number2").value);
    if(isNaN(firstNumber) || isNaN(secondNumber)){
        alert("Invalid Number");
        return;
    }
   
    const diff = firstNumber-secondNumber;
    document.getElementsByClassName("result")[0].innerHTML = diff;
}
function multiply(){
    firstNumber = parseInt(document.getElementById("number1").value);
    secondNumber = parseInt(document.getElementById("number2").value);
    if(isNaN(firstNumber) || isNaN(secondNumber)){
        alert("Invalid Number");
        return;
    }
    
    const mult = firstNumber*secondNumber;
    document.getElementsByClassName("result")[0].innerHTML = mult;
}
function divide(){
    firstNumber = document.getElementById("number1").value;
    secondNumber = document.getElementById("number2").value;
    if(isNaN(firstNumber) || isNaN(secondNumber)){
        alert("Invalid Number");
        return;
    }
    const first = parseFloat(firstNumber);
    const second = parseFloat(secondNumber);
    const div = first/second;
    document.getElementsByClassName("result")[0].innerHTML = div;
}