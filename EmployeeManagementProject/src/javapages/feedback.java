package javapages;


public class feedback {
   private String name;
   private String email;
   private String phoneno;
   private String companyname;
   private String feedbackmsg;
   
 public feedback(String name, String email, String phoneno, String companyname, String feedbackmsg) {
	super();
	this.name = name;
	this.email = email;
	this.phoneno = phoneno;
	this.companyname = companyname;
	this.feedbackmsg = feedbackmsg;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getPhoneno() {
	return phoneno;
}

public void setPhoneno(String phoneno) {
	this.phoneno = phoneno;
}

public String getCompanyname() {
	return companyname;
}

public void setCompanyname(String companyname) {
	this.companyname = companyname;
}

public String getFeedbackmsg() {
	return feedbackmsg;
}

public void setFeedbackmsg(String feedbackmsg) {
	this.feedbackmsg = feedbackmsg;
}

  
    
}

