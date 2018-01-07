package Chapter26.BinaryTree;

public class TestBinaryTreeDelete {

	public static void main(String[] args) {
		BinaryTree<String> tree = new BinaryTree<String>();
		tree.insert("George");
		tree.insert("Michael");
		tree.insert("Tom");
		tree.insert("Adam");
		tree.insert("Jones");
		tree.insert("Peter");
		tree.insert("Daniel");
		printTree(tree);
		
		System.out.println("\nAfter delete George:");
		tree.delete("Tom");
		printTree(tree);
	}
	
	public static  void printTree(BinaryTree tree){
		//Traverse tree
		System.out.print("Inorder(sorted): ");
		tree.inorder();
		System.out.print("\nPostorder: ");
		tree.postorder();
		System.out.print("\nPreorder: ");
		tree.preorder();
		System.out.print("\nThe number of node is "+tree.getSize());
		System.out.println();
	}
}
