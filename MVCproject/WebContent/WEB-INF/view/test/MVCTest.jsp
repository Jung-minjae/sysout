<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%pageContext.setAttribute("result", "3");%>
</head>
<body>
	1. <%=request.getAttribute("result")%><br >
	2. ${requestScope.result}<br > 
	2-1.${pageScope.result}<br>
	3. ${b}<br>
	4. ${b<3} <br>
	5. ${b==null || b==""}<br>
	5-1. ${(b==null || b=="")?'값이 없습니다.':b}<br>
	6. ${empty b?'값이 없습니다.':b} <br>
</body>
</html>