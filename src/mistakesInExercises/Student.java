//���(deep copy)��ǳ����(shallow copy)
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
	 * ��Ϊ�˻�ȡ�����һ�ݿ��������ǿ�������Object���clone()������ 
     * �����������и��ǻ����clone()������������Ϊpublic�� 
     * �����������clone()�����У�����super.clone()�� 
     * ������������ʵ��Cloneable�ӿڡ�
	 */
/*	public Object clone()    
	{    
		Object o=null;    
		try    
		{    
			o=super.clone();//Object�е�clone()method(ǳ����)��    
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
		
		o=(Student) super.clone();//Object�е�clone()method��
		o.professor = (Professor) o.professor.clone();//���
		
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
