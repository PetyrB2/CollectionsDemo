package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionsDemo {

	public static void show() {
		// Create a Collection called collection
		Collection<String> collection = new ArrayList<>();

		// Add items to collection the slow way

		System.out.println("Adding items to collection...");
		System.out.println("");

		collection.add("Alpha");
		collection.add("Beta");
		collection.add("Gamma");
		collection.add("Delta");

		System.out.println("");
		System.out.println("For Loop of Collection");
		System.out.println("======================");
		// for loop
		for (var item : collection)
			System.out.println(item);

		// Quicker and better way to add multiple items to a collection
		Collections.addAll(collection, "so", "much", "quicker");
		System.out.println("");
		System.out.println("Collection after adding using other method");
		System.out.println("");
		System.out.println(collection);

		System.out.println("Removing 'so' from collection...");
		System.out.println("");
		collection.remove("so");
		System.out.println("New collection");
		System.out.println("--------------");
		System.out.println(collection);
		System.out.println("");

		// Does collection Container a Char or String
		System.out.println("Does collection contain an 'A' ?");
		var containsA = collection.contains("A");
		System.out.println("\n\t" + containsA);
		System.out.println("");
		System.out.println("Does collection contain an 'm' ?");
		var contains_m = collection.contains("m");
		System.out.println("\n\t" + contains_m);

		System.out.println("Not sure why this breaks -- should be True");

		// Emptying colleciton is the clear() method
		System.out.println("");
		System.out.println("Emptying collection....");
		collection.clear();
		System.out.println("");
		System.out.println("Is collection empty?");
		System.out.println("\t" + collection.isEmpty());
		System.out.println("");

		Collection<String> other = new ArrayList<>();
		other.addAll(collection);

		System.out.println("Are the two collections '=='");
		System.out.println("\n\t" + (collection == other));
		System.out.println("");
		System.out.println("Are the two collections 'equal'");
		System.out.println("\n\t" + collection.equals(other));

	}// end show()

}// EOF
