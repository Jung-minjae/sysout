<%@page import="com.jdbc.app.entity.Notice"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<% %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form>
	<select name="f">
	<option ${(param.f == "title")?"selected":""} value = "title">제목</option>
	<option ${(param.f == "writer_id")?"selected":""} value = "writer_id">글쓴이</option>
	
	</select>
	<label>검색어</label>
	<input type = "text" name="q" value = "${param.q}"/>
	<input type = "submit" value ="Search"/>
</form>

<!-- list -->
	<table border=1>
		<tr>
			<td>번호</td>
			<td>제목</td>
			<td>작성자</td>
			<td>작성일</td>
			<td>조회수</td>
		</tr>
		<%--
		<%
		List<Notice> list = (List<Notice>) request.getAttribute("noticeList");
		for (Notice nt : list) {
			pageContext.setAttribute("n", nt);
		%>
		--%>

		<c:forEach var="n" items="${noticeList}" varStatus="t">
			<tr>
				<td>${n.id }</td>
				<td><a href="detail?id=${n.id}&p=${param.p}&f=${param.f}&q=${param.q}">${n.title}</a></td>
				<td>${n.writer_id}</td>
				<td>${n.regdate}</td>
				<td>
				<fmt:formatNumber type="number" pattern="###,###" value="${n.hit}">
<%-- 			<fmt:formatNumber type="currency" currencySymbol="원" value="${n.hit}"></fmt:formatNumber> --%>
				</fmt:formatNumber>
				</td>


			</tr>

			<%-- <% }%> --%>
		</c:forEach>
	</table>
	<!-- 변수 선언 및 값 할당 -->
	<c:set var="page" value="${empty param?1:param.p}"></c:set>
	<c:set var="startNum" value="${page-(page-1)%5}"></c:set>
	<c:set var="LastNum" value="${fn:substringBefore(Math.ceil(count/10), '.')}"></c:set>
	
	LastNum: ${LastNum}
	<!-- 현재 페이지 -->
	<div>
	<h3> 현재 페이지</h3>
	<div><span>${(empty param.p)?1:param.p}</span>/${LastNum} pages</div>
	</div>
	<!-- 페이지 이동 -->

	<!-- prev -->
	<c:if test="${startNum > 1}">

		<a href="?p=${startNum-1}&f=${param.f}&q=${param.q}">Prev</a>

	</c:if>
	<c:if test="${startNum <=1 }">
		<a href="#" onclick="alert('첫 페이지 입니다.')">Prev</a>
	</c:if>
	<ul>


		<c:forEach var="i" begin="0" end="4">
		<c:if test="${param.p == (startNum+i)}">
			<c:set var="style" value="font-weight:bold; color:red;" />
		</c:if>
				<c:if test="${param.p != (startNum+i)}">
			<c:set var="style" value="" />
		</c:if>
			
			<c:if test="${(startNum+i)<=LastNum}">
			<li><a style ="${style}"href="?p=${startNum+i}&f=${param.f}&q=${param.q}">${startNum+i}</a></li>
			</c:if>
		</c:forEach>
	</ul>
	<!-- next -->

	<c:if test="${startNum+5 <= LastNum}">

		<a href="?p=${startNum+5}&f=${param.f}&q=${param.q}">Next</a>

	</c:if>
	<c:if test="${startNum+5 > LastNum}">
		<a href="#" onclick="alert('마지막 페이지 입니다.')">Next</a>
	</c:if>
</body>
</html>