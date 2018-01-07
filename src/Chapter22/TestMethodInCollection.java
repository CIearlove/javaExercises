package Chapter22;

import java.util.HashSet;
import java.util.Set;

public class TestMethodInCollection {

	public static void main(String[] args) {
		//Create set1
		Set<String> set1 = new HashSet<String>();
		set1.add("London");
		set1.add("Paris");
		set1.add("NewYork");
		set1.add("SanFrancisco");
		set1.add("Beijing");
		set1.add("NewYork");
		
		System.out.println("set1 is "+set1);
		System.out.println(set1.size()+"elements in set1");
		
		//Delete a string from set1
		set1.remove("London");
		System.out.println("\nset1 is "+set1);
		System.out.println(set1.size()+"elements in set1");
		
		Set<String> set2 = new HashSet<String>();
		set2.add("Shanghai");
		System.out.println("\nset2 is "+set2);
		System.out.println(set2.size()+" elements in set2");
		
		System.out.println("\nIs Taipei in set2? "+set2.contains("Taipei"));
		
		set1.addAll(set2);
		System.out.println("\nAfter adding set2 to set1,set1 is "+set1);
		
		set1.removeAll(set2);
		System.out.println("\nAfter removing set2 from set1,set1 is "+set1);
		
		set1.retainAll(set2);
		System.out.println("\nAfter retaining set2 with set1,set1 is "+set1);
	}

}
