<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="UTF-8"%>
	<%@ page import = "java.io.PrintWriter" %>
	<%@ page import = "java.util.ArrayList" %>
	<%@ page import = "contents.ContentsDao" %>
	<%@ page import = "contents.Contents" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content=width=divice-width ", initial-scale="1">
<link rel="stylesheet" href="css/bootstrap.css">
<script src="http://code.jquery.com/jquery-3.1.1.min.js"></script>
<script src="js/bootstrap.js"></script>
<title>JSP Board</title>
</head>
<body>
	<%
	String userID = null;
	if(session.getAttribute("userID") != null){
		userID = (String)session.getAttribute("userID");
	}
	
	int pageNumber = 1;
	if(request.getParameter("pageNumber")!=null){
		pageNumber=Integer.parseInt(request.getParameter("pageNumber"));
	}
	%>
	<nav class="navbar navbar-default">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle collapsed"
				data-togle="collapse" data-target="#bs-example-navbar-collapse-1"
				aria-expanded="false">
				<span class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="main.jsp">JSP Board</a>
		</div>
		<div class="collapse navbar-collapse"
			id="bs-example-navbar-collapse-1">
			<ul class="nav navbar-nav">
				<li><a href="main.jsp">메인</a></li>
				<li><a href="board.jsp">게시판</a></li>
			</ul>
			<%
            if(userID==null){           	        
            %>

			<ul class="nav navbar-nav navbar-right">
				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown" role="button" aria-haspopup="true"
					aria-expanded="false">접속하기<span class="caret"></span></a>
					<ul class="dropdown-menu">
						<li class="active"><a href="login.jsp">Login</a></li>
						<li><a href="join.jsp">Sign up</a></li>
					</ul></li>
			</ul>
			<%
            } else{
            	
            
            %>
			<ul class="nav navbar-nav navbar-right">
				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown" role="button" aria-haspopup="true"
					aria-expanded="false">회원관리<span class="caret"></span></a>
					<ul class="dropdown-menu">
						<li class="active"><a href="logoutAction.jsp">로그아웃</a></li>
					</ul></li>
			</ul>
			<% }
          %>
		</div>
		
	</nav>
	<!-- nav 끝  -->
	 <content>
        <video autoplay muted loop width="100%">

            <source src="mov/Trafic.mp4"
                    type="video/mp4">
        
        </video>
        
    </content>
   </body>
</html>
</html>