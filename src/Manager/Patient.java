package Manager;

import java.util.Date;

public class Patient {
	
	private String firstname;
	private String lastName;
	private Date dateOfBirth;
	private String pps;
	private String email;
	private String pastDiagnosis;
	
	
    //Constructor
	public Patient(String firstname, String lastname, Date dob,
			String pps,String email,String pastDiagnosis){
		this.firstname=firstname;
		this.lastName=lastname;
		this.dateOfBirth = dob;
		this.pps = pps;
		this.email = email;
		this.pastDiagnosis = pastDiagnosis;
	}
	//Getters and Setters
	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getPps() {
		return pps;
	}

	public void setPps(String pps) {
		this.pps = pps;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPastDiagnosis() {
		return pastDiagnosis;
	}
	
	public void setPastDiagnosis(String pastDiagnosis) {
		this.pastDiagnosis = pastDiagnosis;
	}
	
	public String toString() {
		return String.format("Firstname=%s; lastName=%s", this.firstname, this.lastName);
	}
}	
