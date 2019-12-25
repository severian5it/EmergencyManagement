import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import Interfaces.Iinsertable;
import Manager.DBManager;
import Manager.Patient;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComponent;

import java.awt.event.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import javax.swing.InputVerifier;

import java.awt.Font;
import java.awt.Color;

public class GUI extends JFrame {
	private static final long serialVersionUID = 1L;
	DLL dll= new DLL();
    Node current;

	private JPanel contentPane;
	private JTextField txtFirstNameNurse;
	private JTextField txtLastNameNurse;
	private JTextField txtDobNurse;
	private JTextField txtEmailNurse;
	private JTextField txtPpsNurse;
	private JTextArea txtPastDiagnosisNurse;
	private JTextField txtPriority;
	private JTextField txtFirstNameReceptionist;
	private JTextField txtLastNameReceptionist;
	private JTextField txtDobReceptionist;
	private JTextField txtEmailReceptionist;
	private JTextField txtPpsReceptionist;
	private JTextArea txtPastDiagnosisReceptionist;
	private JTextField txtFirstNameDoctor;
	private JTextField txtLastNameDoctor;
	private JTextField txtDobDoctor;
	private JTextField txtEmailDoctor;
	private JTextField txtPpsDoctor;
	private JTextArea txtPastDiagnosisDoctor;
	private JTextArea txtThreatment;
	private JTextField txtCurrentPos;
	private JTabbedPane tabbedPane;
	private JLabel lblNewLabel;
	private JLabel lblLastName;
	private JLabel lblDateOfBirth;
	private JLabel lblNewLabel_1;
	private JLabel lblPps;
	private JLabel lblMedicalHistory;
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;
	private JLabel label_4;
	private JLabel label_5;
	private JLabel label_6;
	private JLabel label_7;
	private JLabel label_8;
	private JLabel label_9;
	private JLabel label_10;
	private JLabel label_11;
	private JLabel lblPriority;
	private JLabel ErrorLabelReception;
	private JLabel ErrorLabelNurse;
	private JLabel ErrorLabelDoctor;

	public GUI(DLL dll, Iinsertable db) {
		this.dll = dll;

	    SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
	    
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 329);
		
		// contentPane
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		

		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(6, 6, 438, 295);
		contentPane.add(tabbedPane);
		
		//Tabs
		JPanel receptionist = new JPanel();
		tabbedPane.addTab("Reception", null, receptionist, null);
		receptionist.setLayout(null);
		
		JPanel nurse = new JPanel();
		tabbedPane.addTab("Nurse", null, nurse, null);
		nurse.setLayout(null);
		
		JPanel doctor = new JPanel();
		tabbedPane.addTab("Doctor", null, doctor, null);
		doctor.setLayout(null);
		
		//TextFields
		txtFirstNameNurse = new JTextField();
		txtFirstNameNurse.setEditable(false);
		txtFirstNameNurse.setBounds(8, 14, 130, 26);
		txtFirstNameNurse.setColumns(10);
		nurse.add(txtFirstNameNurse);
		
		txtFirstNameReceptionist = new JTextField();
		txtFirstNameReceptionist.setToolTipText("First Name");
		txtFirstNameReceptionist.setBounds(6, 14, 130, 26);
		txtFirstNameReceptionist.setColumns(10);
		receptionist.add(txtFirstNameReceptionist);
		
		txtFirstNameDoctor = new JTextField();
		txtFirstNameDoctor.setEditable(false);
		txtFirstNameDoctor.setBounds(8, 14, 130, 26);
		txtFirstNameDoctor.setColumns(10);
		doctor.add(txtFirstNameDoctor);
		
		txtLastNameNurse = new JTextField();
		txtLastNameNurse.setEditable(false);
		txtLastNameNurse.setBounds(138, 14, 130, 26);
		txtLastNameNurse.setColumns(10);
		nurse.add(txtLastNameNurse); 
		
		txtLastNameReceptionist = new JTextField();
		txtLastNameReceptionist.setBounds(136, 14, 130, 26);
		txtLastNameReceptionist.setColumns(10);
		receptionist.add(txtLastNameReceptionist);
		
		txtLastNameDoctor = new JTextField();
		txtLastNameDoctor.setEditable(false);
		txtLastNameDoctor.setBounds(138, 14, 130, 26);
		txtLastNameDoctor.setColumns(10);
		doctor.add(txtLastNameDoctor);
		
		txtDobNurse = new JTextField();
		txtDobNurse.setEditable(false);
		txtDobNurse.setText((String) null);
		txtDobNurse.setColumns(10);
		txtDobNurse.setBounds(278, 14, 130, 26);
		nurse.add(txtDobNurse);

