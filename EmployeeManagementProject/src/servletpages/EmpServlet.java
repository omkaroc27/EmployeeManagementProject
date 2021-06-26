package servletpages;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import database.DbConnection;
import database.Employeedb;
import javapages.Employeedata;

@WebServlet("/EmpServlet")
public class EmpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmpServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		PrintWriter out=response.getWriter();
		String empname = request.getParameter("empname");
		String empemail = request.getParameter("empemail");
		String address=request.getParameter("address");
		String departmentid=request.getParameter("departmentid");
		String phone=request.getParameter("phone");
		
	     Employeedata EmployeedataModel = new Employeedata(empname, empemail, address, departmentid, phone);
		//create a database model 
		
		Employeedb empdata =new Employeedb(DbConnection.getConnection());
     	  if  (empdata.SaveEmployeedata(EmployeedataModel)) {
		
		  response.sendRedirect("empadd.htm");
		}else {

			out.println("Sorry! unable to save record");

		    }
	}

}
