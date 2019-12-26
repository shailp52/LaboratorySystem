<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Contact Us</title>

<style>
* {
  box-sizing: border-box;
}

/* Create three equal columns that floats next to each other */
.column {
  float: left;
  width: 33.33%;
  padding: 10px;
  height: 300px; /* Should be removed. Only for demonstration */
}

/* Clear floats after the columns */
.row:after {
  content: "";
  display: table;
  clear: both;
}

.center {
  display: block;
  margin-left: auto;
  margin-right: auto;
  width: 200px;
  heigth: 200px;
}

.content{
	font-size:100%;
	text-align:center;
}

body {
  font-family: Arial, Helvetica, sans-serif;
}

.menbar {
  overflow: hidden;
  background-color:	#32CD32;
}

.menbar a {
  float: right;
  font-size: 16px;
  color: white;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
}

.appointment {
  float: right;
  overflow: hidden;
}

.appointment .dropbtn {
  font-size: 16px;  
  border: none;
  outline: none;
  color: white;
  padding: 14px 16px;
  background-color: inherit;
  font-family: inherit;
  margin: 0;
}

.menbar a:hover, .dropbtn {
  background-color:#006400;
}



 a.hover {
  background-color: #ddd;
}

.responsive {
  width: 100%;
  min-width: 100%;
  height: auto;
}

</style>

</head>
<body>

<div class="menbar">
	<img align="left" src="Logo.jpg" alt="Smiley face" style="width:250px;height:60px">

	<a href="login.jsp">Login</a>
	<a href="register.jsp">Register</a>
	<a href="homepage.jsp">Home</a>
	
</div>

<br></br>
<br></br>

<div class="row">
  <div class="column" style="background-color:white;">
  <img src="Place.png" alt="Address" class="center">
    <h2 align="center">Nirma University,</h2>
	<h2 align="center">S.G. Highway,</h2>
	<h2 align="center">Ahmedabad.</h2>
  </div>
  <div class="column" style="background-color:white;">
  <img src="Mail.png" alt="Address" class="center">
	<br></br>
    <h2 align="center">17bce114@nirmauni.ac.in</h2>
	<h2 align="center">17bce123@nirmauni.ac.in</h2>
  </div>
  <div class="column" style="background-color:white;">
  <img src="Contact.png" alt="Address" class="center">
	<br></br>
    <h2 align="center">Shail Patel : (M)+91 8140162645</h2>
	<h2 align="center">Jeet Sureja : (M)+91 7487863385</h2>
  </div>
</div>


</body>
</html>