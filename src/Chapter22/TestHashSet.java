package Chapter22;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestHashSet {
	public static void main(String[] args){
		//Create a hash set
		Set<String> set = new HashSet<String>();
		//Add strings to the set
		set.add("London");
		set.add("Paris");
		set.add("NewYork");
		set.add("SanFrancisco");
		set.add("Beijing");
		set.add("NewYork");
		
		System.out.println(set);
		
		//Obtain an iterator for the hash set
		Iterator<String> iterator = set.iterator();
		
		//Display the elements in the hash set
		while(iterator.hasNext()){
			System.out.print(iterator.next().toUpperCase()+" ");
		}
	}
}
