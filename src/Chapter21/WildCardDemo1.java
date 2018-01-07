package Chapter21;

public class WildCardDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		GenericStack<Integer> intStack = new GenericStack<Integer>();
		intStack.push(new Integer(1));
		intStack.push(new Integer(2));
		intStack.push(new Integer(3));
		
		System.out.println("The max number is "+max(intStack));
		*/
		GenericStack<Double> doubleStack = new GenericStack<Double>();
		doubleStack.push(new Double(1));
		doubleStack.push(new Double(2));
		doubleStack.push(new Double(3));
		System.out.println("The max number is "+max(doubleStack));
	}
	
	public static double max(GenericStack<? extends Number> stack){
		double max = stack.pop().doubleValue();
		while(!stack.isEmpty()){
			double value = stack.pop().doubleValue();
			if(value>max)
				max = value;
		}
		return max;
	}
	
}
