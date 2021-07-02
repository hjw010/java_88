package z_prac;

import java.util.ArrayList;
import java.util.List;

public class Guest {

	private static Guest g = new Guest();
	// private static List<Book> list = new ArrayList<Book>();
	List<Book> list;

	public void getBookList() {
		list = new ArrayList<Book>();
	}

	public void print() {
		for (Book b : list) {
			System.out.println(b);
		}
	}

	public void add(Book b) {
		list.add(b);
	}

	private Guest() {
	}

	public static Guest getInstance() {
		return g;
	}

	public static void main(String[] args) {

		
		Book b = new Book("dd", "Ddd");
		Guest g = Guest.getInstance();
		g.add(b);
		/*
		g.print();
		System.out.println();
		*/

		Host h = Host.getInstacne();
		h.print();
	}

}

class Host {

	private static Host h = new Host();
	Guest g = Fac.instance();
	private Host() {
	}

	public void add(String str) {
	}

	public void print() {
		g.print();
	}

	public static Host getInstacne() {  
		return h;
	}

}

class Fac {

	public static Guest instance() {

		return Guest.getInstance();
	}
}

class Book {
	String name;
	String author;

	public Book(String name, String author) {
		super();
		this.name = name;
		this.author = author;
	}

	@Override
	public String toString() {
		return name + author;
	}
}