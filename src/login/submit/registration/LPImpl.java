package login.submit.registration;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;

public class LPImpl implements LP {
	static Connection con;
	static PreparedStatement ps;

	public int insertReport(LPReport c) {
		int status=0;
		
		try {
			con=MyConnectionProvider.getCon();
			ps=con.prepareStatement("insert into mp1.lptable(CustID,Name,Gender,Date,Cholesterol,HDICholesterol,LDLCholesterol,Tryglycerides) values(?,?,?,?,?,?,?,?)");
			ps.setInt(1, c.getCustID());
			ps.setString(2, c.getName());
			ps.setString(3, c.getGender());
			String pattern = "yyyy-mm-dd";
			SimpleDateFormat sdf = new SimpleDateFormat(pattern);
			String date = sdf.format(c.getDate());
			Date date1 = Date.valueOf(date); 
			ps.setDate(4, date1);
			ps.setFloat(5, c.getChloesterol());
			ps.setFloat(6, c.getHDIC());
			ps.setFloat(7, c.getLDLC());
			ps.setFloat(8, c.getTryGly());
			status = ps.executeUpdate();
			con.close();
		}catch(Exception e) {
			System.out.println(e);
		}
		return status;
		
	}

}
