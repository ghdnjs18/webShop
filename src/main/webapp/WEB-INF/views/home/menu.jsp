<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="resources/css/menu.css">
</head>
<body>
	<div align="center">
		<div>
			<br/>
		</div>
		<div>
			<ul>
				<li><a class="active" href="home.do">Home</a></li>
				
				<c:if test="${id eq null}">
					<li><a href="loginForm.do">Log In</a></li>
					<li><a href="#">Sign Up</a></li>
					<li><a href="#">Notice</a></li>
					<li><a href="#">Product</a></li>
					<li><a href="#">Service</a></li>
				</c:if>
				
				<c:if test="${id != null}">
					<li><a href="memberLogout.do">Log Out</a></li>
					<li><a href="#">My Info</a></li>
					<li><a href="#">Notice</a></li>
					<li><a href="#">Product</a></li>
					<li><a href="#">Service</a></li>
				</c:if>
				
				<c:if test="${author eq 'ADMIN'}">
					<li><a href="#">Members</a></li>
				</c:if>
			</ul>
		</div>
	</div>
</body>
</html>