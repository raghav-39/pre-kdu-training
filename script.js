
let index = 0;
function plusfunction(){
    index++;
    document.getElementsByClassName("counter")[0].innerHTML = index;

}
function minusfunction(){
    index--;
    if(index<0){
    // index = 0;
    index = 0;
    document.getElementsByClassName("counter")[0].innerHTML = 0;
    }
    else{
    document.getElementsByClassName("counter")[0].innerHTML = index;
    }

}
function resetFunction(){
    document.getElementsByClassName("counter")[0].innerHTML = 0;
    index = 0;
}