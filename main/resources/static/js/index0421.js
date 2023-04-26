// let login_form = {
//
//     $(function (){
//         login_form.init();
//     });
// init:function(){
//     $('#login_btn').click(function (){
//         login_form.send();
//     });
// },
//
// send:function(){
//     $('#login_form').attr({
//         'action':'/loginimpl',
//         'method':'post'
//     });
//     $('#login_form').submit();
// }
// };
//
// let register_form = {
//     init:function (){
//         $('#register_btn').click(function(){
//             register_form.send();
//         });
//     },
//     send:function (){
//         $('#register_form').attr({
//             'action':'/registerimpl',
//             'method':'post'
//         });
//         $('#register_form').submit();
//     }
// }
//
// let jsp01 = {
//     data:0,
//     init:function(){
//         this.data = num;
//
//         // this.data = ${num};
//         // this.data = '<c:out value="${num}"/>';
//         this.display();
//     },
//     display:function(){
//         $('#jsp01').text(this.data+'');
//     }
// };