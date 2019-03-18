package Chapter20;

public class _20_11_SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(sumDigits(11111));
	}

	//Recursive mode
	public static int sumDigits(long n){
		if(n/10 == 0)
			return (int) n;
		else{
			return (int) (n%10 + sumDigits(n/10));
		}
	}
}
