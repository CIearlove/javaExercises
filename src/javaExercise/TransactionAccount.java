package javaExercise;

import java.util.ArrayList;
import java.util.Date;

public class TransactionAccount {
	
	private int id;
	private double balance;
	private String name;
	private double annualInterestRate ;
	private Date dateCreated = new Date();
	private ArrayList transactions = new ArrayList();
	
	
	public TransactionAccount(){
		
	}
	
	public TransactionAccount(int id,String string,double balance,double annualInterestRate){
		
		this.id  = id;
		this.name = string;
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
		Transaction transaction = new Transaction('W',amount,balance);
		transactions.add(transaction);
	}
	
	public void deposit(double amount){
		
		balance = balance+amount;
		Transaction transaction = new Transaction('D',amount,balance);
		transactions.add(transaction);
	}
	
	public ArrayList getTransactions() {
		return transactions;
	}

	public void setTransactions(ArrayList transactions) {
		this.transactions = transactions;
	}

}