		txtDobReceptionist = new JTextField();
		txtDobReceptionist.setText((String) null);
		txtDobReceptionist.setColumns(10);
		txtDobReceptionist.setBounds(276, 14, 130, 26);
		receptionist.add(txtDobReceptionist);

	    txtDobDoctor = new JTextField();
	    txtDobDoctor.setEditable(false);
		txtDobDoctor.setText((String) null);
		txtDobDoctor.setColumns(10);
		txtDobDoctor.setBounds(278, 14, 130, 26);
		doctor.add(txtDobDoctor);
		
		txtEmailNurse = new JTextField();
		txtEmailNurse.setEditable(false);
		txtEmailNurse.setText((String) null);
		txtEmailNurse.setColumns(10);
		txtEmailNurse.setBounds(8, 52, 265, 26); 
		nurse.add(txtEmailNurse);
		
		txtPpsNurse = new JTextField();
		txtPpsNurse.setEditable(false);
		txtPpsNurse.setText((String) null);
		txtPpsNurse.setColumns(10);
		txtPpsNurse.setBounds(278, 52, 130, 26);
		nurse.add(txtPpsNurse);
		
		txtPastDiagnosisNurse = new JTextArea();
		txtPastDiagnosisNurse.setLineWrap(true);
		txtPastDiagnosisNurse.setEditable(false);
		txtPastDiagnosisNurse.setText((String) null);
		txtPastDiagnosisNurse.setColumns(10);
		txtPastDiagnosisNurse.setBounds(8, 145, 400, 59);
		nurse.add(txtPastDiagnosisNurse);

		txtPpsReceptionist = new JTextField();
		txtPpsReceptionist.setText((String) null);
		txtPpsReceptionist.setColumns(10);
		txtPpsReceptionist.setBounds(276, 52, 130, 26);
		receptionist.add(txtPpsReceptionist);
		
		txtEmailReceptionist = new JTextField();
		txtEmailReceptionist.setText((String) null);
		txtEmailReceptionist.setColumns(10);
		txtEmailReceptionist.setBounds(6, 52, 265, 26);
		receptionist.add(txtEmailReceptionist);
		
		txtPastDiagnosisReceptionist = new JTextArea();
		txtPastDiagnosisReceptionist.setLineWrap(true);
		txtPastDiagnosisReceptionist.setText((String) null);
		txtPastDiagnosisReceptionist.setColumns(10);
		txtPastDiagnosisReceptionist.setBounds(6, 145, 400, 59);
		receptionist.add(txtPastDiagnosisReceptionist);

	    txtPpsDoctor = new JTextField();
	    txtPpsDoctor.setEditable(false);
		txtPpsDoctor.setText((String) null);
		txtPpsDoctor.setColumns(10);
		txtPpsDoctor.setBounds(276, 52, 130, 26);
		doctor.add(txtPpsDoctor);
		
		txtEmailDoctor = new JTextField();
		txtEmailDoctor.setEditable(false);
		txtEmailDoctor.setText((String) null);
		txtEmailDoctor.setColumns(10);
		txtEmailDoctor.setBounds(6, 52, 265, 26);
		doctor.add(txtEmailDoctor);
		
		txtPastDiagnosisDoctor = new JTextArea();
		txtPastDiagnosisDoctor.setEditable(false);
		txtPastDiagnosisDoctor.setText((String) null);
		txtPastDiagnosisDoctor.setColumns(10);
		txtPastDiagnosisDoctor.setBounds(8, 145, 400, 59);
		doctor.add(txtPastDiagnosisDoctor);
		
		txtPriority = new JTextField();
		txtPriority.setText((String) null);
		txtPriority.setColumns(10);
		txtPriority.setBounds(8, 91, 71, 26);
		nurse.add(txtPriority);
		
		txtThreatment = new JTextArea();
		txtThreatment.setLineWrap(true);
		txtThreatment.setText((String) null);
		txtThreatment.setColumns(10);
		txtThreatment.setBounds(8, 90, 400, 36);
		doctor.add(txtThreatment);
		
		txtCurrentPos = new JTextField();
		txtCurrentPos.setText((String) null);
		txtCurrentPos.setColumns(0);
		doctor.add(txtCurrentPos);
		
		//labels
		lblNewLabel = new JLabel("First Name");
		lblNewLabel.setBounds(16, -1, 107, 16);
		receptionist.add(lblNewLabel);
		
		lblLastName = new JLabel("Last Name");
		lblLastName.setBounds(144, -1, 107, 16);
		receptionist.add(lblLastName);
		
