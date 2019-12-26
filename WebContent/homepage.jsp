<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Diagnostic Lab Reporting System</title>

<style>
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
  background-color: #32CD32;
  font-family: inherit;
  margin: 0;
}

.menbar a:hover, .appointment:hover .dropbtn {
  background-color:#006400;
}

.appointment-content {
  display: none;
  position: absolute;
  background-color: #f9f9f9;
  min-width: 160px;
  box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
  z-index: 1;
}

.appointment-content a {
  float: none;
  color: black;
  padding: 12px 16px;
  text-decoration: none;
  display: block;
  text-align: center;
}

.appointment-content a:hover {
  background-color: #ddd;
}

 a.hover {
  background-color: #ddd;
}

.appointment:hover .appointment-content {
  display: block;
}

.responsive {
  width: 100%;
  min-width: 100%;
  height: auto;
}


</style>
</head>
<body background="Z0VnR2tb.jpg">
<div class="menbar">
	

	<a href="contactus.jsp">Contact Us</a>
	<a href="login.jsp">Login</a>
  	<a href="register.jsp">Register</a>
	<a href="homepage.jsp">Home</a>
	<img align="left" src="Logo.jpg" alt="Smiley face" style="width:250px;height:60px">
	
</div>

</body>
</html>