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
<%
System.out.println(session.isNew());%>
<header id="header" class="fixed-top">
    <div class="container-fluid d-flex justify-content-between align-items-center">
<h3 class="logo">E-Library</h3>
<h2 align="left">User Panel</h2>
</div></header>
<div class="section-title">
       
    <br><br><br><br>
            <h2>My Account</h2>
        </div>
       
<div class="form-group">

<form action="AddStudentServ" method="post">

<div class="row">
 <div class="col-md-6">
<label>Name</label>
<input type="text" name= "sname" required="required" class="form-control"><br>
<label>Date of Birth</label>
<input type="date" name= "sdob" required="required" class="form-control"><br>
<label>Nationality</label>
<input type="text" name= "snation" required="required" class="form-control">
</div>
 <div class="col-md-6">
<label>Mobile No.</label>
<input type="number" name= "smob" required="required" class="form-control"><br>
<label>Address</label>
<input type="text" name= "sadd" required="required" class="form-control"><br>
<label>Email</label>
<input type="email" name= "semail" required="required" class="form-control"><br>
<label>Gender</label>
<input type="radio" name= "gender" value="male">
<label for="male">Male</label>
<input type="radio" name= "gender" value="female">
<label for="female">Female</label>
 </div>
</div>
<br>
<br>



</form>

</div>
</body>
</html>