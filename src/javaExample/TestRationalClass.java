package javaExample;

public class TestRationalClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rational r1 = new Rational(1,4);
		Rational r2= new Rational(2,3);
		System.out.println(r1.toString());
		System.out.println(r2.toString());
		System.out.println(r1.divide(r2).toString());
		System.out.println(r1.multiply(r2).toString());
		System.out.println(r1.add(r2).toString());
		System.out.println(r1.subtract(r2).toString());
		System.out.println(r1.compareTo(r2));
		System.out.println(r1.equals(r2));
	}
}
