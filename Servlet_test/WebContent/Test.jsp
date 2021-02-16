<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
int num = 0;
int sum = 0;

String num_ = request.getParameter("n");
if (num_ != null && !num_.equals(""))
	num = Integer.parseInt(num_);

for (int i = 0; i <= num; i++) {
	sum += i;
}
String result;

if (sum % 2 == 0) {
	result = "짝수입니다.";
} else {
	result = "홀수 입니다.";
}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="Test.jsp">
		<div class="form-group">
			<input type="text" name="n" maxlength="70">
		</div>
		<input type="submit" value="숫자입력">
	</form>

	<br>
	<br>
	<%=sum%>
	<%=result%>
	
</body>
</html>