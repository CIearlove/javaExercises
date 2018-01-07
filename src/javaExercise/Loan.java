package javaExercise;
import java.util.Date;
public class Loan {
	
	private double annualInterestRate;
	private int numberOfYears;
	private double loanAmount;
	private Date loanDate;
	
	public Loan(){
		this(2.5,1,1000);
	}
	
	public Loan(double annualInterestRate,int numberOfYears,double loanAmount){
		
		if(annualInterestRate<=0)
			throw new IllegalArgumentException("Annual interest rate must be positive.");
		if (numberOfYears <= 0)
			throw new IllegalArgumentException("Number of years must be positive.");
        if (loanAmount <= 0)
        	throw new IllegalArgumentException("Loan amount must be positive.");
        
        setAnnualInterestRate(annualInterestRate);
        setNumberOfYears(numberOfYears);
        setLoanAmount(loanAmount);
	}
	
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		if(annualInterestRate<=0)
			throw new IllegalArgumentException("Annual interest rate must be positive.");
		this.annualInterestRate = annualInterestRate;
	}

	public int getNumberOfYears() {
		return numberOfYears;
	}

	public void setNumberOfYears(int numberOfYears) {
		if (numberOfYears <= 0)
			throw new IllegalArgumentException("Number of years must be positive.");
		this.numberOfYears = numberOfYears;
	}

	public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		 if (loanAmount <= 0)
	        	throw new IllegalArgumentException("Loan amount must be positive.");
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
