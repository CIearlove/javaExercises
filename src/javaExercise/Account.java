package javaExercise;
import java.util.Date;

public class Account {
	protected int id;
	protected double balance;
	protected double annualInterestRate ;
	protected Date dateCreated = new Date();
	
	public Account(){
		this.id  = 0;
		this.balance = 0;
		this.annualInterestRate = 0;
	}
	
	public Account(int id,double balance,double annualInterestRate){
		this.id  = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
		dateCreated.getTime();
	}
	
	public Date getDateCreated() {
		return dateCreated;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	
	public void withDraw(double amount){
		balance = balance-amount;
	}
	
	public void deposit(double amount){
		balance = balance+amount;
	}
}
