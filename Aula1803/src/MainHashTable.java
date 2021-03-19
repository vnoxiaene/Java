package example;

import java.util.Hashtable;

public class MainHashTable {

	public static void main(String[] args) {

		Hashtable<String, String> hashmap = new Hashtable<String, String>();
		
		// Adding values to map
		hashmap.put("c", "value c");
		hashmap.put("x", "value x");
		hashmap.put("a", "value a");
		hashmap.put("k", "value k");
		
		// Getting the value from an key
		System.out.println("Value of key x: " + hashmap.get("x"));
		
		System.out.println("---------------");
		
		// Iterating Map (not sorted)
		hashmap.forEach((k, v) -> System.out.println("Key: " + k + " - Value: " + v));
		
		System.out.println("---------------");
		
		// Check if map contains key
		System.out.println("Contains key X: " + hashmap.containsKey("x"));
		
		// Removing element from map based on a key
		hashmap.remove("x");
		
		// Check if map contains key
		System.out.println("Contains key X: " + hashmap.containsKey("x"));
		
		System.out.println("---------------");
		
		// Iterating Map (removed x)
		hashmap.forEach((k, v) -> System.out.println("Key: " + k + " - Value: " + v));
		
		System.out.println("---------------");
		
		// Replace Value
		hashmap.replace("k", "value k replaced");
		
		System.out.println("Value of key k: " + hashmap.get("k"));
		
		System.out.println("---------------");
		
		// Hashtable will Throw error if null value used
		try {
			hashmap.put(null, null);
		} catch (Exception e) {
			System.out.println("Exception happen: " + e.getMessage());
		}
	}
}
