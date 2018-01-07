package Chapter21;

public class WildCardDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericStack<Integer> intStack = new GenericStack<Integer>();
		intStack.push(new Integer(1));
		intStack.push(new Integer(2));
		intStack.push(new Integer(3));
		
		print(intStack);
	}
	
	public static void print(GenericStack<?> stack){
		
		while(!stack.isEmpty()){
			System.out.print(stack.pop()+" ");
		}
	}
	
}
