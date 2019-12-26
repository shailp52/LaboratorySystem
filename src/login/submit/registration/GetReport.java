package login.submit.registration;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/GetReport")
public class GetReport extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			int testid = Integer.parseInt(request.getParameter("testID"));
			int reportid = Integer.parseInt(request.getParameter("reportID"));
			Connection con;
			con=MyConnectionProvider.getCon();
			response.setContentType("text/html");
			PreparedStatement ps;
			
			
			switch(testid) {
				case 1: {
					PrintWriter out = response.getWriter();
					ps = con.prepareStatement("select * from mp1.bmtable where ReportID=?");
					ps.setInt(1, reportid);
					ResultSet rs = ps.executeQuery();
					rs.first();
					
					out.println("<html>\r\n" + 
							"<head>\r\n" + 
							"<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n" + 
							"<style>\r\n" + 
							"body {\r\n" + 
							"  font-family: Arial, Helvetica, sans-serif;\r\n" + 
							"}\r\n" + 
							"\r\n" + 
							".menbar {\r\n" + 
							"  overflow: hidden;\r\n" + 
							"  background-color:	#32CD32;\r\n" + 
							"}\r\n" + 
							"\r\n" + 
							".menbar a {\r\n" + 
							"  float: right;\r\n" + 
							"  font-size: 16px;\r\n" + 
							"  color: white;\r\n" + 
							"  text-align: center;\r\n" + 
							"  padding: 14px 16px;\r\n" + 
							"  text-decoration: none;\r\n" + 
							"}\r\n" + 
							"\r\n" + 
							".appointment {\r\n" + 
							"  float: right;\r\n" + 
							"  overflow: hidden;\r\n" + 
							"}\r\n" + 
							"\r\n" + 
							".appointment .dropbtn {\r\n" + 
							"  font-size: 16px;  \r\n" + 
							"  border: none;\r\n" + 
							"  outline: none;\r\n" + 
							"  color: white;\r\n" + 
							"  padding: 14px 16px;\r\n" + 
							"  background-color: inherit;\r\n" + 
							"  font-family: inherit;\r\n" + 
							"  margin: 0;\r\n" + 
							"}\r\n" + 
							"\r\n" + 
							".menbar a:hover, .dropbtn {\r\n" + 
							"  background-color:#006400;\r\n" + 
							"}\r\n" + 
							"\r\n" + 
							"\r\n" + 
							"\r\n" + 
							" a.hover {\r\n" + 
							"  background-color: #ddd;\r\n" + 
							"}\r\n" + 
							"\r\n" + 
							".responsive {\r\n" + 
							"  width: 100%;\r\n" + 
							"  min-width: 100%;\r\n" + 
							"  height: auto;\r\n" + 
							"  opacity:0.35;\r\n" + 
							"}\r\n" + 
							"\r\n" + 
							"\r\n" + 
							"</style>"+
							"</head>\r\n" + 
							"<body>\r\n" + 
							"<div class=\"menbar\">\r\n" + 
							"	<img align=\"left\" src=\"Logo.jpg\" alt=\"Smiley face\" style=\"width:250px;height:60px\">\r\n" + 
							"</div>\r\n" + 
							"<br>\r\n" + 
							"<div align=\"center\">\r\n" + 
							"<table style=\"font-size:24\">"+
							"<tr>\r\n" + 
							"    <td>Name:</td>\r\n" + 
							"    <td>"+ rs.getString(4) +"</td>\r\n" + 
							"</tr>\r\n" + 
							"<br>\r\n" + 
							"<br>\r\n" + 
							"<tr>\r\n" + 
							"    <td>Report-Id:</td>\r\n" + 
							"    <td>"+ rs.getInt(3) +"</td>\r\n" + 
							"</tr><br>\r\n" + 
							"<br>\r\n" + 
							"<tr>\r\n" + 
							"    <td>Gender:</td>\r\n" + 
							"    <td>"+ rs.getString(5) +"</td>\r\n" + 
							"</tr><br>\r\n" + 
							"<br>\r\n" + 
							"<tr>\r\n" + 
							"	<td>\r\n" + 
							"		Date:\r\n" + 
							"	</td>\r\n" + 
							"	<td>"+ rs.getDate(6) +"</td>\r\n" + 
							"</tr><br>\r\n" +
							"</table>"+
							"</div>\r\n" + 
							"<br>"
							+ "<h2 align=\"center\">Basic Metabolic Panel Report</h2>\r\n" + 
							"\r\n" + 
							"<table style=\"width:50%;font-size:24\"  border=\"1\" align=\"center\">\r\n" + 
							"  <tr>\r\n" + 
							"    <th>Element</th>\r\n" + 
							"    <th>Proportion</th>\r\n" + 
							"  </tr>\r\n" + 
							"  <tr>\r\n" + 
							"    <td>Glucoze,Serum</td>\r\n" + 
							"    <td align=\"center\">"+ rs.getFloat(7) +"</td>\r\n" + 
							"  </tr>\r\n" + 
							"  <tr>\r\n" + 
							"    <td>BUN</td>\r\n" + 
							"    <td align=\"center\">"+ rs.getFloat(8) +"</td>\r\n" + 
							"  </tr>\r\n" + 
							"  <tr>\r\n" + 
							"    <td>Creatinin,Serum</td>\r\n" + 
							"    <td align=\"center\">"+ rs.getFloat(9) +"</td>\r\n" + 
							"  </tr>\r\n" + 
							"  <tr>\r\n" + 
							"    <td>BUN/Creatinin ratio</td>\r\n" + 
							"    <td align=\"center\">"+ rs.getFloat(10) +"</td>\r\n" + 
							"  </tr>\r\n" + 
							"  <tr>\r\n" + 
							"    <td>Chloride,Serum</td>\r\n" + 
							"    <td align=\"center\">"+ rs.getFloat(11) +"</td>\r\n" + 
							"  </tr>\r\n" + 
							"</table></body></html>");
					out.close();
					con.close();
							break;
				}
				case 2: {
					PrintWriter out = response.getWriter();
					ps = con.prepareStatement("select * from mp1.lptable where ReportID=?");
					ps.setInt(1, reportid);
					ResultSet rs = ps.executeQuery();
					rs.first();
					
					out.println("<html>\r\n" + 
							"<head>\r\n" + 
							"<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n" + 
							"<style>\r\n" + 
							"body {\r\n" + 
							"  font-family: Arial, Helvetica, sans-serif;\r\n" + 
							"}\r\n" + 
							"\r\n" + 
							".menbar {\r\n" + 
							"  overflow: hidden;\r\n" + 
							"  background-color:	#32CD32;\r\n" + 
							"}\r\n" + 
							"\r\n" + 
							".menbar a {\r\n" + 
							"  float: right;\r\n" + 
							"  font-size: 16px;\r\n" + 
							"  color: white;\r\n" + 
							"  text-align: center;\r\n" + 
							"  padding: 14px 16px;\r\n" + 
							"  text-decoration: none;\r\n" + 
							"}\r\n" + 
							"\r\n" + 
							".appointment {\r\n" + 
							"  float: right;\r\n" + 
							"  overflow: hidden;\r\n" + 
							"}\r\n" + 
							"\r\n" + 
							".appointment .dropbtn {\r\n" + 
							"  font-size: 16px;  \r\n" + 
							"  border: none;\r\n" + 
							"  outline: none;\r\n" + 
							"  color: white;\r\n" + 
							"  padding: 14px 16px;\r\n" + 
							"  background-color: inherit;\r\n" + 
							"  font-family: inherit;\r\n" + 
							"  margin: 0;\r\n" + 
							"}\r\n" + 
							"\r\n" + 
							".menbar a:hover, .dropbtn {\r\n" + 
							"  background-color:#006400;\r\n" + 
							"}\r\n" + 
							"\r\n" + 
							"\r\n" + 
							"\r\n" + 
							" a.hover {\r\n" + 
							"  background-color: #ddd;\r\n" + 
							"}\r\n" + 
							"\r\n" + 
							".responsive {\r\n" + 
							"  width: 100%;\r\n" + 
							"  min-width: 100%;\r\n" + 
							"  height: auto;\r\n" + 
							"  opacity:0.35;\r\n" + 
							"}\r\n" + 
							"\r\n" + 
							"\r\n" + 
							"</style>"+
							"</head>\r\n" + 
							"<body>\r\n" + 
							"<div class=\"menbar\">\r\n" + 
							"	<img align=\"left\" src=\"Logo.jpg\" alt=\"Smiley face\" style=\"width:250px;height:60px\">\r\n" + 
							"</div>\r\n" + 
							"<br>\r\n" + 
							"<div align=\"center\">\r\n" + 
							"<table style=\"font-size:24\">"+
							"<tr>\r\n" + 
							"    <td>Name:</td>\r\n" + 
							"    <td>"+ rs.getString(4) +"</td>\r\n" + 
							"</tr>\r\n" + 
							"<br>\r\n" + 
							"<br>\r\n" + 
							"<tr>\r\n" + 
							"    <td>Report-Id:</td>\r\n" + 
							"    <td>"+ rs.getInt(3) +"</td>\r\n" + 
							"</tr><br>\r\n" + 
							"<br>\r\n" + 
							"<tr>\r\n" + 
							"    <td>Gender:</td>\r\n" + 
							"    <td>"+ rs.getString(5) +"</td>\r\n" + 
							"</tr><br>\r\n" + 
							"<br>\r\n" + 
							"<tr>\r\n" + 
							"	<td>\r\n" + 
							"		Date:\r\n" + 
							"	</td>\r\n" + 
							"	<td>"+ rs.getDate(6) +"</td>\r\n" + 
							"</tr><br>\r\n" +
							"</table>"+
							"</div>\r\n" + 
							"<br>"
							+ "<h2 align=\"center\">Lipid Panel Report</h2>\r\n" + 
							"\r\n" + 
							"<table style=\"width:50%;font-size:24\"  border=\"1\" align=\"center\">\r\n" + 
							"  <tr>\r\n" + 
							"    <th>Element</th>\r\n" + 
							"    <th>Proportion</th>\r\n" + 
							"  </tr>\r\n" + 
							"  <tr>\r\n" + 
							"    <td>Cholesterol, Total</td>\r\n" + 
							"    <td align=\"center\">"+ rs.getFloat(7) +"</td>\r\n" + 
							"  </tr>\r\n" + 
							"  <tr>\r\n" + 
							"    <td>HDI Cholesterol</td>\r\n" + 
							"    <td align=\"center\">"+ rs.getFloat(8) +"</td>\r\n" + 
							"  </tr>\r\n" + 
							"  <tr>\r\n" + 
							"    <td>LDL Cholesterol</td>\r\n" + 
							"    <td align=\"center\">"+ rs.getFloat(9) +"</td>\r\n" + 
							"  </tr>\r\n" + 
							"  <tr>\r\n" + 
							"    <td>Tryglycerides</td>\r\n" + 
							"    <td align=\"center\">"+ rs.getFloat(10) +"</td>\r\n" + 
							"  </tr>\r\n" + 
							"</table></body></html>");
					out.close();
					con.close();
							break;
					
				}
				case 3: {
					PrintWriter out = response.getWriter();
					ps = con.prepareStatement("select * from mp1.cbctable where ReportID=?");
					ps.setInt(1, reportid);
					ResultSet rs = ps.executeQuery();
					rs.first();
					
					out.println("<html>\r\n" + 
							"<head>\r\n" + 
							"<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n" + 
							"<style>\r\n" + 
							"body {\r\n" + 
							"  font-family: Arial, Helvetica, sans-serif;\r\n" + 
							"}\r\n" + 
							"\r\n" + 
							".menbar {\r\n" + 
							"  overflow: hidden;\r\n" + 
							"  background-color:	#32CD32;\r\n" + 
							"}\r\n" + 
							"\r\n" + 
							".menbar a {\r\n" + 
							"  float: right;\r\n" + 
							"  font-size: 16px;\r\n" + 
							"  color: white;\r\n" + 
							"  text-align: center;\r\n" + 
							"  padding: 14px 16px;\r\n" + 
							"  text-decoration: none;\r\n" + 
							"}\r\n" + 
							"\r\n" + 
							".appointment {\r\n" + 
							"  float: right;\r\n" + 
							"  overflow: hidden;\r\n" + 
							"}\r\n" + 
							"\r\n" + 
							".appointment .dropbtn {\r\n" + 
							"  font-size: 16px;  \r\n" + 
							"  border: none;\r\n" + 
							"  outline: none;\r\n" + 
							"  color: white;\r\n" + 
							"  padding: 14px 16px;\r\n" + 
							"  background-color: inherit;\r\n" + 
							"  font-family: inherit;\r\n" + 
							"  margin: 0;\r\n" + 
							"}\r\n" + 
							"\r\n" + 
							".menbar a:hover, .dropbtn {\r\n" + 
							"  background-color:#006400;\r\n" + 
							"}\r\n" + 
							"\r\n" + 
							"\r\n" + 
							"\r\n" + 
							" a.hover {\r\n" + 
							"  background-color: #ddd;\r\n" + 
							"}\r\n" + 
							"\r\n" + 
							".responsive {\r\n" + 
							"  width: 100%;\r\n" + 
							"  min-width: 100%;\r\n" + 
							"  height: auto;\r\n" + 
							"  opacity:0.35;\r\n" + 
							"}\r\n" + 
							"\r\n" + 
							"\r\n" + 
							"</style>"+
							"</head>\r\n" + 
							"<body>\r\n" + 
							"<div class=\"menbar\">\r\n" + 
							"	<img align=\"left\" src=\"Logo.jpg\" alt=\"Smiley face\" style=\"width:250px;height:60px\">\r\n" + 
							"</div>\r\n" + 
							"<br>\r\n" + 
							"<div align=\"center\">\r\n" + 
							"<table style=\"font-size:24\">"+
							"<tr>\r\n" + 
							"    <td>Name:</td>\r\n" + 
							"    <td>"+ rs.getString(4) +"</td>\r\n" + 
							"</tr>\r\n" + 
							"<br>\r\n" + 
							"<br>\r\n" + 
							"<tr>\r\n" + 
							"    <td>Report-Id:</td>\r\n" + 
							"    <td>"+ rs.getInt(3) +"</td>\r\n" + 
							"</tr><br>\r\n" + 
							"<br>\r\n" + 
							"<tr>\r\n" + 
							"    <td>Gender:</td>\r\n" + 
							"    <td>"+ rs.getString(5) +"</td>\r\n" + 
							"</tr><br>\r\n" + 
							"<br>\r\n" + 
							"<tr>\r\n" + 
							"	<td>\r\n" + 
							"		Date:\r\n" + 
							"	</td>\r\n" + 
							"	<td>"+ rs.getDate(6) +"</td>\r\n" + 
							"</tr><br>\r\n" +
							"</table>"+
							"</div>\r\n" + 
							"<br>"
							+ "<h2 align=\"center\">CBC Report</h2>\r\n" + 
							"\r\n" + 
							"<table style=\"width:50%;font-size:24\"  border=\"1\" align=\"center\">\r\n" + 
							"  <tr>\r\n" + 
							"    <th>Element</th>\r\n" + 
							"    <th>Proportion</th>\r\n" + 
							"  </tr>\r\n" + 
							"  <tr>\r\n" + 
							"    <td>Haemoglobin</td>\r\n" + 
							"    <td align=\"center\">"+ rs.getFloat(7) +"</td>\r\n" + 
							"  </tr>\r\n" + 
							"  <tr>\r\n" + 
							"    <td>RBC Count</td>\r\n" + 
							"    <td align=\"center\">"+ rs.getFloat(8) +"</td>\r\n" + 
							"  </tr>\r\n" + 
							"  <tr>\r\n" + 
							"    <td>WBC Count</td>\r\n" + 
							"    <td align=\"center\">"+ rs.getFloat(9) +"</td>\r\n" + 
							"  </tr>\r\n" + 
							"  <tr>\r\n" + 
							"    <td>Platelet Count</td>\r\n" + 
							"    <td align=\"center\">"+ rs.getFloat(10) +"</td>\r\n" + 
							"  </tr>\r\n" + 
							"  <tr>\r\n" + 
							"    <td>HCT Count</td>\r\n" + 
							"    <td align=\"center\">"+ rs.getFloat(11) +"</td>\r\n" + 
							"  </tr>\r\n" + 
							"  <tr>\r\n" + 
							"    <td>MCV Count</td>\r\n" + 
							"    <td align=\"center\">"+ rs.getFloat(12) +"</td>\r\n" + 
							"  </tr>\r\n" + 
							"  <tr>\r\n" + 
							"    <td>MCH Count</td>\r\n" + 
							"    <td align=\"center\">"+ rs.getFloat(13) +"</td>\r\n" + 
							"  </tr>\r\n" + 
							"  <tr>\r\n" + 
							"    <td>MCHC Count</td>\r\n" + 
							"    <td align=\"center\">"+ rs.getFloat(14) +"</td>\r\n" + 
							"  </tr>\r\n" + 
							"</table></body></html>");
					out.close();
					con.close();
							break;
				}
			}
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}


}
