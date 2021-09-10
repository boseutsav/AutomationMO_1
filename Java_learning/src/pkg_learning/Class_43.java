package pkg_learning;

import java.util.HashMap;

public class Class_43 {

/* HashMap is a Map based collection class that is used for storing Key & value 
 * HashMap maintains key and value pairs and often denoted as HashMap<Key, Value> HashMap<K, V>.
 * HashMap methods are unsynchornized and it allows null key and null values unlike HashTable.*/

	public static void main(String[] args) {
		HashMap<Integer, String>hmap = new HashMap<Integer, String>(); 
		HashMap<String, Integer>hmap2 = new HashMap<String, Integer>();
		hmap2.put("Test",12);
		hmap2.put("Test1",1); 
		hmap.put(5, "Test2"); 
		hmap.put(9, "Test3");
		hmap.put(4, "Test4");
		hmap.put(2, "Test5");
		System.out.println (hmap2);
		System.out.println (hmap.get(3));
		System.out.println (hmap.values()); 
		System.out.println (hmap.keySet());
		hmap2.remove("Test");
		System.out.println (hmap2.values()); 
		System.out.println (hmap2.keySet());
		System.out.println (hmap2);

	}

}
