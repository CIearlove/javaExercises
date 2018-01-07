package javaExercise;
import java.util.Scanner;

public class _9_10_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a decimal number:");
		int number = input.nextInt();
		System.out.println("Decimal number "+"\""+number+"\""+"to binary is: "+decimalToBinary(number));
	}

	public static String decimalToBinary(int number) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		int remainer;
		while(number!=0){
			remainer = number%2;
			number = number/2;
			sb.append(remainer);
		}
		return sb.reverse().toString();
	}

}
