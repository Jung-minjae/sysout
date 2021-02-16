<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    int num =3;
    String num_= request.getParameter("n");
   
    if(num_!=null &&!num_.equals(""))
    	num = Integer.parseInt(num_);
   
    String result;
    
    if(num%2==0){
    result = "짝수입니다.";
    }else{
    result ="홀수 입니다.";
    }
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="JSPMVC.jsp">
<div class ="form-group">
<input type ="text" name ="n" maxlength="20">
</div>
<input type ="submit" value="숫자입력">
</form>

<br >
<br >
<%=result %>
</body>
</html>