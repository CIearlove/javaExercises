package javaExercise;

public class _10_9_TestCourse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Course course = new Course("Math");
		course.addStudent("Zed");
		course.addStudent("Zac");
		course.addStudent("Zzz");
		
		System.out.println("Students:");
		for(int i=0;i<course.getNumberOfStudents();i++){
			System.out.println(course.getStudents()[i]);
		}
		
		course.dropStudent("Zac");
		for(int i=0;i<course.getNumberOfStudents();i++){
			System.out.println(course.getStudents()[i]);
		}
		
		course.clear();
		System.out.println("The number of students:"+course.getNumberOfStudents());
	}

}
