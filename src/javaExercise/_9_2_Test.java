package javaExercise;
import java.util.Scanner;

public class _9_2_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first string:");
		String first = input.nextLine();
		System.out.println("Enter the second string:");
		String second = input.nextLine();
		
		if(isSubString(first,second)){
			System.out.println(first+" is a substring of "+second);
		}else{
			System.out.println(first+" is not a substring of "+second);
		}
	}

	public static boolean isSubString(String first, String second) {
		// TODO Auto-generated method stub
		int firstLength = first.length();
		int remainLength = second.length();
		int startIndex = 0;
		
		while(firstLength <= remainLength){
			for(int i=0;i<firstLength;i++){
				if(first.charAt(i) != second.charAt(i+startIndex)){
					startIndex++;
					remainLength--;
					break;
				}
			}
			return true;
		}
		return false;
	}

}
