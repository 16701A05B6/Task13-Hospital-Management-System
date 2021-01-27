package controller;

import java.util.List;
import dao.IPatientDAO;
import dao.PatientDAOImpl;
import model.Patient;
public class CRUDController {
	 IPatientDAO pImpl = new PatientDAOImpl();

	  public int addPatient(int id, String name, int age, String mobileno) {
	    Patient p= new Patient(id, name, age, mobileno);
	    return pImpl.addPatient(p);
	  }

	  public List<Patient> retrievePatient() {
	    return pImpl.retrievePatient();
	  }

	  public int updatePatient(int id, String name, int age, String mobileno) {
	    Patient p = new Patient(id, name, age, mobileno);
	    return pImpl.updatePatient(p);
	  }

	  public int deletePatient(int id) {
	    Patient p= new Patient();
	    p.setId(id);
	    return pImpl.deletePatient(p);
	  }

	
}
