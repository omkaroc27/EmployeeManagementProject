package javapages;

public class Employeedata {
	  private String empname;
	   private String empemail;
	   private String address;
	   private String departmentid;;
	   private String phone;
	   
	   
	public Employeedata(String empname, String empemail, String address, String departmentid, String phone) {
		super();
		this.empname = empname;
		this.empemail = empemail;
		this.address = address;
		this.departmentid = departmentid;
		this.phone = phone;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public String getEmpemail() {
		return empemail;
	}

	public void setEmpemail(String empemail) {
		this.empemail = empemail;
	}

	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDepartmentid() {
		return departmentid;
	}
	public void setDepartmentid(String departmentid) {
		this.departmentid = departmentid;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	   
	   
}
