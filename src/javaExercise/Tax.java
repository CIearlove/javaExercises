package javaExercise;

public class Tax {
	
	private int filingStatus = 0;
	private int[][] brackets = {
			{
				27050,65550,136750,297350
			},
			{
				45200,109250,166500,297350
			},
			{
				22600,54625,83250,148675
			},
			{
				36250,93650,151650,297350
			}
	};
	
	double [] rates = {
			0.15,0.275,0.305,0.355,0.391
	};
	
	double taxableIncome = 1000;
	
	public Tax(){
		
	}
	
	public Tax(int filingStatus,int[][] brackets,double[] rates,double taxableIncome){
		this.filingStatus = filingStatus;
		this.brackets = brackets;
		this.rates = rates;
		this.taxableIncome = taxableIncome;
	}
	
	public int getFilingStatus() {
		return filingStatus;
	}

	public void setFilingStatus(int filingStatus) {
		this.filingStatus = filingStatus;
	}

	public int[][] getBrackets() {
		return brackets;
	}

	public void setBrackets(int[][] brackets) {
		this.brackets = brackets;
	}

	public double[] getRates() {
		return rates;
	}

	public void setRates(double[] rates) {
		this.rates = rates;
	}

	public double getTaxableIncome() {
		return taxableIncome;
	}

	public void setTaxableIncome(double taxableIncome) {
		this.taxableIncome = taxableIncome;
	}
	
	public  double getTax(){
		
		double tax = 0;
		int flag1 = brackets[filingStatus].length;
		int flag2 = rates.length;
		
		if(taxableIncome<=brackets[filingStatus][0]){
			tax = rates[0]*taxableIncome;
		}
		
		for(int j=0; j<brackets[filingStatus].length-1;j++){
			 if(taxableIncome>brackets[filingStatus][j] && taxableIncome<=brackets[filingStatus][j+1]){
				tax = rates[j+1]*taxableIncome;
				break;
			}
		}
		
		if(taxableIncome>brackets[filingStatus][flag1-1]){
			tax = rates[flag2-1]*taxableIncome;
		}
	
		return tax;
	}
}
