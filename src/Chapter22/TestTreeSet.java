package Chapter22;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestTreeSet {

	public static void main(String[] args) {
		//Create a hash set
		Set<String> set = new HashSet<String>();
		//Add strings to the set
		set.add("London");
		set.add("Paris");
		set.add("NewYork");
		set.add("SanFrancisco");
		set.add("Beijing");
		set.add("NewYork");
		
		TreeSet<String> treeSet = new TreeSet<String>(set);
		System.out.println("Sorted tree set: "+treeSet);
		
		//Use the methods in SortedSet interface
		System.out.println("first(): "+ treeSet.first());
		System.out.println("last(): "+ treeSet.last());
		System.out.println("headSet(): "+ treeSet.headSet("NewYork"));
		System.out.println("tailSet(): "+ treeSet.tailSet("NewYork"));
		
		//Use the methods in NavigableSet interface
		System.out.println("lower(\"P\"): "+treeSet.lower("Pweerere"));
		System.out.println("higher(\"P\"): "+treeSet.higher("Pweerere"));
		System.out.println("floor(\"P\"): "+treeSet.floor("Pweerere"));
		System.out.println("ceiling(\"P\"): "+treeSet.ceiling("Pweerere"));
		System.out.println("pollFirst(): "+treeSet.pollFirst());
		System.out.println("pollLast(): "+treeSet.pollLast());
		
		System.out.println("New tree set: "+treeSet);
	}

}
