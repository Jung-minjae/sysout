<%@page import="com.Home_work.app.entity.Temp_N"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border=1>
		<tr>
			<td>날짜</td>
			<td>온도</td>
			<td>지역번호</td>
			<td>작성자</td>
	
		</tr>


		<%
		List<Temp_N> list = (List<Temp_N>)request.getAttribute("TempList");
		for (Temp_N tn : list) {
			pageContext.setAttribute("t", tn);
		%>
		<tr>
			<td><a href ="tempdetail?date=${t.date}">${t.date }</td>
			<td>${t.temp}</a></td>
			<td>${t.locID}</td>
			<td>${t.writer}</td>
			<%
			}
			%>
		</tr>

	</table>
	<div>
		<form id="next" action="/list">
			<input type="submit" name="next" onclick="" value="1">다음
	</div>
	<div>
		<form id="prev" action="/list">
			<input type="submit" name="prev" onclick="" value="-1">이전
	</div>

</body>
</html>