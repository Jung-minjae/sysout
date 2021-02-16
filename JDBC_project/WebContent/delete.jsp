<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.io.PrintWriter"%>
<%@ page import="contents.ContentsDao"%>
<%@ page import="contents.Contents"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- 화면 최적화 -->
<meta name="viewport" content="width-device-width" , initial-scale="1">
<!-- 루트 폴더에 부트스트랩을 참조하는 링크 -->
<link rel="stylesheet" href="css/bootstrap.css">
<title>JSP 게시판 웹 사이트</title>
</head>
<body>
	<%
   // 메인 페이지로 이동했을 때 세션에 값이 담겨있는지 체크
   String userID = null;
   if (session.getAttribute("userID") != null) {
      userID = (String) session.getAttribute("userID");
   }
      
   if(userID == null){  
       PrintWriter script =response.getWriter();
      script.println("<script>");
      script.println("alert('로그인을 하세요.')");
      script.println("location.href ='login.jsp'");
      script.println("</script>");
  }
   
   int contentID=0;
   if(request.getParameter("contentID")!=null){
      contentID = Integer.parseInt(request.getParameter("contentID"));
   }
   
   if(contentID ==0){ 
       PrintWriter script =response.getWriter();
      script.println("<script>");
      script.println("alert('유효하지 않은 글입니다.')");
      script.println("location.href ='main.jsp'");
      script.println("</script>");
   }
   
   Contents ct = new ContentsDao().getContents(contentID);
   
   if(!userID.equals(ct.getUserID())){
       PrintWriter script =response.getWriter();
       script.println("<script>");
      script.println("alert('해당 글을 수정/삭제할 권한이 없습니다.')");
      script.println("location.href ='main.jsp'");
      script.println("</script>");
   }else{//글삭제 수행
      
      ContentsDao cd = new ContentsDao();
   
    int result = cd.delete(contentID);
    
    if(result == -1){  //글삭제 실패
          PrintWriter script =response.getWriter();
          script.println("<script>");
         script.println("alert('글을 삭제 할 수 없습니다.')");
         script.println("history.back()");
         script.println("</script>");
    }else{ //글 삭제 성공
          PrintWriter script =response.getWriter();
          script.println("<script>");
         script.println("alert('글을 삭제하였습니다.')");
         script.println("location.href ='board.jsp'");
         script.println("</script>");
    }
   }
   
   %>


</body>
</html>