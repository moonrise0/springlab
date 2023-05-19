<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>

<script>
    let review = {
        init : ()=>{
            //삭제버튼이라고 되어있지만 사실상 숨김버튼
            $('.btn-danger').click(function() {
                console.log($(this).closest('tr').find('td:eq(0)').text());
                let id = $(this).closest('tr').find('td:eq(0)').text();
                $.ajax({
                    url:'/cust/review/update?id='+id,
                    type: 'GET',
                }).done(
                    (data)=>{
                        console.log("success");
                        window.location.reload();
                    }
                ).fail(
                    ()=>{
                        console.log("failure");
                    }
                );
            });
        },
        delete : ()=>{
            $('#commitButton').click(()=>{
                $.ajax({
                    url:'/cust/review/delete'
                }).done(
                    (data)=>{
                        console.log("success");
                        window.location.reload();
                    }
                ).fail(
                    ()=>{
                        console.log("failure");
                    }
                );
            });
        },
        update : ()=>{
            $('#reviveButton').click(()=>{
                $.ajax({
                    url:'/cust/review/revive'
                }).done(
                    (data)=>{
                        console.log("success");
                        window.location.reload();
                    }
                ).fail(
                    ()=>{
                        console.log("failure");
                    }
                );
            });
        }
    }
    $(()=>{
        review.init();
        review.delete();
        review.update();
    })
</script>

<div class="colorlib-loader"></div>

<div id="page">


    <div class="breadcrumbs">
        <div class="container">
            <div class="row">
                <div class="col">
                    <p class="bread"><span><a href="index.jsp">Home</a></span> / <span>Men</span></p>
                </div>
            </div>
        </div>
    </div>

    <div class="breadcrumbs-two">
        <div class="container">
                    <div class="breadcrumbs-img">
                        <h2> 고객 리뷰 관리 </h2>
                        <h5> 구현 기능 : 오라클DB 전체 리뷰 데이터 불러오기 <br>Pain Point : 직원의 실수로 원장이 삭제되어 복원불가능하다면 심각한 문제 <br> Soluton : isHidden 칼럼 추가로 실수로 삭제한 데이터 되돌리기(Rollback-DML)</h5>
                    </div>
        </div>
    </div>
    <div  class="d-flex justify-content-center">
      <button id="commitButton"type="button" id="deleteConfirm"class="btn btn-danger btn-xs">삭제 확정</button>
      <button id="reviveButton"type="button" class="btn btn-success btn-xs">되돌리기</button>
    </div>
    <table class="table table-hover"style="text-align: center;width: 70%;margin: auto;">
        <thead>
            <tr>
                <th class="hidden-column">ID</th>
                <th>작성일</th>
                <th>고객명</th>
                <th>리뷰내용</th>
                <th>위반리뷰 삭제</th>
            </tr>
        </thead>
        <tbody>
        <c:forEach var="obj" items="${rlist}" >
            <tr>
                <td class="hidden-column">${obj.id}</td>
                <td>
                    <fmt:formatDate  value="${obj.rdate}" pattern="dd-MM-yyyy" /></td>
                <td>${obj.name}</td>
                <td>${obj.text}</td>
                <td><button id="button${obj.id}"type="button" class="btn btn-danger btn-xs">삭제</button>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>

</div>

<div class="gototop js-top">
    <a href="#" class="js-gotop"><i class="ion-ios-arrow-up"></i></a>
</div>