		lblDateOfBirth = new JLabel("Date of Birth");
		lblDateOfBirth.setBounds(288, -1, 107, 16);
		receptionist.add(lblDateOfBirth);
		
		lblNewLabel_1 = new JLabel("Email");
		lblNewLabel_1.setBounds(16, 38, 61, 16);
		receptionist.add(lblNewLabel_1);
		
		lblPps = new JLabel("PPS");
		lblPps.setBounds(286, 38, 61, 16);
		receptionist.add(lblPps);
		
		lblMedicalHistory = new JLabel("Medical History");
		lblMedicalHistory.setBounds(16, 129, 120, 16);
		receptionist.add(lblMedicalHistory);
		
		label = new JLabel("Last Name");
		label.setBounds(146, -1, 107, 16);
		nurse.add(label);
		
		label_1 = new JLabel("Date of Birth");
		label_1.setBounds(290, -1, 107, 16);
		nurse.add(label_1);
		
		label_2 = new JLabel("PPS");
		label_2.setBounds(288, 38, 61, 16);
		nurse.add(label_2);
		
		label_3 = new JLabel("Email");
		label_3.setBounds(18, 38, 61, 16);
		nurse.add(label_3);
		
		label_4 = new JLabel("First Name");
		label_4.setBounds(18, -1, 107, 16);
		nurse.add(label_4);
		
		label_5 = new JLabel("Medical History");
		label_5.setBounds(16, 129, 120, 16);
		nurse.add(label_5);
		
		lblPriority = new JLabel("Priority");
		lblPriority.setBounds(18, 77, 107, 16);
		nurse.add(lblPriority);
		
		label_6 = new JLabel("Last Name");
		label_6.setBounds(146, -1, 107, 16);
		doctor.add(label_6);
		
		label_7 = new JLabel("Date of Birth");
		label_7.setBounds(290, -1, 107, 16);
		doctor.add(label_7);
		
		label_8 = new JLabel("PPS");
		label_8.setBounds(288, 38, 61, 16);
		doctor.add(label_8);
		
		label_9 = new JLabel("Email");
		label_9.setBounds(18, 38, 61, 16);
		doctor.add(label_9);
		
		label_10 = new JLabel("First Name");
		label_10.setBounds(18, -1, 107, 16);
		doctor.add(label_10);
		
		label_11 = new JLabel("Medical History");
		label_11.setBounds(16, 129, 120, 16);
		doctor.add(label_11);
		
		JLabel lblTreatment = new JLabel("Treatment");
		lblTreatment.setBounds(18, 77, 120, 16);
		doctor.add(lblTreatment);
		
		ErrorLabelReception = new JLabel("");
		ErrorLabelReception.setForeground(Color.RED);
		ErrorLabelReception.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		ErrorLabelReception.setBounds(16, 227, 369, 16);
		receptionist.add(ErrorLabelReception);
		
		ErrorLabelNurse = new JLabel("");
		ErrorLabelNurse.setForeground(Color.RED);
		ErrorLabelNurse.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		ErrorLabelNurse.setBounds(16, 227, 369, 16);
		nurse.add(ErrorLabelNurse);
		
		ErrorLabelDoctor = new JLabel("");
		ErrorLabelDoctor.setForeground(Color.RED);
		ErrorLabelDoctor.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		ErrorLabelDoctor.setBounds(16, 227, 369, 16);
		doctor.add(ErrorLabelDoctor);
			
		// tab change listener
		ChangeListener changeListener = new ChangeListener() {
			public void stateChanged(ChangeEvent changeEvent) {
			   JTabbedPane sourceTabbedPane = (JTabbedPane)changeEvent.getSource();
			   int index = sourceTabbedPane.getSelectedIndex();
			   // if nurse tab load elements
			   if (index==1) {
				    current = dll.head;
				    txtFirstNameNurse.setText(current.getElement().getFirstname());
				    txtLastNameNurse.setText(current.getElement().getLastName());
				    txtDobNurse.setText(format.format(current.getElement().getDateOfBirth()));
				    txtPpsNurse.setText(current.getElement().getPps());
				    txtEmailNurse.setText(current.getElement().getEmail());
				    txtPastDiagnosisNurse.setText(current.getElement().getPastDiagnosis());
				    txtPriority.setText(current.getPriority().toString());
			   }
			  }
			};
		
	   tabbedPane.addChangeListener(changeListener);
		
