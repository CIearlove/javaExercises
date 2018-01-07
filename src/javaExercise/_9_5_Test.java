package javaExercise;
import java.util.Scanner;

public class _9_5_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string:");
		String string = input.nextLine();
		int[] counts = count(string);
		for(int i=0;i<counts.length;i++){
			System.out.println("counts["+i+"]"+"is: "+counts[i]);
		}
	}

	public static int[] count(String string) {
		// TODO Auto-generated method stub
		int[] counts = new int[10];
		/*
		StringBuilder stringBuilder = new StringBuilder();
		String s;
		int[] counts = new int[10];
		
		for(int i=0;i<string.length();i++){
			if(Character.isDigit(string.charAt(i))){
				stringBuilder.append(string.charAt(i));
			}
		}
		s = stringBuilder.toString();
		*/
		for(int i=0;i<string.length();i++){
			if(Character.isDigit(string.charAt(i))){
				counts[string.charAt(i) - '0']++;
			}
			
		}
		return counts;
	}

}
