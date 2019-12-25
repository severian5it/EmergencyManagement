package Manager;
import java.util.ArrayList;

import Interfaces.Iaddable;
import Interfaces.Iextractable;

public class patientLoader {
	
	private Iextractable Manager;
	private Iaddable objectToPopulate;
	
	public patientLoader(Iaddable objectToPopulate, Iextractable Manager) {
		this.Manager = Manager;
		this.objectToPopulate = objectToPopulate ;
	}
	
	public void loadPatient()  {
		
		ArrayList<Patient> toLoad = Manager.extractPatients();
		for (int i=0; i < toLoad.size(); i++ ) {	
			objectToPopulate.add(toLoad.get(i));
		}
	}

}
