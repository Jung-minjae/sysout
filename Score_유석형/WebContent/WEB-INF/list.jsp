<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script type="text/javascript">
function checkYN(){
	let fm = document.check;
	fm.action="examlist";
	fm.method="post";
	let yn = confirm("정말로 삭제하시겠습니까?");
	console.log(yn);
	if(yn==true){
		fm.submit();
	}
}
</script>
</head>
<body onload="document.form.q.focus();">

<form name="form">
	<select name='f'>
		<option ${(param.f == "id")?"selected":""} value="id">지역번호</option>
	</select>
	<label>검색어</label>
	<input type = "text" name="q"/>
	<input type = "submit" value = "Search"/>
</form>

<form name = "check">
	<table border=1>
		<tr>
			<td>LOCATION</td>
			<td>REGDATE</td>
			<td>NAME</td>
			<td>ENEMY</td>
			<td>CONTENT</td>
		</tr>
		<c:forEach var="n" items="${list}">
		<tr>
			<td>${n.location}</td>
			<td><fmt:formatDate value="${n.date}" pattern="yyyy.MM.dd. hh:mm:ss"/></td>
			<td ><a href="examdetail?name=${n.id}">${n.name}</a></td>
			<td>${n.enemy}</td>
			<td>${n.content}</td>
			<td><input type="checkbox" name="c" value="${n.seq}"/></td>
		</tr>
		</c:forEach>
	</table>
		<input type="button" onclick ="checkYN()" value="삭제">
</form>

	<c:set var="page" value ="${(empty param.p)?1:param.p}"></c:set>
	<c:set var="startNum" value ="${page-(page-1)%5}"></c:set>
	<c:set var="lastNum" value ="${fn:substringBefore(Math.ceil(count/10), '.')}"></c:set>
	
	<div>
		<h3>현재 페이지</h3>
		<div><span>${(empty param.p)?1:param.p}</span>/ ${lastNum} pages</div>
		
	</div>

	<c:if test="${startNum > 1}">
		<a href="?p=${startNum-1}&f=${param.f}&q=${param.q}">Prev</a>
	</c:if>
	
	<c:if test="${startNum <= 1}">
		<a href="#" onclick="alert('첫 페이지입니다.')">Prev</a>
	</c:if>
		
		
	<ul>
		<c:forEach var="i" begin="0" end = "4">
		
			<c:if test="${param.p == (startNum+i)}">
				<c:set var="style" value="font-weight:bold; color:red; padding:30px;" />
			</c:if>
				
			<c:if test="${param.p != (startNum+i)}">
				<c:set var="style" value="font-weight:bold; color:blue; padding:30px;" />
			</c:if>

			<c:if test="${(startNum+i) <= lastNum}">
				<a style ="${style}" href="?p=${startNum+i}&f=${param.f}&q=${param.q}">${startNum+i}</a>
			</c:if>
		</c:forEach>
	</ul>

	<c:if test="${startNum+5 <= lastNum}">
		<a href="?p=${startNum+5}&f=${param.f}&q=${param.q}">Next</a>
	</c:if>
	<c:if test="${startNum+5 > lastNum}">
		<a href="#" onclick="alert('마지막 페이지입니다.')">Next</a>
	</c:if>
	
</body>
</html>