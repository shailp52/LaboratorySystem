package login.submit.registration;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;

public class CBCImpl implements CBC {
	static Connection con;
	static PreparedStatement ps;

	
	public int insertReport(CBCReport c) {
		
		int status=0;
		try {
			con=MyConnectionProvider.getCon();
			ps=con.prepareStatement("insert into mp1.cbctable(CustID,Name,Gender,Date,Haemoglobin,RBC,WBC,Platelet,HCT,MCV,MCH,MCHC) values(?,?,?,?,?,?,?,?,?,?,?,?)");
			ps.setInt(1, c.getCustID());
			ps.setString(2, c.getName());
			ps.setString(3, c.getGender());
			String pattern = "yyyy-mm-dd";
			SimpleDateFormat sdf = new SimpleDateFormat(pattern);
			String date = sdf.format(c.getDate());
			Date date1 = Date.valueOf(date); 
			ps.setDate(4, date1);
			ps.setFloat(5, c.getHb());
			ps.setFloat(6, c.getRBC());
			ps.setFloat(7, c.getWBC());
			ps.setFloat(8, c.getPlatelet());
			ps.setFloat(9, c.getHCT());
			ps.setFloat(10, c.getMCV());
			ps.setFloat(11, c.getMCH());
			ps.setFloat(12, c.getMCHC());
			status = ps.executeUpdate();
			con.close();
		}catch(Exception e) {
			System.out.println(e);
		}
		return status;
	}

}
