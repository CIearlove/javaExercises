package javaExercise;

import java.util.Scanner;
public class _13_4_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try{
			
			Loan loan1 = new Loan(1,1,1);
			loan1.setAnnualInterestRate(-1);
		}
		catch(Exception ex){
			System.out.println(ex);
		}
		System.out.println("End of program");
}
}

