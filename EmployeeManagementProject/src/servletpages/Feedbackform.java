package servletpages;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import database.DbConnection;
import database.Feedbackdb;

import javapages.feedback;

@WebServlet("/Feedbackform ")
public class Feedbackform extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Feedbackform() {
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
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String phoneno=request.getParameter("phoneno");
		String companyname=request.getParameter("companyname");
		String feedbackmsg=request.getParameter("feedbackmsg");
		//make user object
		
		feedback feedbackModel = new  feedback(name,email,phoneno,companyname,feedbackmsg);
	
		//create a database model
      	Feedbackdb regfd = new Feedbackdb(DbConnection.getConnection());  
		if (regfd.Savefeedback(feedbackModel)) {
			response.setContentType("text/html");  
			out.println("<script type=\"text/javascript\">");  
			out.println("alert('Record saved successfully!');");  
			out.println("</script>");
			request.getRequestDispatcher("contact.html").include(request, response);
		}else {

			out.println("Sorry! unable to save record");

		    }

	}
	}


