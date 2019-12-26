package login.submit.registration;

public class LPReport {
	private int ReportID;
	private int CustID;
	private String Name;
	private String Gender;
	private java.util.Date date;
	private float Chloesterol;
	private float HDIC;
	private float LDLC;
	private float TryGly;
	public int getReportID() {
		return ReportID;
	}
	public void setReportID(int reportID) {
		ReportID = reportID;
	}
	public int getCustID() {
		return CustID;
	}
	public void setCustID(int custID) {
		CustID = custID;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public java.util.Date getDate() {
		return date;
	}
	public void setDate(java.util.Date date) {
		this.date = date;
	}
	public float getChloesterol() {
		return Chloesterol;
	}
	public void setChloesterol(float chloesterol) {
		Chloesterol = chloesterol;
	}
	public float getHDIC() {
		return HDIC;
	}
	public void setHDIC(float hDIC) {
		HDIC = hDIC;
	}
	public float getLDLC() {
		return LDLC;
	}
	public void setLDLC(float lDLC) {
		LDLC = lDLC;
	}
	public float getTryGly() {
		return TryGly;
	}
	public void setTryGly(float tryGly) {
		TryGly = tryGly;
	}
	
	
}
