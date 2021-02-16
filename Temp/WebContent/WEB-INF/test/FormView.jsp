<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<td>이름</td>
			<td>
				${form.name}</td>
		</tr>

		<tr>
			<td>등록일</td>
			<td>
				${form.regDate}
		</tr>
		<tr>
			<td>email</td>

			<td>
				${form.email}
			</td>
		</tr>


	</table>

</body>
</html>