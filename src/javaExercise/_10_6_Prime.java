package javaExercise;
import java.util.Scanner;
public class _10_6_Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackOfInteger stack = new StackOfInteger();
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		
		for(int i=1;i<=number;i++){
			if(isPrime(i)){
				stack.push(i);
			}
		}
		
		System.out.println("Prime: ");
		int numberOfPrime = stack.getSize();
		for(int i=0;i<numberOfPrime;i++){
			System.out.print(" "+stack.pop());
		}
	}
	
	public static boolean isPrime(int scope){
		
		if(scope == 1||scope == 2){
			return true;
		}
		else if (scope>=3){
			for(int j=2;j<=scope/2;j++){
				if(scope%j == 0){
					return false;
				}
			}
		}
		return true;
	}
}
