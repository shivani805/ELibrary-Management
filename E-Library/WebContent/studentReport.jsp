<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  import="DB.MyConnection" import="java.sql.Connection" import="java.sql.PreparedStatement"
    import="java.sql.ResultSet" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<!-- Favicons -->
  <link href="assets/img/favicon.png" rel="icon">
  <link href="assets/img/apple-touch-icon.png" rel="apple-touch-icon">

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
            <h2>Student Report</h2>
        </div>
       
<% 
		 System.out.println(session.isNew());%>
<%!Connection con;
PreparedStatement ps;
ResultSet rs;%>
<div class="form-control-lg">

<table border="2" align="center" class="table ">
<tr><td>
<table border="1"  cellpadding="5" width="100%" align="center" >
<tr>
<th>Sr.No.</th>
<th>Student Code</th>
<th>Name</th>
<th>Mobile</th>
<th>Department</th>
<th>Status</th>
<th>Email</th>
<th>Actions</th>

</tr>
<%
con=MyConnection.getConnection();
ps=con.prepareStatement("select * from   studentdetails");
rs=ps.executeQuery();
while(rs.next()){
%>
<tr>
<td><%=rs.getString(1) %></td>
<td><%=rs.getString(9) %></td>
<td><%=rs.getString(2) %></td>
<td><%=rs.getString(5) %></td>
<td></td>
<td></td>
<td><%=rs.getString(7) %></td>
<td><a href="#">Action</a></td>
<%} %>

</table>
</table>
</div>
</body>
</html>