<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%
	 request.setCharacterEncoding("utf-8");
	String num= "num_1";
	String num_1="";
	
	%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>

		<tr>
			<td><input type="button" name="num_1" value="1">
			
				<input type="button" name="num_2" value="2"> 
				
				<input type="button" name="num_3" value="3">
				
				
				</td>	
		</tr>
		<tr>
				<td>
				
				<input type="button" name="num_4" value="4">
			
				<input type="button" name="num_5" value="5"> 
				
				<input  type="button" name="num_6" value="6">
				</td>	
				</tr>
		<tr>
				<td>
				
				<input type="button" name="num_7" value="7">
			
				<input type="button" name="num_8" value="8"> 
			
				<input type="button" name="num_8" value="9">
			
				</td>
				<tr>
				<td>
				<input type="button" name="num" value="0">
			
				<input type="button" name="num" value="+"> 
				
			
				</td>
				</tr>
				
	</table>
					<input type="submit" value="=">
</body>
</html>