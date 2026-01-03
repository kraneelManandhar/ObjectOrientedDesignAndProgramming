package worktask2;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a doctor in the hospital system. Extends Person class and adds
 * doctor-specific functionality.
 * 
 * @author Hospital Management System
 * @version 1.0
 */
public class Doctor extends Person {
	private String doctorID;
	private String department;
	private List<Appointment> appointments;

	/**
	 * Constructs a new Doctor with the specified details.
	 * 
	 * @param doctorID      the unique doctor identifier
	 * @param department    the medical department/specialization
	 * @param personDetails the Person object containing basic details
	 */
	public Doctor(String doctorID, String department, Person personDetails) {
		super(personDetails.personID, personDetails.name, personDetails.age, personDetails.gender,
				personDetails.address, personDetails.contactDetails);
		this.doctorID = doctorID;
		this.department = department;
		this.appointments = new ArrayList<>();
	}

	/**
	 * Views the details of a specific patient.
	 * 
	 * @param patient the patient whose details to view
	 * @return string containing patient details
	 */
	public String seePatientDetails(Patient patient) {
		return "Patient Details:\n" + patient.viewPersonalDetails();
	}

	/**
	 * Prescribes a treatment for a patient during an appointment.
	 * 
	 * @param appointment the appointment where treatment is prescribed
	 * @param treatment   the treatment to prescribe
	 * @return true if treatment was successfully prescribed
	 */
	public boolean prescribeTreatment(Appointment appointment, Treatment treatment) {
		if (appointment.getDoctor().equals(this)) {
			appointment.setTreatment(treatment);
			System.out.println(
					"Treatment prescribed successfully for appointment: " + appointment.getAppointmentID());
			return true;
		}
		System.out.println("Cannot prescribe treatment: This is not your appointment.");
		return false;
	}

	/**
	 * Adds an appointment to the doctor's schedule.
	 * 
	 * @param appointment the appointment to add
	 */
	public void addAppointment(Appointment appointment) {
		appointments.add(appointment);
	}

	/**
	 * Gets all appointments for this doctor.
	 * 
	 * @return list of appointments
	 */
	public List<Appointment> getAppointments() {
		return new ArrayList<>(appointments);
	}

	// Getters
	public String getDoctorID() {
		return doctorID;
	}

	public String getDepartment() {
		return department;
	}
}