package Beans;

public class UserBean {
private String uname;
private String upass;
private String umob;

 

public UserBean(String uname,String upass, String umob) {
	
	this.uname=uname;
	this.upass=upass;
	this.umob=umob;
}

public String getUname() {
	return uname;
}
public void setUname(String uname) {
	this.uname = uname;
}
public String getUpass() {
	return upass;
}
public void setUpass(String upass) {
	this.upass = upass;
}
public String getUmob() {
	return umob;
}
public void setUmob(String umob) {
	this.umob = umob;
}

}
