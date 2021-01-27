package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;
public class Db {
	private Db() {
	    // TODO Auto-generated constructor stub
	  }

	  public static Connection getConnection() throws ClassNotFoundException, SQLException {    
	    ResourceBundle bundle = ResourceBundle.getBundle("db");
	    Class.forName(bundle.getString("driver"));
	    Connection connection = DriverManager.getConnection(bundle.getString("url"), bundle.getString("user"),
	        bundle.getString("pass"));
	    return connection;
	  }
}

