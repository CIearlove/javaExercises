package Chapter21;

public class IntegerMatrix extends GenericMatrix<Integer>{
	/*
	 * Implement the add method for adding two Integer elements
	 * @see Chapter21.GenericMatrix#add(java.lang.Number, java.lang.Number)
	 */
	@Override
	protected Integer add(Integer o1, Integer o2) {
		
		return o1+o2;
	}
	/*
	 * Implement the multiply method for multiplying two Integer elements
	 * @see Chapter21.GenericMatrix#multiply(java.lang.Number, java.lang.Number)
	 */
	@Override
	protected Integer multiply(Integer o1, Integer o2) {
		
		return o1*o2;
	}
	/*
	 * Implement the zero method to specify zero for Integer
	 * @see Chapter21.GenericMatrix#zero()
	 */
	@Override
	protected Integer zero() {
		
		return 0;
	}

	

}
