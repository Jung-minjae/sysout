<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <% 
     
    request.setCharacterEncoding("utf-8");
    String multiple = request.getParameter("multiple");
    int num = Integer.parseInt(multiple);   
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
   <table border=1>
      <%
      for(int i =1; i<=9;i++){%>
      <tr><td><%=num %> X <%=i %>=<%=num*i %></td></tr>
      <%} %>
   </table>
</body>
</html>