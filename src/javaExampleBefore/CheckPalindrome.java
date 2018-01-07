package javaExampleBefore;
import java.util.Scanner;

public class CheckPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String s = input.next();
		if(ispalindrome(s)){
			System.out.println("The string is palindrome. "+s);
		}
		else{
			System.out.println("The string is not palindrome. "+s);
		}
		/*
		int i;
		for(i=0;i<s.length()/2;i++){
			if(s.charAt(i) != s.charAt(s.length()-1-i)){
				System.out.println("The string is not palindrome.");
				break;
			}
		}
		if(i==s.length()/2){
			System.out.println("The string is palindrome.");
		}
		*/
		
	}
	
	public static boolean ispalindrome(String s){
		
		s = filter(s);
		
		int i;
		for(i=0;i<s.length()/2;i++){
			if(s.charAt(i) != s.charAt(s.length()-1-i)){
				break;
			}
		}
		if(i==s.length()/2){
			return true;
		}
		else{
			return false;
		}
		
	}
	
	public static String filter(String s){
		StringBuilder stringBuilder = new StringBuilder();
		for(int i=0;i<s.length();i++){
			if(Character.isLetterOrDigit(s.charAt(i))){
				stringBuilder.append(s.charAt(i));
			}
		}
		return stringBuilder.toString();
		
	}
}
