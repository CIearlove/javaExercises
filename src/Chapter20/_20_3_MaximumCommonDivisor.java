package Chapter20;

public class _20_3_MaximumCommonDivisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("MaximumCommonDivisor: "+gcd(24,16));
		System.out.println("MaximumCommonDivisor: "+gcd(255,25));
	}
	
	//Recursive mode 辗转相除法,较大数为m较小数为n
	public static int gcd(int m,int n){
		if(m%n == 0)
			return n;
		else
			return gcd(n,m%n);
	}
}
