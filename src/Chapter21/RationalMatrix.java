package Chapter21;

import javaExample.Rational;

public class RationalMatrix extends GenericMatrix<Rational> {
	
	/*
	 * Implement the multiply method for multiplying two Rational elements
	 */
	@Override
	protected Rational add(Rational o1, Rational o2) {
		
		return o1.add(o2);
	}
	/*
	 * Implement the multiply method for multiplying two Rational elements
	 */
	@Override
	protected Rational multiply(Rational o1, Rational o2) {
		// TODO Auto-generated method stub
		return o1.multiply(o2);
	}
	/*
	 * Implement the zero method to specify zero for Rational
	 */
	@Override
	protected Rational zero() {
		// TODO Auto-generated method stub
		return new Rational(0,1);
	}

}
