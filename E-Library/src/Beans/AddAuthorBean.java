package Beans;

public class AddAuthorBean {
	private String aname;
	private String amob;
	private String aadd;
	public AddAuthorBean(String aname, String amob, String aadd) {
		this.aname=aname;
		this.amob=amob;
		this.aadd=aadd;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getAmob() {
		return amob;
	}
	public void setAmob(String amob) {
		this.amob = amob;
	}
	public String getAadd() {
		return aadd;
	}
	public void setAadd(String aadd) {
		this.aadd = aadd;
	}
	

}
