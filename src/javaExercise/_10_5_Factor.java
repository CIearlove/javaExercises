
package javaExercise;
import java.util.Scanner;
public class _10_5_Factor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a integer: ");
		int integer = input.nextInt();
		StackOfInteger stack = new StackOfInteger();
		
		factor(integer,stack);
		System.out.println("Factor:");
		int numberOfElements = stack.getSize();
		for(int i=0;i<numberOfElements;i++){ 
			System.out.print(stack.pop()+" ");
		}	
		
	}
	
	static int temp = 0;
	public static void factor(int integer,StackOfInteger s){
		
		s.push(factor1(integer,s));
		
	}
	public static int factor1(int integer,StackOfInteger s){
		
		
		for(int i=2; i<= integer/2; i++){
			if(integer%i == 0){
				temp = integer/i;
				s.push(i);
				factor1(temp,s);
				break;
			}
		}
		return temp;
	}

}
