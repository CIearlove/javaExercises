package Chapter22;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class CountOccurenceOfWords {

	public static void main(String[] args) {
		String text = "Good morning.Have a good class."+"Have a good visit.Have fun!";
		//Create a TreeMap to hold words as key and count as value
		TreeMap<String,Integer> map = new TreeMap<String,Integer>();
		
		String[] words = text.split("[ \n\t\r.,;:!?(){}]");
		for(int i=0;i<words.length;i++){
			String key = words[i].toLowerCase();
			
			if(key.length()>0){
				if(map.get(key)==null){
					map.put(key, 1);
				}
				else{
					int values = map.get(key);
					values++;
					map.put(key, values);
				}	
			}
		}
/*		
		//Get all entries into a set--book solution
		Set<Map.Entry<String,Integer>> entrySet = map.entrySet();
		//Get key and value from each entry
		for(Map.Entry<String,Integer> entry:entrySet){
			System.out.println(entry.getKey()+" :"+entry.getValue()+"\n");
		}
*/		//my solution
		Collection<String> entryKey = (Collection<String>) map.keySet();
		Collection<Integer> entryValue = (Collection<Integer>) map.values();
		Iterator<String> keyIterator = entryKey.iterator();
		Iterator<Integer> valueIterator = entryValue.iterator();
		
		while(keyIterator.hasNext()&&valueIterator.hasNext()){
			System.out.println(keyIterator.next()+": "+valueIterator.next());
		}
	}

}
