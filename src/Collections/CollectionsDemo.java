package Collections;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionsDemo {

	public static void show() {
		// Create a Collection called collection
		Collection<String> collection = new ArrayList<>();

		// Add items to collection
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

	}// end show()

}// EOF
