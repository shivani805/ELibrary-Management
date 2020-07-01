<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="DB.MyConnection" import="java.sql.Connection" import="java.sql.PreparedStatement"
    import="java.sql.ResultSet" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
 <!-- Google Fonts -->
  <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Raleway:300,300i,400,400i,500,500i,600,600i,700,700i|Poppins:300,300i,400,400i,500,500i,600,600i,700,700i" rel="stylesheet">

  <!-- Vendor CSS Files -->
  <link href="assets/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
  <link href="assets/vendor/icofont/icofont.min.css" rel="stylesheet">
  <link href="assets/vendor/owl.carousel/assets/owl.carousel.min.css" rel="stylesheet">
  <link href="assets/vendor/boxicons/css/boxicons.min.css" rel="stylesheet">
  <link href="assets/vendor/venobox/venobox.css" rel="stylesheet">
  <link href="assets/vendor/aos/aos.css" rel="stylesheet">

  <!-- Template Main CSS File -->
  <link href="assets/css/style.css" rel="stylesheet">

<link rel="stylesheet" href="bootstrap-4.4.1-dist/css/bootstrap.css">

</head>
<body>
<header id="header" class="fixed-top">
    <div class="container-fluid d-flex justify-content-between align-items-center">
<h3 class="logo">E-Library</h3>
<h2 align="left">Admin Panel</h2>
</div></header>
<div class="section-title">
       
    <br><br><br><br>
            <h2>Issue Books</h2>
        </div>
<% 
		 System.out.println(session.isNew());%>
<%!Connection con;
PreparedStatement ps;
ResultSet rs;%>
<div class="form-group">
<form action ="IssueBook2.jsp"method="post">  

<label>Select Student ID</label>
<select name="stuid" class="form-control" required="required">
<%
 con=MyConnection.getConnection();
 ps=con.prepareStatement("select * from studentdetails");
rs=ps.executeQuery();
while(rs.next()){
//System.out.println(rs.getString(1));
%>
<option value="<%=rs.getString(9)%>"><%=rs.getString(9) %></option>
<%} %>
</select>
<br>

<label>Select Book</label>
<select  name="bookname" class="form-control" required="required">

<%
 con=MyConnection.getConnection();
 ps=con.prepareStatement("select * from bookdetails");
rs=ps.executeQuery();
while(rs.next()){
%>
<option value="<%=rs.getString(2)%>"><%=rs.getString(2) %></option>
<%} %>
</select>
<br>
<label> Issue Date</label>
<input type="date"  name="issuedate" class="form-control" required="required"><br>

 
 
<input type="submit" value="Save" class="btn btn-primary">
</form>
</div>

</body>
</html>