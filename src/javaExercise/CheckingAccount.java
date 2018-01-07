package javaExercise;

public class CheckingAccount extends Account{
	
	private double overdrawLimit = 1000;
	
	public CheckingAccount(int id,double balance,double annualInterestRate){
		super(id,balance,annualInterestRate);
	}
	
	public void withDraw(double amount){
		if((balance-amount) >= -1000){
			balance = balance-amount;
			System.out.println(balance+" left.");
		}
		else
			System.out.println("The overdrawLimit is not enough.");
	}
}
