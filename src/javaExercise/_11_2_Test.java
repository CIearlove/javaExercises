package javaExercise;

public class _11_2_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int FRESHMAN = 0;
		final int SOPHOMORE = 0;
		final int JUNIOR = 0;
		final int SENIOR = 0;
		
		Person person1 = new Person("riven1","home1","13515548833","email1");
		Person person2 = new Person("riven2","home2","13515548833","email2");
		Person person3 = new Person("riven3","home3","13515548833","email3");
		
		Student student1 = new Student(person1,FRESHMAN);
		System.out.println(""+student1.toString());
		
		Employee employee1 = new Employee(person2,309,10000.0);
		Employee employee2 = new Employee(person3,308,10001.0);
		
		Faculty faculty1 = new Faculty(employee1,20,1);
		System.out.println(""+faculty1.toString());
		
		Staff staff1 = new Staff(employee2,"Doctor");
		System.out.println(""+staff1.toString());
		
	}
}

