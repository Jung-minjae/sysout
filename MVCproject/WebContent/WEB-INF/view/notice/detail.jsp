<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- title -->
	<!-- writer_id -->
	<!-- regdate -->
	<!-- content -->
	<!-- hit -->
	<table border=1>
		<tr>
			<td>제목</td>
			<td colspan="3">${nt.title}</td>
		</tr>
		<tr>
			<td>작성일</td>
			<td colspan="3"><fmt:formatDate pattern="yyyy.MM.dd. hh:mm"
					value="${nt.regdate}" /></td>

		</tr>
		<tr>
			<td>작성자</td>
			<td>${nt.writer_id}</td>
			<td>조회수</td>
			<td><fmt:formatNumber type="number" pattern="###,###"
					value="${nt.hit}" /></td>
		</tr>
		<tr>
			<td>첨부파일</td>
			<td colspan="3"><c:forTokens var="fileName" items="${nt.files}"
					delims="," varStatus="t">
					<c:set var="style" value="" />
					<c:if test="${fn:endsWith(fileName, '.zip')}">
						<c:set var="style" value="font-weight:bold; color:red;" />
					</c:if>


					<a href="${fileName}" style="${style}">${fn:toUpperCase(fileName)}</a>
					<c:if test="${!t.last}">
			/
			</c:if>

				</c:forTokens></td>
		</tr>
		<tr>

			<td colspan="4">${nt.content}</td>
		</tr>
	</table>
	<!-- 목록 버튼 -->
	<input type="button"
		onclick="location.href='list?f=${param.f}&q=${param.q}&p=${param.p}'"
		value="목록">
	<input type="button" onclick="" value="수정">
	<input type="button"
		onclick="location.href='delete?f=${param.f}&q=${param.q}&p=${param.p}'"
		value="삭제">

	<form action="detail" method="post">
		<input type="hidden" name="pageID" value="${param.id}">
		<table border=1>
			<tr>
				<th>
					<!-- 글쓴이 = 로그인 한사람 --> 
					<input type="hidden" name="writeid"	value="정민재">

				</th>
				<td><input type="text" name="comment" />
				<!-- comment --></td>
				<td><input type="submit" value="등록" /> <!-- date --></td>
			</tr>
		</table>
	</form>

	<c:set var="cnt" value="${count}" />
	<c:if test="${cnt==0}">
	<h3>댓글이없습니다</h3>
	</c:if>
	<c:if test="${cnt!=0}"> 
	
		<table border=1>
			<c:forEach var="cl" items="${comList}" varStatus="st">
				<tr>
					<th>
						${cl.writer_id}
					</th>
					<td>
						${cl.comment}
					</td>
					<td>
						${cl.regdate}
					</td>
				</tr>
			</c:forEach>
		</table>
	</c:if>
	
</body>
</html>