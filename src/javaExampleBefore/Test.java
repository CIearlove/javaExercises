package javaExampleBefore;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			int value = 50;
			if(value<40){
				throw new Exception("value is too samll");
			}
		}
		catch(Exception ex){
			System.out.println(ex.getMessage());
		}
		System.out.println("Continue after the catch block");
	}

}
