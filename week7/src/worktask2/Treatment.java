package worktask2;

/**
 * Represents a medical treatment or medication prescribed to a patient.
 * 
 * @author Hospital Management System
 * @version 1.0
 */
public class Treatment {
	private String treatmentID;
	private String type;
	private String description;

	/**
	 * Constructs a new Treatment with the specified details.
	 * 
	 * @param treatmentID unique treatment identifier
	 * @param type        type of treatment (e.g., medication, therapy, surgery)
	 * @param description detailed description of the treatment
	 */
	public Treatment(String treatmentID, String type, String description) {
		this.treatmentID = treatmentID;
		this.type = type;
		this.description = description;
	}

	/**
	 * Updates the description of the treatment.
	 * 
	 * @param newDescription the new description
	 */
	public void updateDescription(String newDescription) {
		this.description = newDescription;
		System.out.println("Treatment description updated.");
	}

	/**
	 * Displays all details of the treatment.
	 * 
	 * @return formatted string with treatment details
	 */
	public String viewTreatmentDetails() {
		return String.format("Treatment ID: %s\nType: %s\nDescription: %s", treatmentID, type, description);
	}

	// Getters
	public String getTreatmentID() {
		return treatmentID;
	}

	public String getType() {
		return type;
	}

	public String getDescription() {
		return description;
	}
}