<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!--  세션을 줄여서 서버의 부담을 줄이겠다는 뜻 -->
<%@ page session="false" %>

<h1> Member.jsp 파일!!</h1>

<c:forEach var="m" items="${ml}">
	${m.name} / ${m.age} <br>
</c:forEach>


