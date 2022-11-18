import java.util.Iterator;

public class GenericList<T> implements Iterable<T> {

	public T[] items = (T[]) new Object[10];
	
	private int count;

	public void add(T item) {
		items[count++] = item;
	}// end of add()

	public T get(int index) {
		return items[index];
	}// end of get()

	@Override
	public Iterator<T> iterator() {
		return new ListIterator(this);
	}//end of Iterator<T>
	



public class ListIterator implements Iterator<T> {

	private GenericList<T> list;
	private int index;
	
	public ListIterator(GenericList<T> list) {
				this.list = list;
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return (index < list.count);
	}

	@Override
	public T next() {
		return list.items[index++];
	}
	
}
	
		

}//end class 
	