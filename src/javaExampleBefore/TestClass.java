package javaExampleBefore;
public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course course = new Course("Psychology");
		course.addStudent("Zed");
		course.addStudent("Zac");
		course.addStudent("Zed1");
		course.addStudent("Zac2");
		String[] students = course.getStudents();
		
		for(int i=0;i<course.getNumberOfStudents();i++){
			System.out.println("Students name:"+students[i]);
		}
		
		
	}

}
