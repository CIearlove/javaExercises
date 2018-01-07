package javaExercise;
import java.util.Scanner;

public class _9_9_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a binary string:");
		String string = input.nextLine();
		System.out.println("Binary string "+"\""+string+"\""+"to hex is: "+binaryToHex(string));
		/*
		int hexLength = binaryToHex(string).length();
		String hexString = binaryToHex(string);
		for(int i=0;i<hexLength;i++){
			System.out.print(hexString.charAt(i));
			
		}
		*/
	}

	public static String binaryToHex(String string) {
		// TODO Auto-generated method stub
		
		int decimal = _9_8_Test.binaryToDecimal(string);
		StringBuilder sb = new StringBuilder();
	    int remainer;
	    
		while(decimal!=0){
			
			remainer = decimal%16;
			decimal = decimal/16;
			sb.append(decimalToChar(remainer));
		}
		return sb.reverse().toString();
	}
	
	public static char decimalToChar(int i){
		if(i>=0&&i<=9){
			return (char) ('0'+i);
		}else{
			return (char) ('A'+i-10);
		}
	}
}
