package database;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javapages.feedback;



public class Feedbackdb {
	Connection con;

	public Feedbackdb(Connection con) {
		this.con = con;
	}

	// for feedback
	public boolean Savefeedback(feedback fd) {
		boolean set = false;
		try {
			// Insert data to database
			String query = "insert into feedback(name,email, phoneno, companyname, feedbackmsg) values(?,?,?,?,?)";

			PreparedStatement pt = this.con.prepareStatement(query);
			pt.setString(1, fd.getName());
			pt.setString(2, fd.getEmail());
		    pt.setString(3, fd.getPhoneno());
		    pt.setString(4, fd.getCompanyname());
		    pt.setString(5, fd.getFeedbackmsg());
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
