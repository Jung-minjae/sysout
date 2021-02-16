<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="user.UserDao" %>
<%@page import="java.io.PrintWriter" %>
<% request.setCharacterEncoding("UTF-8"); %>
<jsp:useBean id="user" class="user.User" scope ="page" />
<jsp:setProperty name="user" property="userID" />
<jsp:setProperty name="user" property="userPASS" />
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>login Action</title>
	</head>
	<body>
		<%
		
		// 현재 세션 상태를 체크한다
		String userID = null;
		if(session.getAttribute("userID") != null){
			userID = (String)session.getAttribute("userID");
		}
		
		if(userID != null){
			PrintWriter script = response.getWriter();
			script.println("<script>");
			script.println("alert('이미 로그인이 되어 있습니다')");
			script.println("location.href='main.jsp'");
			script.println("</script>");
		}
		UserDao userdao = new UserDao();
		int result = userdao.login(user.getUserID(), user.getUserPASS());
		if(result==1){  //로그인 성공
			session.setAttribute("userID", user.getUserID());
			PrintWriter script = response.getWriter();
			script.println("<script>");
			script.println("location.href ='main.jsp'");
			script.println("</script>");
		}else if(result==0){  //패스워드 잘못 됨
			PrintWriter script = response.getWriter();
			script.println("<script>");
			script.println("alert('비밀번호를 잘못 입력하셨습니다.')");
			script.println("history.back()'");
			script.println("</script>");
		}else if(result==-1){  //가입되지 않은 아이디
			PrintWriter script = response.getWriter();
			script.println("<script>");
			script.println("alert('가입되지 않은 아이디입니다.')");
			script.println("history.back()'");
			script.println("</script>");	
		}else if(result==-2){  // db 오류
			PrintWriter script = response.getWriter();
			script.println("<script>");
			script.println("alert('DB 오류입니다..')");
			script.println("history.back()'");
			script.println("</script>");
		}
		%>
	</body>
</html>