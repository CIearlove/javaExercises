/*
 * 有三种字符串，传给方法作为参数，在方法中对其赋值，查看字符串能不能被改变(未解决)
 */
package mistakesInExercises;

public class number_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String("duozhu");
		String s2 = "duozhu";
		char[] s3  = {'d','u','o','z','h','u'};
		
		System.out.println("Before the assignment: "+s1);
		assignment3(s1);
		System.out.println("After the assignment: "+s1);
		
		System.out.println("Before the assignment: "+s2);
		assignment1(s2);
		System.out.println("After the assignment: "+s2);
		
		System.out.println("Before the assignment: "+s3);
		assignment2(s3);
		System.out.println("After the assignment: "+s3);
		
	}
	
	public static void assignment1(String s){
		s = "duozhu has changed.";
	}
	
    public static void assignment2(char[] s){
    	char[] temp  = {'d','u','o','z','h','u','h','a','s','c','h','a','n','g','e','d'};
    	s = temp;
	}
    
    public static void assignment3(String s){
		s.replace('d', 'z');
	}
}
