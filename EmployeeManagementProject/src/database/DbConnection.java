
	package database;

	import java.sql.*;


	public class DbConnection {
	    private static Connection con;
	    
	    public static Connection getConnection(){
	        try{
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","Omkaroc","1234");
	            
	        }catch(Exception e){
	            e.printStackTrace();
	        }
	        return con;
	    }
	}


