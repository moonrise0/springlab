<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div class="col-sm-8 text-left">
    <div class="container">
        <h3>Map Center</h3>
        <img src="/uimg/${gmarker.img}">
        <h4>${gmarker.id}</h4>
        <h4><a href="${gmarker.target}">${gmarker.title}</a></h4>

        <div class="row content">
            <div class="col-sm-6  text-left ">
                <h3>Cust All Page</h3>
                <table class="table table-hover">
                    <thead>
                    <tr>
                        <th>ID</th>
                        <th>PWD</th>
                        <th>NAME</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach var="m" items="${mlist}">
                        <tr>
                            <td><img src="/uimg/${m.imgname}"></td>
                            <td>${m.pwd}</td>
                            <td>${m.name}</td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </div>
        </div> <!-- -->



    </div>
</div>
