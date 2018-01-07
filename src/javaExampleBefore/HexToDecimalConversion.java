package javaExampleBefore;
import java.util.Scanner;
public class HexToDecimalConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String hex = input.next();
		System.out.println("Hex to decimal is: "+hexToDecimal(hex));
		
	}
	
	public static int hexToDecimal(String hex){
		int decimalValue = 0;
		for(int i=0;i<hex.length();i++){
			char hexChar = hex.toUpperCase().charAt(i);
			decimalValue = decimalValue*16 +hexCharToDecimal(hexChar);
		}
		return decimalValue;
	}
	
	public static int hexCharToDecimal(char hexChar){
		if(hexChar>='A'&& hexChar<='F'){
			return hexChar - 'A'+10;
		}
		else{
			return hexChar - '0';
		}
	}
}
