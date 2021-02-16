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
	function checkYN() {
		let fm = document.check;
		fm.action = "scorelist";
		fm.method = "post";
		let yn = confirm("정말 삭제하시겠습니까?");
		console.log(yn);
		if (yn == true) {
			fm.submit();
		} else {

		}
	}
</script>
</head>
<body>

<form>
	<select name="f">
	<option ${(param.f == "id")?"selected":""} value = "id"> 지역번호 1~3 </option>
	</select>
	<label>검색어</label>
	<input type = "text" name="q" value = "${param.q}"/>
	<input type = "submit" value ="Search"/>
</form>


<!-- list -->
<form method="post">
   <table border=1>
   
      <tr>
         <td>LOCATION</td>
         <td>REGDATE</td>
         <td>NAME</td>
         <td>ENEMY</td>
         <td>CONTENT</td>
         <td>공개</td>
		 <td>삭제</td>
      </tr>
      <c:forEach var="n" items="${n}">
      <tr>
         <td><a href ="detail?id=${n.maker}">${n.location}</a></td>
         <td>${n.date}</td>
         <td>${n.name}</td>
         <td>${n.enemy}</td>
         <td>${n.content}</td>
       	 <td><input type="checkbox" name="open" value="${n.seq}"></td>
		 <td><input type="checkbox" name="del" value="${n.seq}"></td>
      </tr>
      </c:forEach>
   </table>
		<!-- 삭제버튼 -->
		<input type= "submit"  name= "cmd" value="일괄공개" />
		<input type= "submit"  name= "cmd" value="일괄삭제" />
		<input type= "button"  onclick="location.href('reg')" value="글쓰기" />
	</form>


    <!-- 복붙 -->
    
   	<c:set var="page" value="${empty param?1:param.p}"></c:set>
	<c:set var="startNum" value="${page-(page-1)%5}"></c:set>
	<c:set var="LastNum" value="${fn:substringBefore(Math.ceil(count/10), '.')}"></c:set>
	

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