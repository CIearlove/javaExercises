package javaExercise;

public class Person {
	
	private String name;
	private String address;
	private String telephoneNumber;
	private String email;
	
	public Person(){
	}
	
	public Person(String name,String address,String telephoneNumber,String email){
		this.name = name;
		this.address = address;
		this.telephoneNumber = telephoneNumber;
		this.email = email;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTelephoneNumber() {
		return telephoneNumber;
	}

	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
