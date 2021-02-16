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
			<a class="navbar-brand" href="main">JSP Board</a>
		</div>
		<div class="collapse navbar-collapse"
			id="bs-example-navbar-collapse-1">
			<ul class="nav navbar-nav">
				<li><a href="main">메인</a></li>
				<li><a href="board">게시판</a></li>
			</ul>
			<%
            if(userID==null){           	        
            %>

			<ul class="nav navbar-nav navbar-right">
				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown" role="button" aria-haspopup="true"
					aria-expanded="false">접속하기<span class="caret"></span></a>
					<ul class="dropdown-menu">
						<li class="active"><a href="login">Login</a></li>
						<li><a href="join">Sign up</a></li>
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
						<li class="active"><a href="login">LogoutAction</a></li>
					</ul></li>
			</ul>
			<% }
          %>
		</div>
		
	</nav>
	<!-- nav 끝  -->
	<!-- main 시작 -->
	
	<div class ="container">
	<div class ="row">
	<table class ="table table-striped" style="text-align:center; border:1px solid #dddddd"> 
	<thead>
	<tr>
	<th style = "background-color:#eeeeee; text-align:center;">번호</th>
	<th style = "background-color:#eeeeee; text-align:center;">제목</th>
	<th style = "background-color:#eeeeee; text-align:center;">글쓴이</th>
	<th style = "background-color:#eeeeee; text-align:center;">날짜</th>
</tr>
</thead>
<tbody>
<%
                     ContentsDao ct = new ContentsDao();
                     ArrayList<Contents> list = ct.getList(pageNumber);
                     for(int i =0; i<list.size(); i++){
                        
                     
                  %>
                  <tr>
                     <td>
                        <%=list.get(i).getContentID() %>
                     </td>
                     <td>
                        <a href="view?contentID=<%= list.get(i).getContentID() %>">
                        <%=list.get(i).getTitle() %>
                        </a>
                     </td>
                     <td>
                        <%=list.get(i).getUserID() %>
                     </td>
                     <td>
                        <%=list.get(i).getDate().substring(0,11)+list.get(i).getDate().substring(11,13)+"시"
                        + list.get(i).getDate().substring(14,16)+"분" %>
                     </td>
                  </tr>
                  <%
                  }
                  %>
	    </tbody>
            </table>
            <!--  페이징 처리 -->
			<%
			if(pageNumber !=1){
				
			
			%> 
			<a href ="board?pageNumber=<%=pageNumber -1 %>"
			class ="btn btn-success btn-arraw-left">Pre
			</a>           
            <%} %>
            <%
            if(ct.nextPage(pageNumber+1)){
                                  
            %>
          	<a href ="board?pageNumber=<%=pageNumber +1 %>"
			class ="btn btn-success btn-arraw-left">Next
			</a>
			<%} %>
            <!-- 글쓰기 버튼 -->
            <a href="write" class ="btn btn-primary pull-right">글쓰기</a>
         </div>
      </div>
   </body>
</html>