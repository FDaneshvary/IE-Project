var chair = document.querySelectorAll("div.ch_size")

for ( var i = 0 ; i < chair.length ; i++){
    chair[i].addEventListener('click', reserve)
}

function reserve(){
    var reserved = this.classList.contains('res');
    if(reserved){
        window.alert("is reserved! you can not reserve this chair.");
    }

    //prompt("Are you sure to reserve " + this.name + " seat?");
    //prompt("Are you sure to reserve this seat?");
    this.classList.add('res');
}