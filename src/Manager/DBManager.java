package Manager;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import Interfaces.Iinsertable;


public class DBManager implements Iinsertable {
	private Connection c = null;
	private Statement stmt = null;

	public DBManager(String Connector) {
		// TODO Auto-generated constructor stub
		try {
			Class.forName("org.sqlite.JDBC");
			this.c = DriverManager.getConnection(Connector);
			this.stmt = c.createStatement();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void writeToDB(String stringToExecute) {
        try {
			stmt.executeUpdate(stringToExecute);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
	
	
	public void createPatientTable() {
		try {
			String CreateTable = "Create Table Patients"
					+ "( id         INTEGER       PRIMARY KEY AUTOINCREMENT NOT NULL," + 
					"    firstname       VARCHAR (80) NOT NULL," + 
					"    lastname       VARCHAR (80) NOT NULL," + 
					"    dateOfBirth       DATE NOT NULL," + 
					"    pps VARCHAR (9)   NOT NULL," +
					"    email VARCHAR (80)   NOT NULL," +
					"    pastDiagnosis VARCHAR (200)    NOT NULL," +
					"    threatment VARCHAR (200)   NOT NULL)";
			stmt.executeUpdate(CreateTable);
	}	catch (Exception e) {
		System.err.println(e.getClass().getName()+": "+e.getMessage());
		System.exit(0);
		}	
	}
	
	
}
