package javaExercise;
import java.util.Scanner;

public class _13_2_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int input1;
		int input2;
		while(true){
			try{
				 input1 = input.nextInt();
				 input2 = input.nextInt();
				break;
			}
			catch(Exception ex){
				System.out.println("incorrect input and re-inter two integers.");
				input.nextLine();
			}
		}
		
		System.out.println("Sum is: "+(input1+input2));
	}
	
}
