<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
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
<title>Dashboard</title>
</head>
<body background="Z0VnR2tb.jpg">

<%
int userID;
String fname;
if(session.getAttribute("userid") == null){
	response.sendRedirect("login.jsp");
}else
	userID = (int) session.getAttribute("userid");
	fname =   String.valueOf(session.getAttribute("name"));
	System.out.println(fname);
	
%>


<div class="menbar">
	<img align="left" src="Logo.jpg" alt="Smiley face" style="width:250px;height:60px">

	<a href="LogoutServlet" method="get">Logout</a>
	<a href="CheckReport">Check Reports</a>
	<a href="appointments.jsp">Appointment</a>
	
</div>
<br>
<h2 align="center">Hi ${fname} , Welcome to PathoLabs </h2>
</body>
</html>