	   // input verifier
	   //verify mail format
	   class MailVerifier extends InputVerifier {
		    @Override
		    public boolean verify(JComponent input) {
		    	int textLength = ((JTextField) input).getText().length();
		        String text = ((JTextField) input).getText();
				String EMAIL_PATTERN =  "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" 
		        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
				if (text.matches(EMAIL_PATTERN)) {
					
					if (textLength <=80) {
						
						   ErrorLabelReception.setText(null);
						   return true;
					} 
					else { 
						ErrorLabelReception.setText("Field length cannot exceed 80");
						return false;
						}
				} 
				else { 
					ErrorLabelReception.setText("Please insert a valid mail format");
					return false;
					}
		    }
		}
	   
	   txtEmailReceptionist.setInputVerifier(new MailVerifier());
	 
	   //verify date format
	   class DateVerifier extends InputVerifier {
		    @Override
		    public boolean verify(JComponent input) {
		        String text = ((JTextField) input).getText();
		    	String DATE_PATTERN =  "^\\d{1,2}-\\d{1,2}-\\d{4}$";
				if (text.matches(DATE_PATTERN)) {
					
					   ErrorLabelReception.setText(null);
					   return true;
				} 
				else { 
					ErrorLabelReception.setText("Please insert a valid date format: dd-mm-yyyy");
					return false;
					}
		    }
		}
	   
	   txtDobReceptionist.setInputVerifier(new DateVerifier());
	      
	   //verify 200 length field
	   class Length200Verifier extends InputVerifier {
		    @Override
		    public boolean verify(JComponent input) {
		    	int textLength = 0;
		    	
		    	if (input.getClass() == JTextField.class) { 
		    		textLength = ((JTextField)input).getText().length();
		    	}
		    	else if (input.getClass() == JTextArea.class) { 
		    		textLength = ((JTextArea)input).getText().length();
		    	}
		    	
		    	
				if (textLength <=200) {
					
					   ErrorLabelReception.setText(null);
					   return true;
				} 
				else { 
					ErrorLabelReception.setText("Field length cannot exceed 200 Characters");
					return false;
					}
		    }
		}
	   
	   txtFirstNameReceptionist.setInputVerifier(new Length200Verifier());
	   txtLastNameReceptionist.setInputVerifier(new Length200Verifier());
	   txtPastDiagnosisReceptionist.setInputVerifier(new Length200Verifier());
	  
	   //verify PPS format
	   class PPSVerifier extends InputVerifier {
		    @Override
		    public boolean verify(JComponent input) {
		        String text = ((JTextField) input).getText();
		    	String PPS_PATTERN =  "^(\\d{7})([A-Za-z]{1,2})$";
				if (text.matches(PPS_PATTERN)) {
					
					   ErrorLabelReception.setText(null);
					   return true;
				} 
				else { 
					ErrorLabelReception.setText("PPS must have 7 digit and 1 or 2 letter at the end.");
					return false;
					}
		    }
		}
	   
	   txtPpsReceptionist.setInputVerifier(new PPSVerifier());

	   //verify Priority Format
	   class PriorityVerifier extends InputVerifier {
		    @Override
		    public boolean verify(JComponent input) {
		        String text = ((JTextField) input).getText();
				String PRIORITY_PATTERN =  "^[1-9]|10$";
				if (text.matches(PRIORITY_PATTERN)) {
					
					   ErrorLabelNurse.setText(null);
					   return true;
				} 
				else { 
					ErrorLabelNurse.setText("Please insert a number between 1 and 10");
					return false;
					}
		    }
		}
	   
	   txtPriority.setInputVerifier(new PriorityVerifier());
	   
	   //buttons
	   JButton btnSave = new JButton("Save");
	   btnSave.setBounds(310, 203, 75, 29);
	   btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					dll.add(new Patient(txtFirstNameReceptionist.getText(),txtLastNameReceptionist.getText(),
							format.parse (txtDobReceptionist.getText()),txtPpsReceptionist.getText(),
							txtEmailReceptionist.getText(),txtPastDiagnosisReceptionist.getText()));
					
