public class CollectionsDemo {

	public static void main(String[] args) {
		// Create a GenericList called list
		var list = new GenericList<String>();
		
		var iterator = list.iterator();
		
		while(iterator.hasNext()) {
			var current = iterator.next();
			System.out.println(current);
		}
		
			list.add("Alpha");
			list.add("Beta");
			
			for (var item : list)
				System.out.println(item);

	
	}//end main
}
