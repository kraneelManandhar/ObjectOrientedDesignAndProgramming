package worktask2;

/**
 * Represents an appointment between a patient and doctor.
 * 
 * @author Hospital Management System
 * @version 1.0
 */
public class Appointment {
	private String appointmentID;
	private String appointmentDate;
	private String appointmentTime;
	private Patient patient;
	private Doctor doctor;
	private Treatment treatment;

	/**
	 * Constructs a new Appointment with the specified details.
	 * 
	 * @param appointmentID   unique appointment identifier
	 * @param appointmentDate date of appointment (format: YYYY-MM-DD)
	 * @param appointmentTime time of appointment (format: HH:MM)
	 * @param patient         the patient for the appointment
	 * @param doctor          the doctor for the appointment
	 */
	public Appointment(String appointmentID, String appointmentDate, String appointmentTime, Patient patient,
			Doctor doctor) {
		this.appointmentID = appointmentID;
		this.appointmentDate = appointmentDate;
		this.appointmentTime = appointmentTime;
		this.patient = patient;
		this.doctor = doctor;
		this.treatment = null;
	}

	/**
	 * Reschedules the appointment to a new date and time.
	 * 
	 * @param newDate the new date for the appointment
	 * @param newTime the new time for the appointment
	 * @return true if successfully rescheduled
	 */
	public boolean rescheduleAppointment(String newDate, String newTime) {
		this.appointmentDate = newDate;
		this.appointmentTime = newTime;
		System.out.println("Appointment rescheduled to: " + newDate + " at " + newTime);
		return true;
	}

	/**
	 * Cancels the appointment.
	 * 
	 * @return true if successfully cancelled
	 */
	public boolean cancelAppointment() {
		System.out.println("Appointment " + appointmentID + " has been cancelled.");
		return true;
	}

	/**
	 * Displays all details of the appointment.
	 * 
	 * @return formatted string with appointment details
	 */
	public String viewAppointmentDetails() {
		StringBuilder details = new StringBuilder();
		details.append("Appointment ID: ").append(appointmentID).append("\n");
		details.append("Date: ").append(appointmentDate).append("\n");
		details.append("Time: ").append(appointmentTime).append("\n");
		details.append("Patient: ").append(patient.getName()).append("\n");
		details.append("Doctor: ").append(doctor.getName()).append("\n");
		details.append("Department: ").append(doctor.getDepartment()).append("\n");

		if (treatment != null) {
			details.append("Treatment: ").append(treatment.getDescription());
		} else {
			details.append("Treatment: Not prescribed yet");
		}

		return details.toString();
	}

	// Getters and Setters
	public String getAppointmentID() {
		return appointmentID;
	}

	public String getAppointmentDate() {
		return appointmentDate;
	}

	public String getAppointmentTime() {
		return appointmentTime;
	}

	public Patient getPatient() {
		return patient;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public Treatment getTreatment() {
		return treatment;
	}

	public void setTreatment(Treatment treatment) {
		this.treatment = treatment;
	}
}