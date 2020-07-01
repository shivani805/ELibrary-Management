<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 

		 System.out.println(session.isNew());%>
<jsp:useBean id="bookbean" class="Beans.AddBookBean"  scope="application"></jsp:useBean>
<jsp:setProperty property="*" name="bookbean"/>

<jsp:useBean id="bookdao" class="Dao.AddBookDao"></jsp:useBean>
<%
String msg=bookdao.show(bookbean);
if(msg.equals("inserted")){
	response.getWriter().append("added Succesfully..!");

%>
<jsp:include page="addBook.jsp"></jsp:include>
<%
}else{
	response.getWriter().append("not added....try Again");
%>
<jsp:include page="addBook.jsp"></jsp:include>
<%
}%>
</body>
</html>