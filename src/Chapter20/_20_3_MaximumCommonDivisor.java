package Chapter20;

public class _20_3_MaximumCommonDivisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("MaximumCommonDivisor: "+gcd(24,16));
		System.out.println("MaximumCommonDivisor: "+gcd(255,25));
	}
	
	//Recursive mode շת�����,�ϴ���Ϊm��С��Ϊn
	public static int gcd(int m,int n){
		if(m%n == 0)
			return n;
		else
			return gcd(n,m%n);
	}
}
