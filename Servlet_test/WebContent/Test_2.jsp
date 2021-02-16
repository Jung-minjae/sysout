<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
request.setCharacterEncoding("UTF-8");
String name = request.getParameter("name");
String email =request.getParameter("email");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="Test_2.jsp">
		<div class="form-group">
			<input type="text" name="name" maxlength="70">
			<div>
			</div>
			<br>
			<input type="email" name="email" maxlength="70">
		</div>
		<input type="submit" value="입력">
	
	</form>

</body>

</html>