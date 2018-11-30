package javaExercise;

public class _20_6_SeriesSummation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Summing the series: "+sum(6));
		System.out.println("Summing the series: "+sum1(6));
	}
	
	//Cyclic mode
	public static double sum(int n){
		
		double Series1 = 1.0/2;
		double Series2 = 2.0/3;
		double Seriesn = (n*1.0)/(n+1);
		double currentSeries = Series1+Series2;
		if(n==1)
			return Series1;
		if(n==2)
			return Series1+Series2;
		else
			for(int i=3;i<=n;i++){
				Series1 = currentSeries;
				Series2 = (i*1.0)/(i+1);
				currentSeries = Series1+Series2;
			}
		return currentSeries;
	}
	
	//Recursive mode
	public static double sum1(int n){
		
		if(n==1)
			return 1.0/2;
		else
			return sum1(n-1)+n*1.0/(n+1);
	}
}
