<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>글쓰기</h2>
	<form method="post" action="reg">
		<table border=1>
			<tr>
				<th>지역번호</th>
				<td colspan="3"><input type="text" name="Locid"></td>
			</tr>
			<tr>

				<th>적</th>
				<td><input type="text" name="Enemy" /></td>

			</tr>
			<tr>
				<th>처리자</th>
				<td><input type="text" name="Hiter" /></td>
			</tr>

			<tr>

				<th>내용</th>
				<td><input type="text" name="content" /></td>
			</tr>

			<tr>
				<th>memo</th>
				<td><input type="text" name="memo" /></td>
			</tr>

			<tr>
				<td colspan="3"><input type="checkbox" name="open" value="true">
					<label for="open">바로공개</label></td>
			</tr>
		</table>
		<input type="submit" value="등록"> <a href="list">취소</a>
	</form>
</body>
</html>