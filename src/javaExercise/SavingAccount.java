package javaExercise;

public class SavingAccount extends Account{
	
	private double overdrawLimit = 0;
	
	public SavingAccount(int id,double balance,double annualInterestRate){
		super(id,balance,annualInterestRate);
	}
	
	public void withDraw(double amount){
		
		if((balance-amount)>=overdrawLimit){
			balance = balance-amount;
			System.out.println(balance+" left.");
		}
		else
			System.out.println("The balance is not enough. Just: "+balance+" left.");
	}
}
