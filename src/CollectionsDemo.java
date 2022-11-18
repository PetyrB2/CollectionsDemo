
import java.GenericList;

public class CollectionsDemo {

	
	
	public static void main(String[] args) {
		var list = new GenericList<String>();
			list.add("Alpha");
			list.add("Beta");
			
			for (var item : list.items)
				System.out.println(item);
	}
}
