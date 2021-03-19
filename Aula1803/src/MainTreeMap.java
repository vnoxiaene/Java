package example;

import java.time.LocalDate;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MainTreeMap {

	public static void main(String[] args) {

		TreeMap<String, String> hashmap = new TreeMap<String, String>();
		
		// Adding values to map
		hashmap.put("c", "value c");
		hashmap.put("x", "value x");
		hashmap.put("a", "value a");
		hashmap.put("k", "value k");
		
		// Getting the value from an key
		System.out.println("Value of key x: " + hashmap.get("x"));
		
		System.out.println("---------------");
		
		// Iterating Map (sorted by alphabetical order of the key by default)
		hashmap.forEach((k, v) -> System.out.println("Key: " + k + " - Value: " + v));
		
		System.out.println("---------------");
		
		// Classic way to iterate using for
		for(Entry<String, String> entry : hashmap.entrySet()) {
			System.out.println("Key: " + entry.getKey() + " - Value: " + entry.getValue());
		}
		
		System.out.println("---------------");
		
		// TreeMap will Throw error if null value used
		try {
			hashmap.put(null, null);
		} catch (Exception e) {
			System.out.println("Exception happen: " + e.getMessage());
		}
		
		System.out.println("---------------");
		
		Car car1 = new Car("FIAT", LocalDate.of(2019, 6, 10));
		Car car2 = new Car("VOLVO", LocalDate.of(2021, 8, 28));
		Car car3 = new Car("FORD", LocalDate.of(2020, 1, 15));
		
		CustomDateComparator customComparator = new CustomDateComparator();
		
		// Map Using Objects
		TreeMap<LocalDate, Car> hashmap2 = new TreeMap<LocalDate, Car>(customComparator);
		hashmap2.put(car1.getBuildDate(), car1);
		hashmap2.put(car2.getBuildDate(), car2);
		hashmap2.put(car3.getBuildDate(), car3);
		
		// Iterating Map (sorted by custom comparator LocalDate)
		hashmap2.forEach((k, v) -> System.out.println("Key: " + k + " - Car Brand: " + v.getBrand()));
	}
}
