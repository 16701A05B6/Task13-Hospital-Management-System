package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Patient;
import util.Db;
import util.Query;

public class PatientDAOImpl implements IPatientDAO{

	PreparedStatement pst = null;
	  ResultSet rs = null;
	  int result = 0;

	  @Override
	  public int addPatient(Patient p) {
	    try {
	      pst = Db.getConnection().prepareStatement(Query.insert);
	      pst.setInt(1, p.getId());
	      pst.setString(2, p.getName());
	      pst.setInt(3, p.getAge());
	      pst.setString(4, p.getMobileno());
	      result = pst.executeUpdate();
	    } catch (ClassNotFoundException | SQLException e) {
	      result = 0;
	    } finally {
	      try {
	        Db.getConnection().close();
	        pst.close();
	      } catch (ClassNotFoundException e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
	      } catch (SQLException e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
	      }
	    }
	    return result;
	  }
	  
	  @Override
	  public List<Patient> retrievePatient() {
	    List<Patient> list = new ArrayList<Patient>();
	    try {
	      pst = Db.getConnection().prepareStatement(Query.retrieve);
	      rs = pst.executeQuery();
	      while (rs.next()) {
	        Patient p = new Patient(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4));
	        list.add(p);
	      }

	    } catch (ClassNotFoundException | SQLException e) {
	      try {
	        Db.getConnection().close();
	        pst.close();
	        rs.close();
	      } catch (ClassNotFoundException e1) {
	        // TODO Auto-generated catch block
	        e1.printStackTrace();
	      } catch (SQLException e1) {
	        // TODO Auto-generated catch block
	        e1.printStackTrace();
	      }

	    }
	    return list;
	  }
	  
	  @Override
	  public int updatePatient(Patient p) {
	    try {
	      pst = Db.getConnection().prepareStatement(Query.update);
	      pst.setInt(4, p.getId());
	      pst.setString(1, p.getName());
	      pst.setInt(2, p.getAge());
	      pst.setString(3, p.getMobileno());
	      result = pst.executeUpdate();
	    } catch (ClassNotFoundException | SQLException e) {
	      result = 0;
	    } finally {
	      try {
	        Db.getConnection().close();
	        pst.close();
	      } catch (ClassNotFoundException e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
	      } catch (SQLException e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
	      }
	    }
	    return result;
	  }
	  @Override
	  public int deletePatient(Patient p) {
	    try {
	      pst = Db.getConnection().prepareStatement(Query.delete);
	      pst.setInt(1, p.getId());
	      result = pst.executeUpdate();
	    } catch (ClassNotFoundException | SQLException e) {
	      result = 0;
	    } finally {
	      try {
	        Db.getConnection().close();
	        pst.close();
	      } catch (ClassNotFoundException e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
	      } catch (SQLException e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
	      }
	    }
	    return result;
	  }
}
