<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="/MiniProject1/mystyle.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Please Login</title>
<script type="text/javascript" src="${pageContext.request.contextPath}/myscript.js">

function validate()
{ 
 var username = document.clform.uname.value; 
 var password = document.clform.pass1.value;
 
 
 if (username==null || username=="")
 { 
 alert("Username can't be blank"); 
 return false; 
 }
 if (password==null || password=="" ){
	 alert("Password field cannot be empty");
	 return false;
 }
 else {
	 return true;
 }
 } 

</script>

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
<body>

<div class="menbar">
	

	<a href="contactus.jsp">Contact Us</a>
	<a href="homepage.jsp">Home</a>
	<img align="left" src="Logo.jpg" alt="Smiley face" style="width:250px;height:60px">
	
</div>

<br>


<div class="login-page">
  <div class="form">
     <form class="login-form" name="form" action="loginRegister" method="post" onsubmit="return validate()">
     <table> 
     <tr>
     <td><h3 style="color: red;">${message}</h3>
     <h3 style="color: green;s">${successCMessage}</h3>
     <h3 style="color: red">${incorrectMessage}</h3>
     </td>
     <td></td>
     </tr>
     </table>
      <input type="text" placeholder="username" name="uname"/>
      <input type="password" placeholder="password" name="pass1"/>
     <input type="submit" name="submit" value="login">
      <p class="message">Not registered? <a href="register.jsp">Create an account</a></p>
    </form>
  </div>
</div>

</body>
</html>