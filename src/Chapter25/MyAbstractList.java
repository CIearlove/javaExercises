package Chapter25;

public abstract class MyAbstractList<E> implements MyList<E> {
	protected int size = 0;//The size of the list.
	
	/*
	 * Create a default list
	 */
	protected MyAbstractList(){
		
	}
	/*
	 * Create a list from an array of objects
	 */
	protected MyAbstractList(E[] objects){
		for(int i=0;i<objects.length;i++){
			add(objects[i]);
		}
	}
	/*
	 * Add a new element at the end of this list
	 * @see Chapter25.MyList#add(java.lang.Object)
	 */
	public void add(E e){
		add(size,e);
	}
	/*
	 * Return true if this list contains no elements.
	 * @see Chapter25.MyList#isEmpty()
	 */
	public boolean isEmpty(){
		return size==0;
	}
	/*
	 * Return the number of the elements in this list.
	 * @see Chapter25.MyList#size()
	 */
	public int size(){
		return size;
	}
	/*
	 * Remove the first occurrence of the element o from this list.
	 * Shift any subsequent elements to the left.
	 * Return true if the element is removed.
	 * @see Chapter25.MyList#remove(java.lang.Object)
	 */
	public boolean remove(E e){
		if(indexOf(e)>=0){
			remove(indexOf(e));
			return true;
		}
		else
			return false;
	}
}
