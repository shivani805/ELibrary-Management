<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="DB.MyConnection" import="java.sql.Connection" import="java.sql.PreparedStatement"
    import="java.sql.ResultSet" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
 
		 System.out.println(session.isNew());%>
<%!Connection con;
PreparedStatement ps;
ResultSet rs;%>
<div class="form-control-lg">
<h2 align="center">Author Details</h2>
<table border="1" align="center" class="table ">
<tr><td>
<table border="1"  cellpadding="10" width="100%" align="center" >
<tr>
<th>Name</th>
<th>Books</th>
</tr>

<%

ServletContext s=request.getServletContext();
String authorn=(String)s.getAttribute("name1");
//System.out.println(authorn);
con=MyConnection.getConnection();
ps=con.prepareStatement("select * from bookdetails where author=?");
ps.setString(1,authorn);
rs=ps.executeQuery();
while(rs.next()){
%>
<tr>
<td><%=rs.getString(9) %></td>
<td><%=rs.getString(2) %></td>
<%} %>


</tr>
</table>
</table>
</div>



</body>
</html>