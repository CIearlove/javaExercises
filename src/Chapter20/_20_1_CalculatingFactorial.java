package Chapter20;

import java.math.BigInteger;
import java.util.Scanner;

public class _20_1_CalculatingFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigInteger bigNumber = new BigInteger("100");
		BigInteger result1 = _20_1_CalculatingFactorial.factorial1(bigNumber);
		BigInteger result2 = _20_1_CalculatingFactorial.factorial2(100);
		System.out.println("Recursive calculating: "+ result1);
		System.out.print("Cyclic calculating: "+ result2);
	}

	//Recursive mode
	public static BigInteger factorial1(BigInteger n){
		
		if(n.equals(BigInteger.ZERO)) 
			return BigInteger.ONE;
		else
			return n.multiply(factorial1(n.subtract(BigInteger.ONE)));
	}
	
	//Cyclic mode
	public static BigInteger factorial2(int n){
		
		BigInteger result = BigInteger.ONE;
		if(n==0) 
			return BigInteger.ONE;
		else
			for(int i=1;i<=n;i++){
				result = result.multiply(new BigInteger(i+""));
			}
			return result;
	}
}
