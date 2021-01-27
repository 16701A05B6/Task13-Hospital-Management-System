package controller;
import dao.AdminDAOImpl;
import dao.IAdminDAO;
import model.Admin;
public class AdminLoginController {
	IAdminDAO iadmin = new AdminDAOImpl();

	  public int authenticate(String username, String password) {  
	    Admin admin = new Admin(username, password);
	    return iadmin.adminValidation(admin);
	  }
}
