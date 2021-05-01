package inheritance3;

import java.util.Scanner;

public class InstructorManager extends UserManager {
	Scanner s = new Scanner(System.in);
	public void addCourse(){
		System.out.print("Courses:");
		s.nextLine();
		
		System.out.print("Courses Prince: ");
		s.nextInt();
		s.nextLine();
		
		System.out.print("Teacher Name: ");
		s.nextLine();
		
		System.out.println("Courses Registration successful.");
		
		
	}
	public void courseDelete() {
		System.out.println("Ýf you delete a course?");
		String answer = s.nextLine();
		
		if(answer.equals("Yes") || answer.equals("Yes")) {
			System.out.println("Course deleted");
		}
		else {
			System.out.println("You gave up deleting.");
		}
	}
	
}
