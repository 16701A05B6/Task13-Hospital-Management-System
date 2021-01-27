package dao;

import java.util.List;

import model.Patient;

public interface IPatientDAO {
	public int addPatient(Patient p);

	  public List<Patient> retrievePatient();

	  public int updatePatient(Patient p);

	  public int deletePatient(Patient p);

}
