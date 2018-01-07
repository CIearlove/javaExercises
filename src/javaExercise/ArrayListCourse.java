package javaExercise;
import java.util.ArrayList;

public class ArrayListCourse {
	
	private String courseName;
	private  ArrayList students = new ArrayList();

	
	public ArrayListCourse(String courseName){
		this.courseName = courseName;
	}
	
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	public String getCourseName(){
		return courseName;
	}
	
	public ArrayList getStudents() {
		return students;
	}

	public void addStudent(String student){
		students.add(student);
	}
	
	public void dropStudent(String student){
		students.remove(student);
	}
	
	public void clear(){
		students.clear();
	}
	
	public String toString(){
		return students.toString();
	}
}
