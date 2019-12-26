package login.submit.registration;

public class BMReport {
	private int ReportID;
	private int CustID;
	private String Name;
	private String Gender;
	private java.util.Date date;
	private float Glucoze;
	private float BUN;
	private float Creatinin;
	private float BUNCRatio;
	private float Chloride;
	private int StatusReport;
	
	
	public int getStatusReport() {
		return StatusReport;
	}
	public void setStatusReport(int statusReport) {
		StatusReport = statusReport;
	}
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
	public void setDate(java.util.Date dtrDate) {
		this.date = dtrDate;
	}
	public float getGlucoze() {
		return Glucoze;
	}
	public void setGlucoze(float glucoze) {
		Glucoze = glucoze;
	}
	public float getBUN() {
		return BUN;
	}
	public void setBUN(float bUN) {
		BUN = bUN;
	}
	public float getCreatinin() {
		return Creatinin;
	}
	public void setCreatinin(float creatinin) {
		Creatinin = creatinin;
	}
	public float getBUNCRatio() {
		return BUNCRatio;
	}
	public void setBUNCRatio(float bUNCRatio) {
		BUNCRatio = bUNCRatio;
	}
	public float getChloride() {
		return Chloride;
	}
	public void setChloride(float chloride) {
		Chloride = chloride;
	}
	
	
}
