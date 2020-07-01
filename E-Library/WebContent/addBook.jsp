<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="DB.MyConnection" import="java.sql.Connection" import="java.sql.PreparedStatement"
    import="java.sql.ResultSet" session="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
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
            <h2>Add Book</h2>
        </div>
<% 
 System.out.println(session.isNew());%>
<%!Connection con;
PreparedStatement ps;
ResultSet rs;%>
<div class="form-group">
<form action ="addBook2.jsp"method="post">  

<label>Select Library</label>
<select name="libraryname" class="form-control" required="required">
<%
 con=MyConnection.getConnection();
 ps=con.prepareStatement("select lname from librarydetails");
rs=ps.executeQuery();
while(rs.next()){
//System.out.println(rs.getString(1));

%>
<option value="<%=rs.getString(1)%>"><%=rs.getString(1) %></option>
<%} %>

</select>
<br>
<label>Book Name</label>
<input type="text" name="bookname" class="form-control" required="required"><br>

<label>Select Publication</label>
<select  name="publication" class="form-control" required="required">

<%
 con=MyConnection.getConnection();
 ps=con.prepareStatement("select pname from publicationdetails");
rs=ps.executeQuery();
while(rs.next()){
//System.out.println(rs.getString(1));

%>
<option value="<%=rs.getString(1)%>"><%=rs.getString(1) %></option>
<%} %>

</select>
<br>
<label>Subject Name</label>
<input type="text" name="subject" class="form-control" required="required"><br>
<label>Edition Year</label>
<input type="text" name="editionYear" class="form-control"required="required"><br>

<label>Price</label>
<input type="number" name="price" class="form-control" required="required"><br>
<label>Number Of Copies</label>
<input type="number" name="noOfCopies" class="form-control" required="required"><br>
<label>Select Language</label>
<select name="language" class="form-control" required="required">
<%
con=MyConnection.getConnection();
 ps=con.prepareStatement("select langname from languagedetails");
 rs=ps.executeQuery();
while(rs.next()){

%>
<option value="<%=rs.getString(1) %>"><%=rs.getString(1) %></option>
<%} %>
</select>
<br>
<label>Select Author</label>
<select name="author" class="form-control" required="required">

<%
con=MyConnection.getConnection();
 ps=con.prepareStatement("select aname from authordetails");
 rs=ps.executeQuery();
while(rs.next()){

%>
<option value="<%=rs.getString(1) %>"><%=rs.getString(1) %></option>
<%} %>

</select>
<br>
<label>Date Of Purchase</label>
<input type="date" name="purchaseDate" class="form-control" required="required"><br>

<input type="submit" value="Save" class="btn btn-primary">
</form>
</div>
</body>
</html>