package javaExampleBefore;
public class Course {
	
    private String courseName;
	private String[] students = new String[2];
	private int numberOfStudents = 0;
	
	public Course(String courseName){
		this.courseName = courseName;
	}
	
	public int getNumberOfStudents() {
		return numberOfStudents;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	public String getCourseName(){
		return courseName;
	}
	
	public String[] getStudents() {
		return students;
	}

	public void addStudent(String student){
		if(numberOfStudents>=students.length){
			String[] temp = new String[numberOfStudents*2];
			System.arraycopy(students, 0, temp, 0, students.length);
			students = temp;
		}	
		students[numberOfStudents] = student;
		numberOfStudents++;
	}
	
	public void dropStudent(String student){
		for(int i=0;i<numberOfStudents;i++){
			if(students[i]==student){
				for(int k=i;k<numberOfStudents;k++){
					students[k]=students[k+1];
				}
			}
			break;
		}
		numberOfStudents--;
	}
	
	public void clear(){
		this.numberOfStudents = 0;
	}
}
