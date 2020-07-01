package Beans;

public class AddLibraryBean {
private String lname;
private String lmob;
private String ladd;
	public AddLibraryBean(String lname, String lmob, String ladd) {
		this.lname=lname;
		this.lmob=lmob;
		this.ladd=ladd;
	}

public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}
public String getLmob() {
	return lmob;
}
public void setLmob(String lmob) {
	this.lmob = lmob;
}
public String getLadd() {
	return ladd;
}
public void setLadd(String ladd) {
	this.ladd = ladd;
}

}
