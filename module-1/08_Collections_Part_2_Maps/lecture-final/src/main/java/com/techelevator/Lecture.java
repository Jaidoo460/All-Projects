package com.techelevator;

import java.util.HashMap;
<<<<<<< HEAD
import java.util.List;
=======
>>>>>>> 69254ec7dd0de7dd13072cdf2768ad0fc66cd00a
import java.util.Map;
import java.util.Set;

public class Lecture {

	public static void main(String[] args) {

		System.out.println("####################");
		System.out.println("        MAPS");
		System.out.println("####################");
		System.out.println();

<<<<<<< HEAD
		Map<String, Integer> mymap = new HashMap<>();
		mymap.put("A", 100);
		mymap.put("B", 90);
		mymap.put("C", 80);

		System.out.println("retrieving 'A' " + mymap.get("A"));
		System.out.println("retrieving 'Z' " + mymap.get("Z"));

		System.out.println("does 'A' exist? " + mymap.containsKey("A"));

		System.out.println("==============");
		for (String key :  mymap.keySet()) {
			System.out.println(key);
		}

		mymap.remove("C");
		System.out.println("==============");
		for (String key :  mymap.keySet()) {
			System.out.println(key);
		}

		System.out.println("==============");
		for (Map.Entry<String, Integer> entry : mymap.entrySet()) {
			System.out.printf("Key: %s Value: %s\n", entry.getKey(), entry.getValue());
		}

		mymap.put("C", 60);
		System.out.println("==============");
		for (Map.Entry<String, Integer> entry : mymap.entrySet()) {
			System.out.printf("Key: %s Value: %s\n", entry.getKey(), entry.getValue());
		}

		mymap.put("C", 70);
		System.out.println("==============");
		for (Map.Entry<String, Integer> entry : mymap.entrySet()) {
			System.out.printf("Key: %s Value: %s\n", entry.getKey(), entry.getValue());
		}

		mymap.put("C", mymap.get("C") + 1);
		System.out.println("==============");
		for (Map.Entry<String, Integer> entry : mymap.entrySet()) {
			System.out.printf("Key: %s Value: %s\n", entry.getKey(), entry.getValue());
		}

		System.out.println("Number of items: " + mymap.size());
		System.out.println("is empty" + mymap.isEmpty() );

//		Map<String, List<Integer>> anotherList = new HashMap<>();

		System.out.println("==============");
		Map<String, Integer> anotherMap = new HashMap<>();
		anotherMap.put("A", 100);
		anotherMap.put("B", 90);
		anotherMap.put("C", 70);

		System.out.println("are the same?" + mymap.equals(anotherMap));

		System.out.println("==============");
		anotherMap.put("C", 71);
		System.out.println("are the same now?" + mymap.equals(anotherMap));

		System.out.println("==============");
		anotherMap.put("D", 60);
		System.out.println("are the same now after new key?" + mymap.equals(anotherMap));

//		Map<String, Map<String, Integer>> oneMoreMap = new HashMap<>();
//		Map<String, Integer> innerMap = oneMoreMap.get("A");
//		innerMap.get("Z");
//
//		Integer theInnerValue = oneMoreMap.get("A").get("Z");

		String theKey = "HeLlO wOrLD";
		mymap.put(theKey.toLowerCase(), 0);

		System.out.println("==============");
		String theRequestedKey = "HELLO WORLD";
		System.out.println("does the key exist? " + mymap.containsKey(theRequestedKey));

		System.out.println("==============");
		System.out.println("does the key exist? " + mymap.containsKey(theRequestedKey.toLowerCase()));
=======
		// Declaring and initializing a Map
		Map<String, String> nameToZip = new HashMap<String, String>();

		// Adding an item to a Map
		nameToZip.put("David", "44120");
		nameToZip.put("Dan", "44124");
		nameToZip.put("Elizabeth", "44012");

		// Retrieving an item from a Map
		System.out.println("David lives in " + nameToZip.get("David"));
		System.out.println("Dan lives in " + nameToZip.get("Dan"));
		System.out.println("Elizabeth lives in " + nameToZip.get("Elizabeth"));
		System.out.println();

		// Retrieving just the keys from a Map
		System.out.println("We can also retrieve a list of keys and iterate over them using a for loop:");

		//*** Note to instructor:
		//*** The return type of `Map<String, String>.keySet()` is a `Set<String>`. Keys are required to be unique 
		//*** and sets guarantee uniqueness.
		Set<String> keys = nameToZip.keySet(); // returns a Collection of all of the keys in the Map
		for (String name : keys) {
			System.out.println(name + " lives in " + nameToZip.get(name));
		}
		System.out.println();

		// Check to see if a key already exists
		if (nameToZip.containsKey("David")) {
			System.out.println("David exists");
		}
		System.out.println();

		System.out.println("set 12345 for key David");
		nameToZip.put("David", "12345"); // If key already exists, value is updated, otherwise key-value added

		// Iterate through the key-value pairs in the Map
		for (Map.Entry<String, String> nameZip : nameToZip.entrySet()) {
			System.out.println(nameZip.getKey() + " lives in " + nameZip.getValue());
		}
		System.out.println();

		// Remove an element from the Map
		nameToZip.remove("David");
		System.out.println("removed David");
		System.out.println();

		// loop through again to show David was removed
		for (Map.Entry<String, String> nameZip : nameToZip.entrySet()) {
			System.out.println(nameZip.getKey() + " lives in " + nameZip.getValue());
		}
		System.out.println();
>>>>>>> 69254ec7dd0de7dd13072cdf2768ad0fc66cd00a

	}

}
