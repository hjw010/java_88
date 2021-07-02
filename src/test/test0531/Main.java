package test.test0531;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class Main {
	
	public static void main(String[] args) {
		Book[] book = {
				new Book(101,"기러기의 꿈","기러기"),
				new Book(102,"갈매기 꿈","갈매기"),
				new Book(103,"참새 꿈","참새")
		};
		BookArrayList bookList = new BookArrayList();
		for (int i = 0; i < book.length; i++) {
			bookList.add(book[i]);
		}
		bookList.showAllBook();
		System.out.println();
		bookList.delete(103);
		bookList.showAllBook();
		System.out.println();
		
		System.out.println("============dream========");
		List<String> dreamList = new ArrayList<String>();
		String[] dreams = {
						"건물주",
						"해외이주",
						"근골45체지방10"
		};
		
		for (int i = 0; i < dreams.length; i++) {
			dreamList.add(dreams[i]);
		}
		
		Iterator iterator = dreamList.iterator();
		while(iterator.hasNext()) {
			String dream = (String)iterator.next();
			System.out.print( dream + ", ");
		}
		
	}

}
