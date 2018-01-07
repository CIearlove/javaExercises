//深复制(deep copy)和浅复制(shallow copy)
package mistakesInExercises;

public class number_2 {
	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Professor p = new Professor("duozhu",24);
		Student s1 = new Student("zhangsan",18,p);   
		//Student s2 = s1;
		Student s2=(Student) s1.clone();  
		
		System.out.println("---------Before---------");
		System.out.println("S1_name="+s1.getName()+","+"S1_age="+s1.getAge()+",S1_professor="+s1.getProfessor().getName());  
		System.out.println("S2_name="+s2.getName()+","+"S2_age="+s2.getAge()+",S2_professor="+s2.getProfessor().getName());
		System.out.println("***********************");
		System.out.println("***********************");
		
		System.out.println("---------S2_name,S2_age has Changed!---------");
		s2.setName("lisi");   
		s2.setAge(20);   
		System.out.println("S1_name="+s1.getName()+","+"S1_age="+s1.getAge()+",S1_professor="+s1.getProfessor().getName());//修改学生2后，不影响学生1的值。    
		System.out.println("S2_name="+s2.getName()+","+"S2_age="+s2.getAge()+",S2_professor="+s2.getProfessor().getName());
		System.out.println("***********************");
		System.out.println("***********************");
		
		System.out.println("---------S2_professor_name,S2_professor_age has Changed!---------");
		s2.getProfessor().setName("duozhuChanged");
		s2.getProfessor().setAge(25);
		System.out.println("S1_name="+s1.getName()+","+"S1_age="+s1.getAge()+",S1_professor="+s1.getProfessor().getName());//修改学生2后，影响学生1的值。    
		System.out.println("S2_name="+s2.getName()+","+"S2_age="+s2.getAge()+",S2_professor="+s2.getProfessor().getName());
	}

}
