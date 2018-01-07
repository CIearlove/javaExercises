package Chapter26.BinaryTree;

public interface Tree<E extends Comparable<E>> {
	
	public boolean search(E e);
	
	public boolean insert(E e);
	
	public boolean delete(E e);
	
	public void preorder();
	
	public void inorder();
	
	public void postorder();
	
	public int getSize();
	
	public boolean isEmpty();
	//Return an iterator to traverse elements in the tree.
	public java.util.Iterator iterator();
}
