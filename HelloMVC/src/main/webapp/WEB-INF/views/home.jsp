<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!--  세션을 줄여서 서버의 부담을 줄이겠다는 뜻 -->
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello MVC! 
</h1>

<P>  The time on the server is ${serverTime}. </P>
<P>  item1 is ${item1} <br>

	id=<%= request.getParameter("id") %><br>
	name= ${param.name} <br>
	
</body>
</html>
