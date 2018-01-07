////深复制(deep copy)和浅复制(shallow copy)
package mistakesInExercises;

public class Professor implements Cloneable{
	
	private String name;    
	private int age;    
    
    public Professor(String name,int age)    
    {    
       this.name=name;    
       this.age=age;    
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
	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
