<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<div class="col-sm-2 sidenav">
  <p><a href="/pic">pic</a></p>
  <c:if test="${logincust !=null}"></c:if>
  <p><a href="/websocket">Websocket</a></p>
  <p><a href="#">Link</a></p>
</div>
