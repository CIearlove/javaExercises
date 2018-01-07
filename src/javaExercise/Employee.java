package javaExercise;

public class Employee extends Person{
	
	private int officeNumber;
	private double salary;
	private java.util.Date engagedDate;
	
	public Employee(){
		engagedDate = new java.util.Date();
	}
	
	public Employee(Object o,int officeNumber,double salary){
		
		super(((Person)o).getName(),((Person)o).getAddress(),((Person)o).getTelephoneNumber(),((Person)o).getEmail());
		this.engagedDate = new java.util.Date();
		this.officeNumber = officeNumber;
		this.salary = salary;
		
	}
	
	public int getOfficeNumber() {
		return officeNumber;
	}

	public double getSalary() {
		return salary;
	}

	public String toString(){
		return "Employee: "+super.getName();
	}
}
