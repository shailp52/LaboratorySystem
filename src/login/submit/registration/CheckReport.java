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
import javax.servlet.http.HttpSession;


@WebServlet("/CheckReport")
public class CheckReport extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			Connection con;
			con=MyConnectionProvider.getCon();
			response.setContentType("text/html");
			PreparedStatement ps;
			PreparedStatement ps1;
			PreparedStatement ps2;
			int userID;
			HttpSession session = request.getSession();
			userID = (int) session.getAttribute("userid");
			
			
			ps = con.prepareStatement("select * from mp1.bmtable where CustID=(?)");
			ps.setInt(1, userID);
			ResultSet rs = ps.executeQuery();
			PrintWriter out = response.getWriter();
			out.println("<html><head><style>a.button {\r\n" + 
					"    -webkit-appearance: button;\r\n" + 
					"    -moz-appearance: button;\r\n" + 
					"    appearance: button;\r\n" + 
					"\r\n" + 
					"    text-decoration: none;\r\n" + 
					"    color: initial;\r\n" + 
					"}</style></head><body background=\"Z0VnR2tb.jpg\"> \r\n" + 
					"<h1 align=\"center\">Previous Reports</h1> <br><table style=\"width:50%;font-size:22\" align=\"center\" border='1' bgcolor=\"white\"><tr> <th>Name</th> <th>Report</th> <th>Date</th> <th>Report Link</th> </tr>");
			
			if(rs.next()!=false) {
				System.out.println("Inside 1st if");
				do {
					System.out.println("Inside 1st while");
				int testid, reportid;
				testid = rs.getInt(1);
				reportid = rs.getInt(3);
				out.println("<tr><td>"+ rs.getString(4) +"</td><td>Basic Metabolic</td><td>" + rs.getDate(6) +"</td>");
				out.println("<td><a href=\"GetReport?testID="+testid+"&&reportID=" +reportid + "\">Download</a></td></tr>");
				}while(rs.next());
			}
			
			ps1 = con.prepareStatement("select * from mp1.lptable where CustID=(?)");
			ps1.setInt(1, userID);
			ResultSet rs1 = ps1.executeQuery();
			
			if(rs1.next()!=false) {
				System.out.println("Inside 2nd if");
				do {
				System.out.println("Inside 2nd while");
				int testid, reportid;
				testid = rs1.getInt(1);
				reportid = rs1.getInt(3);
				out.println("<tr><td>"+ rs1.getString(4) +"</td><td>Lipid Panel</td><td>" + rs1.getDate(6) +"</td>");
				out.println("<td><a href=\"GetReport?testID="+testid+"&&reportID=" +reportid + "\">Download</a></td></tr>");
				}while(rs1.next());
			}
			
			ps2 = con.prepareStatement("select * from mp1.cbctable where CustID=(?)");
			ps2.setInt(1, userID);
			ResultSet rs2 = ps2.executeQuery();
			
			if(rs2.next()!=false) {
				System.out.println("Inside 3rd if");
				do {
					System.out.println("Inside 3rd while");
				int testid, reportid;
				testid = rs2.getInt(1);
				reportid = rs2.getInt(3);
				out.println("<tr><td>"+ rs2.getString(4) +"</td><td>CBC</td><td>" + rs2.getDate(6) +"</td>");
				out.println("<td><a href=\"GetReport?testID="+testid+"&&reportID=" +reportid + "\">Download</a></td></tr>");
				}while(rs2.next());
			
			}
			
			out.println("</table> <a href=\"afterclogin.jsp\" class=\"button\">Back to Dashboard</a></body></html>");
			con.close();
			
		} catch(Exception e) {
			System.out.println(e);
	}

}

}
