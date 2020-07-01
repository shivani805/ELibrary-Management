package Beans;

public class AddStudentBeans {
	
	
	private String stuname;
	private String studob;
	private String stunation;
	private String stumob;
	private String stuadd;
	private String stuemail;
	private String stugender;
	private String stulogin;
	private String stupass;

	public AddStudentBeans(String stuname, String studob, String stunation, String stumob,
			String stuadd, String stuemail, String stugender, String stulogin, String stupass) {
		
		this.stuname=stuname;
		this.studob=studob;
		this.stunation=stunation;
		this.stumob=stumob;
		this.stuadd=stuadd;
		this.stuemail=stuemail;
		this.stugender=stugender;
		this.stulogin=stulogin;
		this.stupass=stupass;
	}
	public String getStuname() {
		return stuname;
	}

	public void setStuname(String stuname) {
		this.stuname = stuname;
	}

	public String getStudob() {
		return studob;
	}

	public void setStudob(String studob) {
		this.studob = studob;
	}

	public String getStunation() {
		return stunation;
	}

	public void setStunation(String stunation) {
		this.stunation = stunation;
	}

	public String getStumob() {
		return stumob;
	}

	public void setStumob(String stumob) {
		this.stumob = stumob;
	}

	public String getStuadd() {
		return stuadd;
	}

	public void setStuadd(String stuadd) {
		this.stuadd = stuadd;
	}

	public String getStuemail() {
		return stuemail;
	}

	public void setStuemail(String stuemail) {
		this.stuemail = stuemail;
	}

	public String getStugender() {
		return stugender;
	}

	public void setStugender(String stugender) {
		this.stugender = stugender;
	}

	public String getStulogin() {
		return stulogin;
	}

	public void setStulogin(String stulogin) {
		this.stulogin = stulogin;
	}

	public String getStupass() {
		return stupass;
	}

	public void setStupass(String stupass) {
		this.stupass = stupass;
	}

	
		
	
}
