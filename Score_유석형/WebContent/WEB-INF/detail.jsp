<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border = 1>
		<tr>
			<td>ID</td>
			<td colspan="3">${u.id}</td>
		</tr>
		
		<tr>
			<td>이름</td>
			<td colspan="3">${u.name}</td>
		</tr>
		
		<tr>
			<td>E-mail</td>
			<td colspan="3">${u.email}</td>
		</tr>			
	</table>
</body>
</html>