package javaExercise;

public class MyInteger {
	private int value;

	public MyInteger(int value){
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
	
	public boolean isPrime(){
		return isPrime(value);
	}
	
	public static boolean isPrime(int num){
		if((num == 1)||(num == 2)){
			return true;
		}
		for (int i = 2; i <= num / 2; i++) {
		      if (num % i == 0) {
		        return false;
		      }
		    }
		return true;
	}
	
	public static boolean isPrime(MyInteger myInt){
		return isPrime(myInt.value);
	}
	
	public boolean isEven(){
		return isEven(value);
	}
	
	public static boolean isEven(int num){
		return num%2 == 0;
	}
	
	public static boolean isEven(MyInteger myInt){
		return myInt.value%2 == 0;
	}
	
	public boolean isOdd(){
		return isOdd(value);
	}
	
	public static boolean isOdd(int num){
		return num%2 == 1;
	}
	
	public static boolean isOdd(MyInteger myInt){
		return myInt.value%2 == 1;
	}
	
	public boolean equals(int num){
		return this.value == num;
	}
	
	public boolean equals(MyInteger myInt){
		return this.value == myInt.value;
	}
	
	public static int parseInt(char[] numbers){
		/*
		 * For example,if number is{'1','2','3'},the return value should be 123.
		 */
		int result = 0;
		for(int i=0;i<numbers.length;i++){
			result = result*10 + (numbers[i]-'0');
		}
		return result;
	}
	
	public static int  parseInt(String numbers){
		/*
		 * For example,if number is"123",the return value should be 123.
		 */
		int result = 0;
		for(int i=0;i<numbers.length();i++){
			result = result*10 + (numbers.charAt(i)-'0');
		}
		return result;
	}
	
	
}
