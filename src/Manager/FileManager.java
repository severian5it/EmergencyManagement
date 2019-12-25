package Manager;
import java.io.BufferedReader;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import Interfaces.Iextractable;


public class FileManager implements Iextractable
{

	private String patientFile;

	public FileManager(String patientFile) {
		this.patientFile = patientFile;
	}
	
	
	public ArrayList<Patient> extractPatients() {
		
		BufferedReader bfReader = null;
		
		ArrayList<Patient> output = new ArrayList<Patient>();
		
		try {
			String line ="";
			
			bfReader = new BufferedReader( new FileReader(this.patientFile));
			
			while ((line = bfReader.readLine())!= null) {
				String fields[] = line.split(",");

				Patient p = new Patient(fields[0],fields[1],new SimpleDateFormat("dd/MM/yyyy").parse(fields[2]),
						fields[3],(fields[4]),fields[5]);
				
				output.add(p);;
			}
			
			
		} catch(Exception ex) {
			ex.printStackTrace();
		}finally { 
			try {
				bfReader.close();

			}
			catch(Exception ex) {
				ex.printStackTrace();
			}
		}
		return output;
	}
}
