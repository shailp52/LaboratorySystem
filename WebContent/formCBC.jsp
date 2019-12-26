<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Enter Results</title>
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
</head>
<body>

<div class="menbar">
	<img align="left" src="Logo.jpg" alt="Smiley face" style="width:250px;height:60px">

	<a href="LogoutServlet">Logout</a>
	<a href="afterelogin.jsp">Dashboard</a>
	
</div>

<div>
<center>
<form action="ReportSubmit" method="post">
	<h1>CBC REPORT</h1>
	<table>
		<tr>
			<td>
				Customer Id:
			</td>
			<td>
				<input type="text" name="cid">
			</td>
		</tr>
		<tr>
			<td>
				Name:
			</td>
			<td>
				<input type="text" name="name">
			</td>
		</tr>
		<tr><td>Gender:</td>
		<td>
		<select name="gender">
			<option  value="M">M</option>
			<option value="F">F</option>
		</select>
		</td>
		</tr>
		<tr>
			<td>
				Date:
			</td>
			<td>
				<input type="date" name="date">
			</td>
		</tr>
		<tr>
			<td>
				Hb-Haemoglobin:
			</td>
			<td>
				<input type="text" name="hb">
			</td>
		</tr>
		<tr>
			<td>
				RCB count:
			</td>
			<td>
				<input type="text" name="rbc">
			</td>
		</tr>
		<tr>
			<td>
				WBC-Total count:
			</td>
			<td>
				<input type="text" name="wbc">
			</td>
		</tr>
		<tr>
			<td>
				Platelet count:
			</td>
			<td>
				<input type="text" name="plt">
			</td>
		</tr>
		<tr>
			<td>
				HCT:
			</td>
			<td>
				<input type="text" name="hct">
			</td>
		</tr>
		<tr>
			<td>
				MCV:
			</td>
			<td>
				<input type="text" name="mcv">
			</td>
		</tr>
		<tr>
			<td>
				MCH:
			</td>
			<td>
				<input type="text" name="mch">
			</td>
		</tr>
		<tr>
			<td>
				MCHC:
			</td>
			<td>
				<input type="text" name="mchc">
			</td>
		</tr>
		<tr>
			<td>
				<input style="text-align:center" type="Submit" value="Submit-CBC" name="submit">
			</td>
		</tr>
	</table>
</form>
</center>
</div>

</body>
</html>