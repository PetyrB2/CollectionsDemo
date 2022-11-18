package Iterable;

public class CollectionsDemo {

	public static void main(String[] args) {
		// Intro
		System.out.println("========================");
		System.out.println("Title: Iterable");
		System.out.println("Genre: Java Intermediate");
		System.out.println("Author: Peter Broadbent");
		System.out.println("Language: Java \n" + "Version: " + System.getProperty("java.version"));
		System.out.println("Description:\n\tIterable is an object which can be looped over or "
				+ "\n\titerated over with the help of a for loop."
				+ "\n\tWe create a GenericList class file and implement "
				+ "\n\tthe Iterable interface to for loop through the data. "
				+ "\n\tWe can loop through any List Type using Generics."
				+ "\n\t");
		System.out.println("===================================================================\n");
		System.out.println("");

		
		// Create a GenericList called list
		var list = new GenericList<String>();
		
		var iterator = list.iterator();
		
		while(iterator.hasNext()) {
			var current = iterator.next();
			System.out.println(current);
		}
		
			list.add("Alpha");
			list.add("Beta");
			System.out.println("Printed List");
			System.out.println("------------");
			System.out.println("");
			
			for (var item : list)
				System.out.println(item);
	
	}//end main
}//EOF
