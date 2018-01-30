package Chapter24;

public class HeapSort {
	
	/*
	 * Heap sort method
	 */
	
	public static <E extends Comparable> void heapSort(E[] list){
		//Create a Heap of Integers
		Heap<E> heap = new Heap<E>();
		
		//Add elements to the heap
		for(int i=0;i<list.length;i++){
			heap.add(list[i]);
		}
		
	
	}
	public static void main(String[] args) {
	}

}
