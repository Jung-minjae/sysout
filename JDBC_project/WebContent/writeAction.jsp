<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="contents.ContentsDao"%>
<%@page import="java.io.PrintWriter"%>
<%
request.setCharacterEncoding("UTF-8");
%>
<jsp:useBean id="contents" class="contents.Contents" scope="page" />
<jsp:setProperty name="contents" property="title" />
<jsp:setProperty name="contents" property="content" />

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	//현재 세션체크
			String userID = null;
			if(session.getAttribute("userID") != null){
		userID = (String)session.getAttribute("userID");
			}//로그인 한 사람만 글쓰기 가능
			if(userID == null){
		PrintWriter script = response.getWriter();
		script.println("<script>");
		script.println("alert('로그인 후에 글을 쓰실 수 있습니다.')");
		script.println("location.href='login.jsp'");
		script.println("</script>");
			}else{
		//비정삭적으로 글쓰기를 완료하려고함
		if(contents.getTitle()==null||contents.getContent()==null){
			PrintWriter script = response.getWriter();
			script.println("<script>");
			script.println("alert('제목 혹은 내용이 입력되지 않았습니다.')");
			script.println("history.back();");
			script.println("</script>");
		}else{
			//정상적으로 글쓰기를 완료함
			ContentsDao cd =new ContentsDao();
			int result = cd.write(contents.getTitle(), userID, contents.getContent());
			if(result==-1){ //db오류
		PrintWriter script = response.getWriter();
		script.println("<script>");
		script.println("alert('글쓰기에 실패였습니다.')");
		script.println("history.back();");
		script.println("</script>");
			}else{
		PrintWriter script = response.getWriter();
		script.println("<script>");
		script.println("alert('글이 등록되었습니다.')");
		script.println("location.href='board.jsp'");
		script.println("</script>");
			}
		}
			}
	%>

</body>
</html>