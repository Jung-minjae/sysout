<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method ="post" action = "TableAction.jsp">
		<table>

			<tr>
				<td><label for="username">이름 </label></td>
				<td><input id="username" type="text" name="username"></td>
			</tr>
			<tr>
				<td>성별</td>



				<td><input id="man" type="radio" name="gender" value="남자">
					<label for="man">남자</label> 
					<input id="woman" type="radio"
					name="gender" value="여자"> <label for="woman">여자</label></td>
			</tr>
		</table>
		<input type="submit" value="가입">
	</form>
</body>
</html>