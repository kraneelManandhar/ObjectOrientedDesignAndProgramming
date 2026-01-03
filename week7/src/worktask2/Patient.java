package worktask2;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a patient in the hospital system. Extends Person class and adds
 * patient-specific functionality.
 * 
 * @author Hospital Management System
 * @version 1.0
 */
public class Patient extends Person {
	private String patientID;
	private List<Appointment> appointments;

	/**
	 * Constructs a new Patient with the specified details.
	 * 
	 * @param patientID     the unique patient identifier
	 * @param personDetails the Person object containing basic details
	 */
	public Patient(String patientID, Person personDetails) {
		super(personDetails.personID, personDetails.name, personDetails.age, personDetails.gender,
				personDetails.address, personDetails.contactDetails);
		this.patientID = patientID;
		this.appointments = new ArrayList<>();
	}

	/**
	 * Books a new appointment with a doctor.
	 * 
	 * @param doctor the doctor to book appointment with
	 * @param date   the date of appointment
	 * @param time   the time of appointment
	 * @return true if appointment was successfully booked, false otherwise
	 */
	public boolean bookAppointment(Doctor doctor, String date, String time) {
		// Generate appointment ID
		String appointmentID = "APT" + System.currentTimeMillis();

		Appointment appointment = new Appointment(appointmentID, date, time, this, doctor);
		appointments.add(appointment);
		doctor.addAppointment(appointment);

		System.out.println("Appointment booked successfully!");
		System.out.println("Appointment ID: " + appointmentID);
		return true;
	}

	/**
	 * Gets all appointments for this patient.
	 * 
	 * @return list of appointments
	 */
	public List<Appointment> getAppointments() {
		return new ArrayList<>(appointments);
	}

	// Getter
	public String getPatientID() {
		return patientID;
	}
}