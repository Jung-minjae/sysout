<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP Board</title>
</head>
<body>
<%

session.invalidate();

%>
<script>
alert('로그아웃 하셨습니다.');
location.href ="login.jsp";
</script>
</body>
</html>