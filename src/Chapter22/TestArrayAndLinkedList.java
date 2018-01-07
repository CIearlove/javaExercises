package Chapter22;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class TestArrayAndLinkedList {

	public static void main(String[] args) {
		List<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(10);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(30);
		arrayList.add(4);
		
		LinkedList<Object> linkedList = new LinkedList<Object>(arrayList);
		linkedList.add(1, "red");
		linkedList.add(1, 'c');
		
		System.out.println("Display the linked list forward:");
		ListIterator<Object> listiterator = linkedList.listIterator();
		while(listiterator.hasNext()){
			System.out.print(listiterator.next()+" ");
		}
		System.out.println();
		
		System.out.println("Display the linked list backward:");
		while(listiterator.hasPrevious()){
			System.out.print(listiterator.previous()+" ");
		}
	}

}
