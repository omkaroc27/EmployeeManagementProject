package database;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javapages.Employeedata;



public class Employeedb {
	Connection con;

	public Employeedb(Connection con) {
		this.con = con;
	}

	// for feedback
	public boolean SaveEmployeedata(Employeedata emp) {
		boolean set = false;
		try {
			// Insert data to database
			String query1 = "insert into employeedata(empname,empemail, address,departmentid, phone) values(?,?,?,?,?)";

			PreparedStatement pt = this.con.prepareStatement(query1);
			pt.setString(1, emp.getEmpname());
			pt.setString(2, emp.getEmpemail());
		    pt.setString(3, emp.getAddress());
		    pt.setString(4, emp.getDepartmentid());
		    pt.setString(5, emp.getPhone());
		 	pt.executeUpdate();
			set = true;

			con.commit();
			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return set;
	}



}
