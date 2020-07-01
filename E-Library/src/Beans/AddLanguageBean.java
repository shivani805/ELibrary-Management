package Beans;

public class AddLanguageBean {

	
	private String langname;
	private String langdesc;
	public AddLanguageBean(String langname, String langdesc) {
		this.langname=langname;
		this.langdesc=langdesc;
	}
	public String getLangname() {
		return langname;
	}
	public void setLangname(String langname) {
		this.langname = langname;
	}
	public String getLangdesc() {
		return langdesc;
	}
	public void setLangdesc(String langdesc) {
		this.langdesc = langdesc;
	}
	

}
