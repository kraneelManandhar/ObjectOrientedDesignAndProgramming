package workshop;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.junit.jupiter.api.Test;

//	8.	In an Learning management system, students can enroll in courses. 
//	The EnrollmentService class needs a method enrollStudent(String studentUsername, String courseName) to allow students to enroll in courses. 
//	The method should return true if the student is successfully enrolled, and false if the student is already enrolled in the course.

class EnrollmentService{
	private Map<String, Set<String>> enrollments;
	    
	    public EnrollmentService() {
	        enrollments = new HashMap<>();
	    }
	    
	    public boolean enrollStudent(String studentUsername, String courseName) {
	        Set<String> studentCourses = enrollments.get(studentUsername);
	        
	        if (studentCourses == null) {
	            studentCourses = new HashSet<>();
	            studentCourses.add(courseName);
	            enrollments.put(studentUsername, studentCourses);
	            return true;
	        }
	        
	        if (studentCourses.contains(courseName)) {
	            return false;
	        }
	        
	        studentCourses.add(courseName);
	        return true;
	    }	
}

public class Qn8 {
	EnrollmentService enrollmentService = new EnrollmentService();
	@Test
	void testEnrollStudent_NewEnrollment() {
	    assertTrue(enrollmentService.enrollStudent("Kraneel", "CS"));
	}

	@Test  
	void testEnrollStudent_AlreadyEnrolled() {
	    enrollmentService.enrollStudent("Kraneel", "CS");
	    assertFalse(enrollmentService.enrollStudent("Kraneel", "CS"));
	}
}
