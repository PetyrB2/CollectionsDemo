package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class MoreCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> people = new ArrayList<>();

		Collections.addAll(people, "John", "Dave", "Jane");

		if (people.contains("John")) {
			System.out.println("The ArrayList contains 'John'");
		} else {
			System.out.println("'John' was not found in the ArrayList");
		}

		// Begin If Else
		if (people.isEmpty()) {
			System.out.println("The ArrayList is Empty");
		} else {
			System.out.println("The ArrayList still has data");
		} // end else

		System.out.println("");
		System.out.println("Creating LinkedList");

		LinkedList<Integer> list = new LinkedList<>();
		System.out.println("List Offer 1,2,3");
		list.offer(1);
		list.offer(2);
		list.offer(3);

		System.out.println("");

		System.out.println("Polling LinkedList");
		System.out.println("\t" + list.poll());
		System.out.println("\t" + list.poll());
		System.out.println("\t" + list.poll());
		System.out.println("\t" + list.poll());
		
		list.push(4);
		list.push(65);
		list.push(733);
		
		System.out.println("");
		System.out.println("Re-Polling LinkedList after a push");
		System.out.println("\t" + list.poll());
		System.out.println("\t" + list.poll());
		System.out.println("\t" + list.poll());
		System.out.println("\t" + list.poll());
		System.out.println("\t" + list.poll());
		System.out.println("\t" + list.poll());
		
		list.offer(1);
		list.offer(2);
		list.offer(3);
		list.offer(4);
		list.offer(5);
		list.offer(6);
				
		System.out.println("");
		System.out.println("Last Poll of LinkedList after final offers");
		System.out.println("\t" + list.poll());
		System.out.println("\t" + list.poll());
		System.out.println("\t" + list.poll());
		System.out.println("\t" + list.poll());
		System.out.println("\t" + list.poll());
		System.out.println("\t" + list.poll());

		System.out.println("Pop List");
		
		System.out.println(list.pop(3));
		
		// Clear the LinkedList
		System.out.println("\nClearing LinkedList");
		System.out.println("");

		list.clear();

		if (list.isEmpty()) {
			System.out.println("The LinkedList is Empty");
		} // end if
		else {
			System.out.println("The LinkedList still has data");
		} // end else

		System.out.println("\n\n---");
		System.out.println("EOF");

	}// end main

}// EOF
