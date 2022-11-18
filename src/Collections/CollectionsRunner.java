package Collections;

public class CollectionsRunner {

	public static void main(String[] args) {
		// Intro
		System.out.println("========================");
		System.out.println(Color.RED_BOLD_BRIGHT + "Title: " 
		+ Color.YELLOW_BOLD_BRIGHT + "Collections Demo");
		System.out.println(Color.RED_BOLD_BRIGHT + "Genre: " 
		+ Color.YELLOW_BOLD_BRIGHT + "Java Intermediate");
		System.out.println(Color.RED_BOLD_BRIGHT + "Author:" 
		+ Color.YELLOW_BOLD_BRIGHT + "Peter Broadbent");
		System.out.println(Color.RED_BOLD_BRIGHT + "Language: "
		+ Color.YELLOW_BOLD_BRIGHT +" Java");
		System.out.println(Color.RED_BOLD_BRIGHT + "Version: " 
		+ Color.YELLOW_BOLD_BRIGHT + System.getProperty("java.version")); 
		System.out.println(Color.RED_BOLD_BRIGHT + "Description:" 
		+ Color.YELLOW_BOLD_BRIGHT + "\n\tCollections is an object which can be looped over or "
			+ "\n\titerated over with the help of a for loop."
			+ "\n"
			+ "\n\tOr added using: "
			+ "\n"
			+ Color.CYAN_BOLD_BRIGHT + "\n\tCollections.addAll(collection, \"so\", \"much\", \"quicker\");"
			+ "\n"
			+ Color.YELLOW_BOLD_BRIGHT + "\n\tThen iterated over using: "
			+ "\n"
			+ Color.CYAN_BOLD_BRIGHT + "\n\tSystem.out.println(collection)"
			+ "\n");
		
		System.out.println(Color.RESET);
		
		System.out.println("===================================================================\n");
		System.out.println("");
		// Initiate CollectionsDemo show() method
		CollectionsDemo.show();
	}// end of main()
}// EOF
