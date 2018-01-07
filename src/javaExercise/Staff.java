package javaExercise;

public class Staff extends Employee {
	
	private String jobTitle;
	
	public Staff(){
		
	}
	
	public Staff(Object o,String jobTitle){
		
	super(o,((Employee)o).getOfficeNumber(),((Employee)o).getSalary());
	this.jobTitle = jobTitle;
	}
	
	public String toString(){
		return "Staff: "+super.getName();
	}
}
