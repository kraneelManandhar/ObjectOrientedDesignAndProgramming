package worktask2;

/**
 * Demonstration of the Hospital Management System.
 * Shows all required functionalities in action.
 */
public class HospitalManagementDemo {
    public static void main(String[] args) {
        System.out.println("HOSPITAL MANAGEMENT SYSTEM DEMO");
        
        Person kraneelPerson = new Person("P001", "Kraneel Manandhar", 32, "Male", 
                                      "Boudha, Kathmandu", "980-123-4567");
        Person sirjeetPerson = new Person("P002", "Sirjeet Gurung", 25, "Male", 
                                      "Pokhara, Gandaki", "981-234-5678");
        Person prayashPerson = new Person("P003", "Prayash Thapa", 40, "Male", 
                                       "Biratnagar, Province 1", "982-345-6789");
        Person anjaliPerson = new Person("P004", "Anjali Rai", 29, "Female", 
                                      "Dharan, Sunsari", "983-456-7890");
        
        Person drShrishPerson = new Person("D001", "Dr. Shrish Sharma", 45, "Male", 
                                         "Patan, Lalitpur", "984-567-8901");
        Person drPriyaPerson = new Person("D002", "Dr. Priya Basnet", 38, "Female", 
                                          "Bhaktapur, Nepal", "985-678-9012");
        Person drRohanPerson = new Person("D003", "Dr. Rohan Karki", 50, "Male", 
                                         "Kirtipur, Kathmandu", "986-789-0123");
        
        Patient patientKraneel = new Patient("PAT001", kraneelPerson);
        Patient patientSirjeet = new Patient("PAT002", sirjeetPerson);
        Patient patientPrayash = new Patient("PAT003", prayashPerson);
        Patient patientAnjali = new Patient("PAT004", anjaliPerson);
        
        Doctor doctorShrish = new Doctor("DOC001", "Cardiology", drShrishPerson);
        Doctor doctorPriya = new Doctor("DOC002", "Pediatrics", drPriyaPerson);
        Doctor doctorRohan = new Doctor("DOC003", "Orthopedics", drRohanPerson);
        
        // 3. Demonstrate patient booking appointment
        System.out.println("1. Patient Booking Appointment:");
        System.out.println("Patient: " + patientKraneel.getName());
        System.out.println("Doctor: " + doctorShrish.getName());
        patientKraneel.bookAppointment(doctorShrish, "2024-12-15", "10:30 AM");
        
        Appointment appointment = patientKraneel.getAppointments().get(0);
        
        System.out.println("\n2. Appointment Details:");
        System.out.println(appointment.viewAppointmentDetails());
        
        System.out.println("\n3. Doctor Viewing Patient Details:");
        System.out.println(doctorShrish.seePatientDetails(patientKraneel));
        
        System.out.println("\n4. Doctor Prescribing Treatment:");
        Treatment treatment = new Treatment("TR001", "Medication", 
                                           "Take Aspirin 100mg once daily for 7 days");
        doctorShrish.prescribeTreatment(appointment, treatment);
        
        System.out.println("\n5. Updated Appointment Details:");
        System.out.println(appointment.viewAppointmentDetails());
        
        System.out.println("\n6. Rescheduling Appointment:");
        appointment.rescheduleAppointment("2024-12-20", "2:00 PM");
        
        System.out.println("\n7. Updating Treatment Description:");
        treatment.updateDescription("Take Aspirin 100mg once daily for 7 days. Avoid alcohol.");
        System.out.println("Updated Treatment Details:");
        System.out.println(treatment.viewTreatmentDetails());
        
        System.out.println("\n8. Viewing Personal Details:");
        System.out.println("Patient's Personal Details:");
        System.out.println(patientKraneel.viewPersonalDetails());
        
        System.out.println("\n9. Multiple Patient Appointments:");
        
        System.out.println("\n• Sirjeet booking with Pediatrician:");
        patientSirjeet.bookAppointment(doctorPriya, "2024-12-18", "11:00 AM");
        
        System.out.println("\n• Prayash booking with Orthopedic:");
        patientPrayash.bookAppointment(doctorRohan, "2024-12-19", "3:00 PM");
        
        System.out.println("\n• Anjali booking with Cardiologist:");
        patientAnjali.bookAppointment(doctorShrish, "2024-12-21", "9:30 AM");
        
        System.out.println("\n• Kraneel booking with Orthopedic:");
        patientKraneel.bookAppointment(doctorRohan, "2024-12-22", "9:00 AM");
        
        System.out.println("\n10. Doctor Schedules:");
        
        System.out.println("\nDr. " + doctorShrish.getName() + "'s Schedule (Cardiology):");
        System.out.println("Number of appointments: " + doctorShrish.getAppointments().size());
        for (Appointment apt : doctorShrish.getAppointments()) {
            System.out.println("- " + apt.getAppointmentDate() + " at " + 
                             apt.getAppointmentTime() + " with " + 
                             apt.getPatient().getName());
        }
        
        System.out.println("\nDr. " + doctorPriya.getName() + "'s Schedule (Pediatrics):");
        System.out.println("Number of appointments: " + doctorPriya.getAppointments().size());
        for (Appointment apt : doctorPriya.getAppointments()) {
            System.out.println("- " + apt.getAppointmentDate() + " at " + 
                             apt.getAppointmentTime() + " with " + 
                             apt.getPatient().getName());
        }
        
        System.out.println("\nDr. " + doctorRohan.getName() + "'s Schedule (Orthopedics):");
        System.out.println("Number of appointments: " + doctorRohan.getAppointments().size());
        for (Appointment apt : doctorRohan.getAppointments()) {
            System.out.println("- " + apt.getAppointmentDate() + " at " + 
                             apt.getAppointmentTime() + " with " + 
                             apt.getPatient().getName());
        }
        
        System.out.println("\n11. Patient Appointments Summary:");
        
        System.out.println("\n" + patientKraneel.getName() + "'s Appointments:");
        System.out.println("Total appointments: " + patientKraneel.getAppointments().size());
        for (Appointment apt : patientKraneel.getAppointments()) {
            System.out.println("- Doctor: " + apt.getDoctor().getName() + 
                             " (" + apt.getDoctor().getDepartment() + ")" +
                             ", Date: " + apt.getAppointmentDate() + 
                             ", Time: " + apt.getAppointmentTime());
        }
        
        System.out.println("\n" + patientSirjeet.getName() + "'s Appointments:");
        System.out.println("Total appointments: " + patientSirjeet.getAppointments().size());
        for (Appointment apt : patientSirjeet.getAppointments()) {
            System.out.println("- Doctor: " + apt.getDoctor().getName() + 
                             " (" + apt.getDoctor().getDepartment() + ")" +
                             ", Date: " + apt.getAppointmentDate() + 
                             ", Time: " + apt.getAppointmentTime());
        }
        
        System.out.println("\n" + patientPrayash.getName() + "'s Appointments:");
        System.out.println("Total appointments: " + patientPrayash.getAppointments().size());
        for (Appointment apt : patientPrayash.getAppointments()) {
            System.out.println("- Doctor: " + apt.getDoctor().getName() + 
                             " (" + apt.getDoctor().getDepartment() + ")" +
                             ", Date: " + apt.getAppointmentDate() + 
                             ", Time: " + apt.getAppointmentTime());
        }
        
        System.out.println("\n" + patientAnjali.getName() + "'s Appointments:");
        System.out.println("Total appointments: " + patientAnjali.getAppointments().size());
        for (Appointment apt : patientAnjali.getAppointments()) {
            System.out.println("- Doctor: " + apt.getDoctor().getName() + 
                             " (" + apt.getDoctor().getDepartment() + ")" +
                             ", Date: " + apt.getAppointmentDate() + 
                             ", Time: " + apt.getAppointmentTime());
        }
        
        System.out.println("\n12. System Statistics:");
        System.out.println("Total Patients: 4");
        System.out.println("Total Doctors: 3");
        System.out.println("Total Departments: 3 (Cardiology, Pediatrics, Orthopedics)");
        System.out.println("Total Appointments Booked: " + 
                          (patientKraneel.getAppointments().size() +
                           patientSirjeet.getAppointments().size() +
                           patientPrayash.getAppointments().size() +
                           patientAnjali.getAppointments().size()));
    }
}