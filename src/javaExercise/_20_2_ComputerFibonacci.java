package javaExercise;

public class _20_2_ComputerFibonacci {

	public static int count = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ComputerFibonacci: "+ computerFibonacci(10));
		System.out.println("ComputerFibonacci: "+ computerFibonacci1(6));
		
		System.out.println("The number of calls to computerFibonacci1() is : "+ count);
	}

	//Cyclic mode
	public static long computerFibonacci(int n){
		
		long f0 = 0;
		long f1 = 1;
		long currentFib = 0;
		
		if(n == 0) 
			return f0;
		else if(n==1) 
			return f1;
		else
			for(int i=2;i<=n;i++){
				currentFib = f0+f1;
				f0 = f1;
				f1 = currentFib;
			}
			return currentFib;
	}
	
	//Recursive mode
	public static long computerFibonacci1(int n){
		count++;
		if(n == 0) 
			return 0;
		else if(n==1) 
			return 1;
		else
			return computerFibonacci1(n-1)+computerFibonacci1(n-2);
	}
}
