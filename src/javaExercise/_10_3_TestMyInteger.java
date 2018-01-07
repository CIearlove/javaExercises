package javaExercise;

public class _10_3_TestMyInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyInteger myInt1 = new MyInteger(10);
		System.out.println("Value:"+myInt1.getValue());
		System.out.println("isEven:"+myInt1.isEven());
		System.out.println("isOdd:"+myInt1.isOdd());
		System.out.println("isPrime:"+myInt1.isPrime());
		
		char [] numbers = {'1','2','3'};
		
		System.out.println("123 is Even? "+MyInteger.isEven(MyInteger.parseInt(numbers)));
		System.out.println("123 is Odd? "+MyInteger.isOdd(MyInteger.parseInt(numbers)));
		System.out.println("123 is Prime? "+MyInteger.isPrime(MyInteger.parseInt(numbers)));
		
		String string = "4396";
		MyInteger myInt2 = new MyInteger(MyInteger.parseInt(string));
		System.out.println(string+" is Even? "+MyInteger.isEven(myInt2));
		System.out.println(string+" is Odd? "+MyInteger.isOdd(myInt2));
		System.out.println(string+" is Prime? "+MyInteger.isPrime(myInt2));
		
		
	}

}
