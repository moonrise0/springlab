let register_form = {
    init:() => {
        $("#register_btn").click( () => {
            register_forms_form.send();
        });
    },
    send:() => {
        $("#register_form").attr({
            'action':'/registerimpl',
            'method':'get'
        });
        $("#register_form").submit();
    }
};

$( () => {
    register_form.init();
});


// let login_form = {
//     init:function(){
//         $('#login_btn').click(function(){
//             login_form.send();
//         });
//     },
//     send:function(){
//         $('#login_form').attr({
//             'action':'/loginimpl',
//             'method':'post'
//         });
//         $('#login_form').submit();
//     }
// };



let jsp01 = {
    data:0,
    init:function(num){
        this.data = num;
        this.display();
    },
    display:function(){
        $('#jsp01').text(this.data+'');
    }
};

$(() => {
    jsp01.init(num);
});