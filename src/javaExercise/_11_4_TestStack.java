package javaExercise;

public class _11_4_TestStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyStack myStack = new MyStack();
		myStack.push("11111");
		myStack.push("22222");
		myStack.push("33333");
		myStack.push("44444");
		myStack.push("55555");
		
		System.out.println("  "+myStack.pop());
		System.out.println("  "+myStack.getSize());
		System.out.println("  "+myStack.toString());
		System.out.println("  The position of 33333 is:"+myStack.search("33333"));
	}

}
