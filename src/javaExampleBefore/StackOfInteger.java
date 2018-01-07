package javaExampleBefore;
public class StackOfInteger {
	
	private int[] elements;
	
	public int[] getElements() {
		return elements;
	}

	private int size;
	public static final int DEFAULT_CAPACITY = 4;
	
	public StackOfInteger(){
		this(DEFAULT_CAPACITY);
	}
	
	public StackOfInteger(int capacity){
		elements = new int[capacity];
	}
	
	public boolean empty(){
		if(size == 0)
			return true;
		return false;
	}
	
	public int peek(){
		return elements[size-1];
	}
	//ÈëÕ»
	public void push(int value){
		if(size>=elements.length){
			int [] temp = new int [elements.length*2];
			System.arraycopy(elements, 0, temp, 0, elements.length);
			elements = temp;
		}
		elements[size] = value;
		size++;
	}
	//³öÕ»
	public int pop(){
		int temp;
		temp = elements[size-1];
		size--;
		return temp;
	}
	
	public int getSize() {
		return size;
	}

}
