package com.collections;
import java.util.ArrayList;
import java.util.Iterator;

/*Create an ArrayList of type String with 10 string elements. Add 10 string elements to
ArrayList and perform the below operations
a. Add an element to the ArrayList
b. Iterate through the ArrayList by using Iterator object
c. Add an element at a specific index
d. Remove an element from the ArrayList, Remove at an index
e. Update the element at a specific index
f. Check the element is present at a particular index
g. Get an element at a particular index
h. Find out the size of the ArrayList
i. Check the given element is present in the ArrayList
j. Remove all elements of the ArrayList*/
public class ArrayListOperations {
    public static void main(String[] args) {
        // Create an ArrayList of type String with 10 string elements
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("IBM");
        stringList.add("Accenture");
        stringList.add("Google");
        stringList.add("Microsoft");
        stringList.add("Capgemini");
        stringList.add("cgi");
        stringList.add("tesla");
        stringList.add("ADP");
        stringList.add("HCL");
        stringList.add("HP");

        // a. Add an element to the ArrayList
        stringList.add("Element 11");
        System.out.println("After adding an element: " + stringList);

        // b. Iterate through the ArrayList by using Iterator object
        Iterator<String> iterator = stringList.iterator();
        System.out.println("Iterating through the ArrayList:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // c. Add an element at a specific index
        stringList.add(5, "New Element");
        System.out.println("After adding an element at index 5: " + stringList);

        // d. Remove an element from the ArrayList, Remove at an index
        stringList.remove("Element 7"); // Remove by element
        System.out.println("After removing 'Element 7': " + stringList);
        stringList.remove(2); // Remove by index
        System.out.println("After removing element at index 2: " + stringList);

        // e. Update the element at a specific index
        stringList.set(4, "Updated Element");
        System.out.println("After updating element at index 4: " + stringList);

        // f. Check the element is present at a particular index
        String elementAtIndex5 = stringList.get(5);
        System.out.println("Element at index 5 is: " + elementAtIndex5);

        // g. Get an element at a particular index
        String elementAtIndex3 = stringList.get(3);
        System.out.println("Element at index 3 is: " + elementAtIndex3);

        // h. Find out the size of the ArrayList
        int size = stringList.size();
        System.out.println("Size of the ArrayList: " + size);

        // i. Check the given element is present in the ArrayList
        boolean containsElement = stringList.contains("Element 5");
        System.out.println("Is 'Element 5' present in the ArrayList? " + containsElement);

        // j. Remove all elements of the ArrayList
        stringList.clear();
        System.out.println("After removing all elements: " + stringList);
    }
}

