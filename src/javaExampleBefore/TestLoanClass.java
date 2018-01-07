package javaExampleBefore;
import java.util.Scanner;
public class TestLoanClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double annualInterestRate = input.nextDouble();
		int numberOfYears = input.nextInt();
		double loanAmount = input.nextDouble();
		
		Loan loan = new Loan(annualInterestRate,numberOfYears,loanAmount);
		
		System.out.println(loan.getLoanDate().toString()+"\n"+loan.getMonthPayment()+"\n"+
		loan.getTotalPayment());
	}

}
