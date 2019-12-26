package login.submit.registration;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/loginRegister")
public class LoginRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public LoginRegister() {
        
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CustomerDOA cd = new CustomerDAOImpl();
		String userName = request.getParameter("uname");
		String password = request.getParameter("pass1");
		String submitType = request.getParameter("submit");
		Customer c = new Customer();
		c = cd.getCustomer(userName, password);	
	        
		if( submitType.equals("login") && c!=null && c.getName()!=null) {
			if(c.getCategory().equals("C")) {
				request.setAttribute("username", c.getName());
				HttpSession session = request.getSession();
				session.setAttribute("userid",c.getUserid());
				session.setAttribute("name", c.getName());
		        request.getRequestDispatcher("afterclogin.jsp").forward(request, response);  
				
			}else if(c.getCategory().equals("E")) {
				
				request.setAttribute("message", c.getName()); 
				HttpSession session = request.getSession();
				session.setAttribute("userid",c.getUserid());
				
		        request.getRequestDispatcher("afterelogin.jsp").forward(request, response);
			} 
				
			else if(c.getCategory().equals("A")) {
				HttpSession session = request.getSession();
				session.setAttribute("userid",c.getUserid());
		        request.getRequestDispatcher("afteralogin.jsp").forward(request, response);
			} 
		}
	
		else if( submitType.equals("customer register") ) {
			
			c.setName(request.getParameter("name1"));
			c.setPassword(password);
			c.setUsername(userName);
			c.setCategory("C");
			cd.insertCustomer(c);
			request.setAttribute("successCMessage", "Registration done, Please Login to continue.");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		
			
		}else if ( submitType.equals("employee register") ){
			
			c.setName(request.getParameter("name1"));
			c.setPassword(password);
			c.setUsername(userName);
			c.setCategory("E");
			cd.insertCustomer(c);
			request.setAttribute("successAMessage", "Registration done.");
			request.getRequestDispatcher("afteralogin.jsp").forward(request, response);
			
		}else {
		
			request.setAttribute("message", "Data Not Found! Please Register.");
			request.getRequestDispatcher("login.jsp").forward(request, response);;
		}
		
		
		
		
	}

}
