<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="DB.MyConnection" import="java.sql.Connection" import="java.sql.PreparedStatement"
    import="java.sql.ResultSet" import=" java.util.List" import ="java.util.ArrayList"%>



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
<h2 align="left">User Panel</h2>
</div></header>
<div class="section-title">
       
    <br><br><br><br>
            <h2>All Books</h2>
        </div>
       

<%!Connection con;
PreparedStatement ps;
ResultSet rs;
int totalcopies=0;%>

<div class="form-control-lg">
<table border="2" align="center" class="table ">
<tr><td>
<table border="1"  cellpadding="5" width="100%" align="center" >
<tr>
<th>Sr no.</th>
<th>Name</th>
<th>Library Name</th>
<th>Author</th>
<th>Total Copies</th>
<th>Subjects</th>

</tr>
<% 

System.out.println(session.isNew());
con=MyConnection.getConnection();
ps=con.prepareStatement("select * from bookdetails");
rs=ps.executeQuery();
while(rs.next()){
%>
<tr>
<td></td>
<td><%=rs.getString(2)  %></td>
<td><%=rs.getString(1)  %></td>
<td><%=rs.getString(9)  %></td>
<td><%=rs.getString(7)  %></td>
<td><%=rs.getString(4)  %></td>

<%

String copies=rs.getString(7);
//System.out.println(copies);
int s=Integer.parseInt(copies);
totalcopies=totalcopies+s;
//System.out.println(s);
} %>

</tr></table>

<tr>
<td>Total No. of Book Available :<%=totalcopies%></td>
<%totalcopies=0; %>
</tr>
</table>

</div>
   
</body>
</html>