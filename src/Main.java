import Manager.DBManager;
import Manager.FileManager;
import Manager.patientLoader;

public class Main {

	public static void main(String[] args) {

		DLL ddl = new DLL();
		
		FileManager fm = new FileManager("patient.csv");
		
		DBManager db = new DBManager("jdbc:sqlite:patientsDB:sqlite");
		
		// create tables to insert in db, uncomment only on first run.
		db.createPatientTable();
		
		//loading DDL from csv file
		patientLoader pl = new patientLoader(ddl,fm);
		pl.loadPatient();
	
		//injecting ddl into the GUI
		GUI g = new GUI(ddl,db);
		g.setVisible(true);
		
	}

}
