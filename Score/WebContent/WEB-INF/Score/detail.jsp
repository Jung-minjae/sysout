<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border=1>
		<tr>
			<td>지역번호</td>
			<td>${li.userid}</td>	
		</tr>
		<tr>
			<td>지역명</td>
			<td>${li.locname1}</td>

		</tr>
		<tr>
			<td>메이커</td>
			<td>${li.maker}</td>
			<td>플래그</td>
			<td>${li.flag}</td>
		</tr>
		
	</table>
</body>
</html>