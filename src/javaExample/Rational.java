package javaExample;

public class Rational extends Number implements Comparable{

	private long numerator;
	private long denominator;
	
	public Rational(){
		this(0,1);
	}
	
	public  Rational(long numerator,long denominator){
		long gcb = gcd(numerator,denominator);
		this.numerator = numerator/Math.abs(gcb);
		this.denominator = denominator/Math.abs(gcb);
	}
	
	public long getNumerator() {
		return numerator;
	}

	public long getDenominator() {
		return denominator;
	}

	public Rational add(Rational secondRational){
		long n = numerator*secondRational.getDenominator() + denominator*secondRational.numerator;
		long d = denominator*secondRational.getDenominator();
		return new Rational(n,d);
	}
	
	public Rational subtract(Rational secondRational){
		long n = numerator*secondRational.getDenominator() - denominator*secondRational.numerator;
		long d = denominator*secondRational.getDenominator();
		return new Rational(n,d);
	}
	
	public Rational multiply(Rational secondRational){
		long n = numerator*secondRational.getNumerator();
		long d = denominator*secondRational.getDenominator();
		return new Rational(n,d);
	}
	
	public Rational divide(Rational secondRational){
		long n = numerator*secondRational.getDenominator();
		long d = denominator*secondRational.getNumerator();
		return new Rational(n,d);
	}
	
	public String toString(){
		if(denominator == 1){
			return numerator+"";
		}
		return numerator+"/"+denominator;
	}
	
	
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		if(this.subtract((Rational) o).getNumerator() > 0){
			return 1;
		}
		else if(this.subtract((Rational) o).getNumerator() < 0){
			return -1;
		}
		else
			return 0;
	}
	
	public boolean equals(Object o){
		if(this.subtract((Rational) o).getNumerator() == 0){
			return true;
		}
		else
			return false;
	}	
	
	@Override
	public int intValue() {
		// TODO Auto-generated method stub
		return (int)doubleValue();
	}

	@Override
	public long longValue() {
		// TODO Auto-generated method stub
		return (long)doubleValue();
	}

	@Override
	public float floatValue() {
		// TODO Auto-generated method stub
		return (float)doubleValue();
	}

	@Override
	public double doubleValue() {
		// TODO Auto-generated method stub
		return numerator*1.0/denominator;
	}
	//获取n和d的最大公约数(辗转相除法)
	private static long gcd(long n,long d){
		
		long gcdNumber;
		long temp;
		
		if(n>d){
			temp = n;
			n = d;
			d = temp;
		}
		if(d == 0){
			System.out.println("Denominator should not be 0.");
			return 1;
		}
		while((gcdNumber = n%d) != 0){
			n = d;
			d = gcdNumber;
		}
		return d;
	}
}
