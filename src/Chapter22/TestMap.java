package Chapter22;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {

	public static void main(String[] args) {
		Map<String,Integer> hashMap = new HashMap<String,Integer>();
		hashMap.put("Smith", 30);
		hashMap.put("Anderson", 31);
		hashMap.put("Lewis", 29);
		hashMap.put("Cook", 29);
		System.out.println("Display entries in HashMap:");
		System.out.println(hashMap+"\n");
		
		
		Map<String,Integer> treeMap = new TreeMap<String,Integer>(hashMap);
		System.out.println("Display entries in TreeMap");
		System.out.println(treeMap+"\n");
		
		
		Map<String,Integer> linkedHashMap = new LinkedHashMap<String,Integer>(16,0.75f,true);
		linkedHashMap.put("Smith", 30);
		linkedHashMap.put("Anderson", 31);
		linkedHashMap.put("Lewis", 29);
		linkedHashMap.put("Cook", 29);
		
		System.out.println("The age for "+"Lewis is "+linkedHashMap.get("Lewis").intValue());
		System.out.println("The age for "+"Smith is "+linkedHashMap.get("Smith").intValue());
		System.out.println("Display entries in LinkedHashMap");
		System.out.println(linkedHashMap+"\n");
	}

}
