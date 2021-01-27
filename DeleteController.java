package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DeleteController")
public class DeleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CRUDController controller = new CRUDController();
		int id = Integer.parseInt(request.getParameter("id"));
		  int result = controller.deletePatient(id);
		  if(result==1)
		  {
		  response.sendRedirect("Login");
		  }
		  else
		  {
			  String msg="Delete unSuccesfully";
	  			request.setAttribute("message", msg);
	  			RequestDispatcher rd=request.getRequestDispatcher("retrieve.jsp");
	  			rd.forward(request,response);
	  		  response.sendRedirect("Login");
		  }
		
	}
}

