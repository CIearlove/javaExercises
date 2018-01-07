package javaExampleBefore;
import java.util.Date;
public class Loan {
	
	private double annualInterestRate = 2.5;
	private int numberOfYears = 1;
	private double loanAmount = 1000;
	private Date loanDate;
	
	public Loan(){
		
	}
	
	public Loan(double annualInterestRate,int numberOfYears,double loanAmount){
		this.annualInterestRate = annualInterestRate;
		this.numberOfYears = numberOfYears;
		this.loanAmount = loanAmount;
		loanDate = new Date();
	}
	
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public int getNumberOfYears() {
		return numberOfYears;
	}

	public void setNumberOfYears(int numberOfYears) {
		this.numberOfYears = numberOfYears;
	}

	public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}
	
	public Date getLoanDate() {
		return loanDate;
	}
	
	public double getMonthPayment(){
		double monthlyInterestRate = annualInterestRate/1200;
		double monthlyPayment = loanAmount*monthlyInterestRate+loanAmount/12;
		return monthlyPayment;
	}
	
	public double getTotalPayment(){
		return getMonthPayment()*numberOfYears*12;
	}

}
