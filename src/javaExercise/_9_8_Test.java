package javaExercise;
import java.util.Scanner;

public class _9_8_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a binary string:");
		String string = input.nextLine();
		System.out.println("Binary string "+"\""+string+"\""+"to decimal is: "+
		binaryToDecimal(string));
	}

	public static int binaryToDecimal(String string) {
		// TODO Auto-generated method stub
		int decimal = 0;
		for(int i=0;i<string.length();i++){
			decimal = decimal*2 + (string.charAt(i)-'0');
		}
		return decimal;
	}

}
