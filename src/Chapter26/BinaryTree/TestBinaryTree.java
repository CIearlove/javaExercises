package Chapter26.BinaryTree;

import java.util.ArrayList;

import Chapter26.BinaryTree.BinaryTree;

public class TestBinaryTree {
	public static void main(String[] args){
		Integer[] number = {2,4,3,1,8,5,6,7};
		BinaryTree<Integer> btree = new BinaryTree<Integer>(number);
		btree.preorder();
		ArrayList<TreeNode<Integer>> list = btree.path(9);
		System.out.println();
		for(int i=0;i<list.size();i++){
			System.out.print(list.get(i).element+" ");
		}
		BinaryTree<String> tree = new BinaryTree<String>();
		tree.insert("George");
		tree.insert("Michael");
		tree.insert("Tom");
		tree.insert("Adam");
		tree.insert("Jones");
		tree.insert("Peter");
		tree.insert("Daniel");
		
		ArrayList<TreeNode<String>> list1 = tree.path("Peter");
		System.out.println();
		for(int j=0;j<list1.size();j++){
			System.out.print(list1.get(j).element+" ");
		}
	}
	
}
