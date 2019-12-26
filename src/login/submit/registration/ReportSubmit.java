package login.submit.registration;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ReportSubmit")
public class ReportSubmit extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String submitType = request.getParameter("submit");
		try {
			if(submitType.equals("Submit-BM")) {
				BM cd = new BMImpl();
				BMReport c = new BMReport();
				c.setCustID(Integer.parseInt(request.getParameter("cid")));
				c.setName(request.getParameter("name"));
				c.setGender(request.getParameter("gender"));
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
				Date parsed;
				try {
					parsed = sdf.parse(request.getParameter("date"));
					c.setDate(parsed);
	
				} catch (ParseException e) {
					e.printStackTrace();
				}
				c.setGlucoze(Float.parseFloat(request.getParameter("GS")));
				c.setBUN(Float.parseFloat(request.getParameter("bun")));
				c.setCreatinin(Float.parseFloat(request.getParameter("CS")));
				c.setBUNCRatio(Float.parseFloat(request.getParameter("ratio")));
				c.setChloride(Float.parseFloat(request.getParameter("CaS")));
				
				
				cd.insertReport(c);
				request.getRequestDispatcher("afterelogin.jsp").forward(request, response);
				
			}
			else if(submitType.equals("Submit-LP")) {
				LP cd = new LPImpl();
				LPReport c = new LPReport();
				c.setCustID(Integer.parseInt(request.getParameter("cid")));
				c.setName(request.getParameter("name"));
				c.setGender(request.getParameter("gender"));
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
				Date parsed;
				try {
					parsed = sdf.parse(request.getParameter("date"));
					c.setDate(parsed);
	
				} catch (ParseException e) {
					e.printStackTrace();
				}
				c.setChloesterol(Float.parseFloat(request.getParameter("CT")));
				c.setHDIC(Float.parseFloat(request.getParameter("HDL")));
				c.setLDLC(Float.parseFloat(request.getParameter("LDL")));
				c.setTryGly(Float.parseFloat(request.getParameter("Try")));
				cd.insertReport(c);
				request.getRequestDispatcher("afterelogin.jsp").forward(request, response);
				
			}
			else if(submitType.equals("Submit-CBC")) {
				
				CBC cd = new CBCImpl();
				CBCReport c = new CBCReport();
				c.setCustID(Integer.parseInt(request.getParameter("cid")));
				c.setName(request.getParameter("name"));
				c.setGender(request.getParameter("gender"));
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
				Date parsed;
				try {
					parsed = sdf.parse(request.getParameter("date"));
					c.setDate(parsed);
	
				} catch (ParseException e) {
					e.printStackTrace();
				}
				c.setHb(Float.parseFloat(request.getParameter("hb")));
				c.setRBC(Float.parseFloat(request.getParameter("rbc")));
				c.setWBC(Float.parseFloat(request.getParameter("wbc")));
				c.setPlatelet(Float.parseFloat(request.getParameter("plt")));
				c.setHCT(Float.parseFloat(request.getParameter("hct")));
				c.setMCV(Float.parseFloat(request.getParameter("mcv")));
				c.setMCH(Float.parseFloat(request.getParameter("mch")));
				c.setMCHC(Float.parseFloat(request.getParameter("mchc")));
				cd.insertReport(c);
				request.getRequestDispatcher("afterelogin.jsp").forward(request, response);
			}
		} catch(Exception e) {
			System.out.println(e);
		}
	}

}
