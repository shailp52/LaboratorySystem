package login.submit.registration;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;

public class BMImpl implements BM {
	static Connection con;
	static PreparedStatement ps;

	
	public int insertReport(BMReport c) {
		int status=0;
		try {
			con=MyConnectionProvider.getCon();
			ps=con.prepareStatement("insert into mp1.bmtable(CustID,Name,Gender,Date,Glucoze,BUN,Creatinin,BUNCRatio,Chloride) values(?,?,?,?,?,?,?,?,?)");
			ps.setInt(1, c.getCustID());
			ps.setString(2, c.getName());
			ps.setString(3, c.getGender());
			String pattern = "yyyy-mm-dd";
			SimpleDateFormat sdf = new SimpleDateFormat(pattern);
			String date = sdf.format(c.getDate());
			Date date1 = Date.valueOf(date); 
			ps.setDate(4, date1);
			ps.setFloat(5, c.getGlucoze());
			ps.setFloat(6, c.getBUN());
			ps.setFloat(7, c.getCreatinin());
			ps.setFloat(8, c.getBUNCRatio());
			ps.setFloat(9, c.getChloride());
			status = ps.executeUpdate();
			con.close();
		}catch(Exception e) {
			System.out.println(e);
		}
		return status;
	}

}
