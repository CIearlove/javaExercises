package javaExercise;

public class Student extends Person{
	private int classStatus;
	
	public Student(){
		
	}
	
	public Student(Object o,int classStatus){
		super(((Person)o).getName(),((Person)o).getAddress(),((Person)o).getTelephoneNumber(),((Person)o).getEmail());
		this.classStatus = classStatus;
	}
	
	public String toString(){
		return "Student: "+super.getName();
	}
}
