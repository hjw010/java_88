package ch09;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class _03_Book {

	private String bookName;
	private String author;
	
	public _03_Book() {
	}
	public _03_Book(String bookName, String author) {
		this.bookName = bookName;
		this.author = author;
	}
	
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getBookName() {
		return bookName;
	}
	public String getAuthor() {
		return author;
	}
	@Override
	public String toString() {
		return "책제목 : " +bookName + ", 작가 : " +author;
	}
	
	public static void main(String[] args) {
		List<_03_Book> list = new ArrayList<_03_Book>();
		
		list.add(new _03_Book("기러기의 꿈" ,"기러기"));
		list.add(new _03_Book("갈매기의 꿈" ,"갈매기"));
		list.add(new _03_Book("건물주의 꿈" ,"건물주"));
		list.add(new _03_Book("짐승의 꿈" ,"짐승"));
		list.add(new _03_Book("무야호의 꿈" ,"무야호"));
		
		for(int i = 0; i<list.size(); i++) {
			 System.out.println(list.get(i));
		}
		
		System.out.println("=============================");
		for(_03_Book book : list) {
			System.out.println(book);
		}
		
		System.out.println("=============================");
		Iterator iterator = list.iterator();
		while(iterator.hasNext()) {
			_03_Book book = (_03_Book)iterator.next();
			System.out.println(book);
		}
		
		
		
		
		
		
		
	}

}
