var chair = document.querySelectorAll("div.ch_size")
var chair_num = document.querySelector("#chairnum")
var firstname = document.querySelector("#fname")
var lastname = document.querySelector("#lname")
var id_input = document.querySelector("#idnum")
var sendbutton = document.querySelector("#send_btn")

for ( var i = 0 ; i < chair.length ; i++){
    chair[i].addEventListener('click', reserve)
}

function reserve(event){
    event.preventDefault();
    var reserved = this.classList.contains('res');
    if(reserved){
        window.alert("این صندلی رزرو شده است");
    }else{
        this.classList.add('res');
        chair_num.value = this.id
    }
}

sendbutton.addEventListener('click', function(){
    if(firstname.value.length < 1){
        window.alert("فیلد نام نباید خالی باشد");
    }else if(lastname.value.length < 1){
        window.alert("فیلد نام خانوادگی نباید خالی باشد");
    }else if(id_input.value.length != 10){ //id_input.value.length < 1 || id_input.value.length > 10
        window.alert("کد ملی باید درست وارد شود");
    }else if(chair_num.value.length < 2){
        window.alert("صندلی خود را انتخاب نکرده اید");
    }else{
        window.alert("بلیط رزرو شد");
    }
})