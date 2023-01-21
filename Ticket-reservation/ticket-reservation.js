var chair = document.querySelectorAll("div.ch_size")

for ( var i = 0 ; i < chair.length ; i++){
    chair[i].addEventListener('click', reserve)
}

function reserve(){
    var reserved = this.classList.contains('res');
    if(reserved){
        window.alert("این صندلی رزرو شده است");
    }

    this.classList.add('res');
}