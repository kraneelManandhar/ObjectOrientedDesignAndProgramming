package worktask2;

/**
 * Represents a generic person in the hospital system. This is the parent class
 * for both Patient and Doctor.
 * 
 * @author Hospital Management System
 * @version 1.0
 */
public class Person {
	protected String personID;
	protected String name;
	protected int age;
	protected String gender;
	protected String address;
	protected String contactDetails;

	/**
	 * Constructs a new Person with the specified details.
	 * 
	 * @param personID       the unique identifier for the person
	 * @param name           the full name of the person
	 * @param age            the age of the person
	 * @param gender         the gender of the person
	 * @param address        the residential address
	 * @param contactDetails phone number and/or email
	 */
	public Person(String personID, String name, int age, String gender, String address, String contactDetails) {
		this.personID = personID;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.address = address;
		this.contactDetails = contactDetails;
	}

	/**
	 * Displays all personal details of the person.
	 * 
	 * @return a formatted string containing all personal details
	 */
	public String viewPersonalDetails() {
		return "ID: " + personID + "\n" +
			           "Name: " + name + "\n" +
			           "Age: " + age + "\n" +
			           "Gender: " + gender + "\n" +
			           "Address: " + address + "\n" +
			           "Contact: " + contactDetails;
	}

	// Getters
	public String getPersonID() {
		return personID;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getGender() {
		return gender;
	}

	public String getAddress() {
		return address;
	}

	public String getContactDetails() {
		return contactDetails;
	}
}