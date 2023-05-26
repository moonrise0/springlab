<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/fullcalendar@5.10.1/main.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/fullcalendar@5.10.1/main.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/moment.js/2.18.1/moment.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/fullcalendar@5.10.1/locales-all.js"></script>



<style>
    #calendar {
        width: 1500px;
        height: 1500px;
    }
</style>

<script>
    document.addEventListener('DOMContentLoaded', function() {
        var calendarEl = document.getElementById('calendar');
        // new FullCalendar.Calendar(대상 DOM객체, {속성:속성값, 속성2:속성값2..})

        var calendar = new FullCalendar.Calendar(calendarEl, {
            headerToolbar: {
                left: 'prev,next today',
                center: 'title',
                right: 'dayGridMonth,timeGridWeek,timeGridDay'
            },
            initialDate: '2021-04-12', // 초기 로딩 날짜.
            navLinks: true, // can click day/week names to navigate views
            selectable: true,
            selectMirror: true,
            // 이벤트명 : function(){} : 각 날짜에 대한 이벤트를 통해 처리할 내용..
            select: function(arg) {
                console.log(arg);

                var title = prompt('입력할 일정:');
                // title 값이 있을때, 화면에 calendar.addEvent() json형식으로 일정을 추가
                if (title) {
                    calendar.addEvent({
                        title: title,
                        start: arg.start,
                        end: arg.end,
                        allDay: arg.allDay,
                        backgroundColor:"yellow",
                        textColor:"blue"
                    })
                }
                calendar.unselect()
            },
            eventClick: function(arg) {
                // 있는 일정 클릭시,
                console.log("#등록된 일정 클릭#");
                console.log(arg.event);

                if (confirm('Are you sure you want to delete this event?')) {
                    arg.event.remove()
                }
            },
            editable: true,
            dayMaxEvents: true, // allow "more" link when too many events
            events:
            //================ ajax데이터 불러올 부분 =====================//
        });

        calendar.render();
    });
</script>
<%--맨 위에 사진 부분--%>




<div id='calendar'></div>



