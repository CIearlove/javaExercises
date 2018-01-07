//深复制(deep copy)和浅复制(shallow copy)
package mistakesInExercises;

public class Student implements Cloneable{
	
	private String name;    
	private int age;    
	private Professor professor;
	
	public Student(String name,int age, Professor p){    
	        this.name=name;    
	        this.age=age;
	        this.professor=p;
	        }    
	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#clone()
	 * ①为了获取对象的一份拷贝，我们可以利用Object类的clone()方法。 
     * ②在派生类中覆盖基类的clone()方法，并声明为public。 
     * ③在派生类的clone()方法中，调用super.clone()。 
     * ④在派生类中实现Cloneable接口。
	 */
/*	public Object clone()    
	{    
		Object o=null;    
		try    
		{    
			o=super.clone();//Object中的clone()method(浅复制)。    
			}    
		catch(CloneNotSupportedException e)    
		{    
			System.out.println(e.toString());    
			}    
		return o;    
	     }
*/	
	public Object clone()  throws CloneNotSupportedException
	{    
		Student o=null; 
		
		o=(Student) super.clone();//Object中的clone()method。
		o.professor = (Professor) o.professor.clone();//深复制
		
		return o;    
	     }
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public Professor getProfessor() {
		return professor;
	}
	
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}    
}
