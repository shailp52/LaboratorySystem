package login.submit.registration;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CustomerDAOImpl implements CustomerDOA {

	static Connection con;
	static PreparedStatement ps;
	@Override
	
	
	public int insertCustomer(Customer c) {
		int status=0;
		try {
			con=MyConnectionProvider.getCon();
			ps=con.prepareStatement("insert into mp1.customerinfo(username,name,password,category) values(?,?,?,?)");
			ps.setString(1, c.getUsername());
			ps.setString(2, c.getName());
			ps.setString(3, c.getPassword());
			ps.setString(4, c.getCategory());
			status=ps.executeUpdate();
			con.close();
			
		}catch(Exception e) {
			System.out.println(e);
		}	
		return status;
	}
	

	@Override
	public Customer getCustomer(String userid, String pass) {
		Customer c = new Customer();
		try {
				con=MyConnectionProvider.getCon();
				ps=con.prepareStatement("select * from mp1.customerinfo where username=? and password=?");
				ps.setString(1, userid);
				ps.setString(2, pass);
				
				ResultSet rs = ps.executeQuery();
				while(rs.next()) {
					c.setUsername(rs.getString(1));
					c.setName(rs.getString(2));
					c.setPassword(rs.getString(3));
					c.setCategory(rs.getString(5));
					c.setUserid(rs.getInt(4));
				}
				 
			
		}catch(Exception f) {
			System.out.println(f);
		}
		return c;
		}

}
