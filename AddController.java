package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AddController")
public class AddController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		  CRUDController controller = new CRUDController();
			
		   int id= Integer.parseInt(request.getParameter("id"));
		   String name = request.getParameter("name");
	       int age=Integer.parseInt(request.getParameter("age"));
	       String mobileno = request.getParameter("mobileno");
	       controller.addPatient(id, name, age, mobileno);
	          
	     response.sendRedirect("Login");
	    
	}

}
