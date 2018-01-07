package javaExampleBefore;
public class TestStackOfIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackOfInteger stack = new StackOfInteger();
		
		for(int i=0;i<10;i++){
			stack.push(i);
			System.out.println(stack.getElements()[i]);
		}
		
		if(!stack.empty()){
			
			System.out.println("These numbers were deleted:");
			
			for(int i=0;i<6;i++){
				System.out.println(stack.pop());
			}
		}
		
		if(!stack.empty()){
			System.out.println("The remains:");
			
			for(int i=0;i<stack.getSize();i++){
				System.out.println(stack.getElements()[i]);
			}
		}	
	}
}
