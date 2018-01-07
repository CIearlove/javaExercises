package javaExercise;
import java.util.Scanner;

public class _9_3_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a password:");
		String password = input.nextLine();
		try {
			checkNumOfChar(password);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			checkDigAndChar(password);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	public static boolean checkNumOfChar(String password)
	        throws Exception{
		if(password.length() >= 8){
			return true;
		}
		else{
			throw new Exception("The length of password at least 8.");
		}
		
	}
	
	public static boolean checkDigAndChar(String password)
			throws Exception{
		int countChar = 0;
		int countDig = 0;
		
		for(int i=0;i<password.length();i++){
			if(Character.isLetter(password.charAt(i))){
				countChar++;
			}
			if(Character.isDigit(password.charAt(i))){
				countDig++;
			}
		}
		
		int count = countChar+countDig;
		
		if(count == password.length()&&countDig>=2&&countChar>=1){
			return true;
		}
		else{
			throw new Exception("Password consists of letters and digits,and at least two digits. ");
		}
	}
}
