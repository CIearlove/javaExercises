package javaExercise;

public class _11_5_TestCourse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayListCourse course = new ArrayListCourse("Math");
		course.addStudent("Zac");
		course.addStudent("Zed");
		course.addStudent("Riven");
		
		System.out.println(course.toString());
		
		course.dropStudent("Zed");
		System.out.println(course.toString());
		
		course.clear();
		System.out.println(course.toString());
	}

}
