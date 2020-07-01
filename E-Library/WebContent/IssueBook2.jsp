<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="ab" class="Beans.IssueBookBean"></jsp:useBean>
<jsp:setProperty property="*" name="ab"/>
<jsp:useBean id="sa" class="Dao.IssueBookDao"></jsp:useBean>
<%
String msg=sa.show(ab);
if(msg.equals("inserted")){
	response.getWriter().append("added Succesfully..!");
%>
<jsp:include page="IssueBook.jsp"></jsp:include>
<%
}else{
	response.getWriter().append("not added....try Again");
%>
<jsp:include page="IssueBook.jsp"></jsp:include>
<%
}%>



</body>
</html>