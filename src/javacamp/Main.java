package inheritance3;

public class Main {

	public static void main(String[] args) {
		Instructor instructor1 = new Instructor(1, "Sercan", "serc77", "12345", "DEV IT", 11, 360000);
		Instructor instructor2 = new Instructor(2, "Mustafa ", "mst77", "2020156", "IT", 4, 1280000);
		
		Student student1 = new Student(1, "Ali Şen ", "alis", "3407", 2, 80);
		Student student2 = new Student(2, "Ali Koç", "alik", "3407887", 6, 90);
		
		Instructor[] instructors = {instructor1,instructor2};
		Student[] students = {student1,student2};
		
		InstructorManager instructorManager = new InstructorManager();
		
		
		StudentManager studentManager = new StudentManager();
	
		
	}

}
