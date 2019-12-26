<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

<style>
body {
  font-family: Arial, Helvetica, sans-serif;
}

.menbar {
  overflow: hidden;
  background-color:    #32CD32;
}

.menbar a {
  float: right;
  font-size: 16px;
  color: white;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
}

.addreport {
  float: right;
  overflow: hidden;
  width: 50%;
  margin: 20 auto;
  padding: 20px;
}

.addreport .dropbtn {
  font-size: 16px;  
  border: none;
  outline: none;
  color: white;
  padding: 14px 16px;
  background-color: #32CD32;
  font-family: inherit;
  margin: 0;
}

.menbar a:hover, .addreport:hover .dropbtn, .dropbtn:focus {
  background-color: #006400;
}


.addreport-content {
  display: none;
  position: absolute;
  background-color: #f9f9f9;
  min-width: 160px;
  box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
  z-index: 1;
}

.addreport-content a {
  float: none;
  color: black;
  padding: 12px 16px;
  text-decoration: none;
  display: block;
  text-align: left;
}


.addreport-content a:hover {
  background-color: #ddd;
}


.responsive {
  width: 100%;
  min-width: 100%;
  height: auto;
  
 
}

.show {
  display: block;
}
</style>
<title>Please select Report</title>
</head>
<body background="Z0VnR2tb.jpg">

    
    <div class="menbar">
    <img align="left" src="Logo.jpg" alt="Smiley face" style="width:250px;height:60px">

    <a href="LogoutServlet">Logout</a>
    <a href="afterelogin.jsp">Dashboard</a>
	</div>
    
    <br>
    <br>
    
	 <div class="addreport" >
  <button class="dropbtn" onclick="myFunction()" >Select Test
    <i class="fa fa-caret-down"></i>
  </button>
  <div class="addreport-content" id="myDropdown">
    <a href="formBM.jsp">Basic Metabolic Panel</a>
    <a href="formLP.jsp">Lipid Panel</a>
    <a href="formCBC.jsp">CBC</a>
  </div>
  </div> 
 
    
<script>
/* When the user clicks on the button, 
toggle between hiding and showing the dropdown content */
function myFunction() {
  document.getElementById("myDropdown").classList.toggle("show");
}

// Close the dropdown if the user clicks outside of it
window.onclick = function(e) {
  if (!e.target.matches('.dropbtn')) {
  var myDropdown = document.getElementById("myDropdown");
    if (myDropdown.classList.contains('show')) {
      myDropdown.classList.remove('show');
    }
  }
}
</script>
</body>
</html>