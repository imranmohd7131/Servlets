<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
int age=Integer.parseInt(request.getParameter("age"));
String name=request.getParameter("username");
if(age>18)
{
	out.print("Driving licence is ready "+name);
}
else
{
	out.print("not eligable"+name);
}
%>
<%=name %>
</body>
</html>