package inheritance3;

import java.util.Scanner;

public class StudentManager extends UserManager {
	Scanner s = new Scanner(System.in);
	
	public void joinCourse() {
		System.out.println("Registration successful."); 

	}
	public void outCourse() {
		System.out.println("Left the Course.");
	}
	public void messageToInstructor(Instructor instructor) {
		System.out.println("Message: ");
		s.nextLine();
		System.out.println("Message " + instructor.getFullName() + " Sending successful.");
	}
}
