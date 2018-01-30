package Chapter24;

public class Heap<E extends Comparable> {
	private java.util.ArrayList<E> list = new java.util.ArrayList<E>();
	
	/*
	 * Create a default heap
	 */
	public Heap(){
	}
	
	/*
	 * Create a heap from an array of objects
	 */
	public Heap(E[] objects){
		for(int i=0;i<objects.length;i++){
			add(objects[i]);
		}
	}
	
	/*
	 * Add a new object into the heap
	 */
	public void add(E newObject) {
		list.add(newObject);//Append to the heap
		int currentIndex = list.size() - 1;//The index of the last node
		
		while(currentIndex > 0){
			int parentIndex = (currentIndex - 1)/2;
			//Swap if the current object is greater than its parent
			if(list.get(currentIndex).compareTo(list.get(parentIndex)) > 0){
				E temp = list.get(currentIndex);
				list.set(currentIndex, list.get(parentIndex));
				list.set(parentIndex, temp);
			}
			else
				break;//The tree is a heap now
			currentIndex = parentIndex;
		}
	}
}