					   ErrorLabelReception.setText("Patient Checked in Successfully");
					   JOptionPane.showMessageDialog(null, "Patient Checked in Successfully");
					   //cleaning pane
					   txtFirstNameReceptionist.setText(null);
					   txtLastNameReceptionist.setText(null);
					   txtPastDiagnosisReceptionist.setText(null);
					   txtDobReceptionist.setText(null);
					   txtPpsReceptionist.setText(null);
					   txtEmailReceptionist.setText(null);
					   ErrorLabelReception.setText(null);
				} catch (ParseException e1) {
					e1.printStackTrace();
				}
			}
		});
		receptionist.add(btnSave);
		
		JButton btnPrevious = new JButton("Previous");
		btnPrevious.setBounds(242, 203, 97, 29);
		btnPrevious.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (current.getPrevious() != null) {
				   current = current.getPrevious();
				   txtFirstNameNurse.setText(current.getElement().getFirstname());
				   txtLastNameNurse.setText(current.getElement().getLastName());
				   txtPastDiagnosisNurse.setText(current.getElement().getPastDiagnosis());
				   txtDobNurse.setText(format.format(current.getElement().getDateOfBirth()));
				   txtPpsNurse.setText(current.getElement().getPps());
				   txtEmailNurse.setText(current.getElement().getEmail());
				   txtPriority.setText(current.getPriority().toString());
				   ErrorLabelNurse.setText(null);
				}
			}
		});
		nurse.add(btnPrevious);
		
		JButton btnNext = new JButton("Next");
		btnNext.setBounds(333, 203, 75, 29);
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (current.getNext() != null) {
				   current = current.getNext();
				   txtFirstNameNurse.setText(current.getElement().getFirstname());
				   txtLastNameNurse.setText(current.getElement().getLastName());
				   txtPastDiagnosisNurse.setText(current.getElement().getPastDiagnosis());
				   txtDobNurse.setText(format.format(current.getElement().getDateOfBirth()));
				   txtPpsNurse.setText(current.getElement().getPps());
				   txtEmailNurse.setText(current.getElement().getEmail());
				   txtPriority.setText(current.getPriority().toString());
				   ErrorLabelNurse.setText(null);
				}
			}
		});
		nurse.add(btnNext);
				
		JButton btnPriority = new JButton("SetPriority");
		btnPriority.setBounds(8, 203, 97, 29);
		nurse.add(btnPriority);
		
		btnPriority.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtPriority.getText() != null) {
                   current.setPriority(Integer.parseInt(txtPriority.getText()));
                   ErrorLabelNurse.setText("Priority Set Successfully");
				}
			}
		});

		JButton btnCallNext = new JButton("CallNext");
		btnCallNext.setBounds(8, 203, 97, 29);
		doctor.add(btnCallNext);
		btnCallNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if ( dll.getHighestPriority() != null) {
                   current = dll.getHighestPriority();
                   Integer currentPos = dll.getHighestPriorityPosition();
				   txtFirstNameDoctor.setText(current.getElement().getFirstname());
				   txtLastNameDoctor.setText(current.getElement().getLastName());
				   txtPastDiagnosisDoctor.setText(current.getElement().getPastDiagnosis());
				   txtDobDoctor.setText(format.format(current.getElement().getDateOfBirth()));
				   txtPpsDoctor.setText(current.getElement().getPps());
				   txtEmailDoctor.setText(current.getElement().getEmail());
				   txtCurrentPos.setText(currentPos.toString());
				   txtThreatment.setText(null);
				}
			}
		});
		
		JButton btnDismiss = new JButton("Dismiss");
		btnDismiss.setBounds(333, 203, 75, 29);
		btnDismiss.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!txtFirstNameDoctor.getText().equals("")) {
				   if (!txtThreatment.getText().equals("")) {

					   String stringToExecute = "Insert into Patients(firstname,lastname,dateOfBirth,pps,email,pastDiagnosis,threatment)" +
								"Values('"+current.getElement().getFirstname()+"','"+current.getElement().getLastName()+"','"
								+new SimpleDateFormat("yyyy-MM-dd").format(current.getElement().getDateOfBirth())+"','"
								+current.getElement().getPps()+"','"+current.getElement().getEmail()+"','"
								+current.getElement().getPastDiagnosis()+"','"+txtThreatment.getText()+"')";
					   
					   dll.remove(Integer.parseInt(txtCurrentPos.getText()));
	
					   db.writeToDB(stringToExecute);
					   
					   ErrorLabelDoctor.setText("Patient Dismissed Successfully");
					   JOptionPane.showMessageDialog(null, "Patient Dismissed Successfully");
					   
					   txtFirstNameDoctor.setText(null);
					   txtLastNameDoctor.setText(null);
					   txtPastDiagnosisDoctor.setText(null);
					   txtDobDoctor.setText(null);
					   txtPpsDoctor.setText(null);
					   txtEmailDoctor.setText(null);
					   txtCurrentPos.setText(null);
					   txtThreatment.setText(null);
					   ErrorLabelDoctor.setText(null);
				   }
				   else {   
					   ErrorLabelDoctor.setText("Insert a Threatment");
				   }
				}
				else {   
				 ErrorLabelDoctor.setText("Please Call Next Patient"); 
				}
			}
		});
		doctor.add(btnDismiss);
	}
}
