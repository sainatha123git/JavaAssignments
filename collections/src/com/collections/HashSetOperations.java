package com.collections;
/*3.Create a HashSet with at least 10 elements of type String
 * - Write program covering all the operations of HashSet*/
import java.util.HashSet;
import java.util.Iterator;

public class HashSetOperations {
	public static void main(String[] args) {
		// Create a HashSet of type String
		HashSet<String> stringSet = new HashSet<>();

		// Add elements to the HashSet
		stringSet.add("Audi");
		stringSet.add("volvo");
		stringSet.add("mahindra");
		stringSet.add("tesla");
		stringSet.add("benz");
		stringSet.add("scoda");
		stringSet.add("BMW");
		stringSet.add("Rangerover");
		stringSet.add("Thar");
		stringSet.add("Fortuner");

		// Print the HashSet
		System.out.println("HashSet after adding elements: " + stringSet);

		// a. Add an element to the HashSet
		stringSet.add("Element 11");
		System.out.println("After adding an element: " + stringSet);

		// b. Iterate through the HashSet using Iterator
		Iterator<String> iterator = stringSet.iterator();
		System.out.println("Iterating through the HashSet:");
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		// c. Remove an element from the HashSet
		stringSet.remove("Element 5");
		System.out.println("After removing 'Element 5': " + stringSet);

		// d. Check if an element is present in the HashSet
		boolean containsElement3 = stringSet.contains("Element 3");
		System.out.println("Is 'Element 3' present in the HashSet? " + containsElement3);

		// e. Find out the size of the HashSet
		int size = stringSet.size();
		System.out.println("Size of the HashSet: " + size);

		// f. Clear all elements from the HashSet
		stringSet.clear();
		System.out.println("After clearing all elements: " + stringSet);
	}
}
