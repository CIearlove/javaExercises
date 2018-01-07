package javaExercise;

public class Faculty extends Employee {
	
	private double workingTime;
	private int level;
	
	public Faculty(){
		
	}
	
	public Faculty(Object o,double workingTime,int level){
		super(o,((Employee)o).getOfficeNumber(),((Employee)o).getSalary());
		this.workingTime = workingTime;
		this.level = level;
	}
	
	public String toString(){
		return "Faculty: "+super.getName();
	}
}
