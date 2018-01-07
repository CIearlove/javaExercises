package javaExercise;
import java.util.Date;

public class Transaction {
	
	Date date;
	char type;
	double amount;
	double balance;
	String description;
	
	public Transaction(){
		
	}
	
	public Transaction(char type,double amount,double balance){
		
		this.type = type;
		this.amount = amount;
		this.balance = balance;
		this.date = new Date();
		this.description = date.toString()+" "+type+" "+amount+" money, "+balance+" left.";
		
	}
	
	
}
